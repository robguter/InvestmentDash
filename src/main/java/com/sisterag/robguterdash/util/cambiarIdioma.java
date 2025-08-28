package com.sisterag.robguterdash.util;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

import static javax.swing.JComponent.getDefaultLocale;


public class cambiarIdioma extends Properties {
    private static final ObjectProperty<Locale> locale;
    static {
        locale = new SimpleObjectProperty<>(getDefaultLocale());
        locale.addListener((observable, oldValue, newValue) -> Locale.setDefault(newValue));
    }

    public cambiarIdioma(String idioma) throws IOException, InterruptedException {
        String sPath = "Mensajes";
        switch(idioma){
            case "Ing":
                Locale.setDefault(new Locale("en", "EN"));
                break;
            case "Esp":
                Locale.setDefault(new Locale("es", "ES"));
                break;
            default:
                Locale.setDefault(new Locale("es", "VE"));
                break;
        }
        ResourceBundle rb = ResourceBundle.getBundle(sPath,Locale.getDefault());
        Parent root = FXMLLoader.load(getClass().getResource("/com/sisterag/robguterdash/vistas/main.fxml"), rb);
        /*Main main = new Main();
        Scene scene = new Scene(root);*/
        /*main.stage.setScene(scene);
        main.stage.show();*/
    }

    /**
     * gets the string with the given key from the resource bundle for the current locale and uses it as first argument
     * to MessageFormat.format, passing in the optional args and returning the result.
     * @param key   *         message key
     * @param args  *         optional arguments for the message
     * @return localized formatted string
     */
    public static String get(final String key, final Object... args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", getLocale());
        return MessageFormat.format(bundle.getString(key), args);
    }
    /**
     * creates a String binding to a localized String for the given message bundle key
     * @param key   *         key
     * @return String binding
     */
    public static StringBinding createStringBinding(final String key, Object... args) {
        return Bindings.createStringBinding(() -> get(key, args), locale);
    }
    /**
     * creates a String Binding to a localized String that is computed by calling the given func
     * @param func  *         function called on every change
     * @return StringBinding
     */
    public static StringBinding createStringBinding(Callable<String> func) {
        return Bindings.createStringBinding(func, locale);
    }
    public static ObjectProperty<Locale> localeProperty() {
        return locale;
    }
    public static Locale getLocale() {
        return locale.get();
    }
    /**
     * creates a bound Button for the given resourcebundle key
     * @param key   *         ResourceBundle key
     * @param args  *         optional arguments for the message
     * @return Button
     */
    /*public static JFXButton buttonForKey(final String key, final Object... args) {
        JFXButton button = new JFXButton();
        button.textProperty().bind(createStringBinding(key, args));
        return button;
    }*/
}
