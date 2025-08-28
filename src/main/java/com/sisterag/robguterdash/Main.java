package com.sisterag.robguterdash;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import com.sisterag.robguterdash.util.ConfirmBox;

public class Main extends Application {


    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage frstStage) throws IOException {
        String sPath = "com/sisterag/robguterdash/Mensajes";
        ResourceBundle rb = ResourceBundle.getBundle(sPath, Locale.getDefault());
        String sUrl = "/com/sisterag/robguterdash/vistas/mainview.fxml";
        AnchorPane oAncPn = FXMLLoader.load(getClass().getResource(sUrl), rb);
        Scene scene = new Scene(oAncPn);

        URL btrapUrl = getClass().getResource("estilos/bootstrapfx.css"); // Asumiendo que está en el classpath o res
        URL cssUrl = getClass().getResource("estilos/Black.css"); // Asumiendo que está en el classpath o res
        if (btrapUrl == null) {
            btrapUrl = new File("path/to/bootstrapfx.css").toURI().toURL(); // Otra ruta posible
            cssUrl = new File("path/to/Black.css").toURI().toURL(); // Otra ruta posible
        }

        frstStage.setTitle(rb.getString("sistTitle"));
        scene.getStylesheets().add(btrapUrl.toExternalForm()); // Aplica el CSS
        scene.getStylesheets().add(cssUrl.toExternalForm()); // Aplica el CSS
        frstStage.setScene(scene);
        //frstStage.setMaximized(true);
        frstStage.setFullScreen(true);

        // Crear un ScrollPane
        ScrollPane scrollPane = new ScrollPane();
        // Establecer la política para mostrar la barra vertical
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        frstStage.setOnCloseRequest(e -> {
            e.consume();
            closeWindow();
        });
        frstStage.show();
    }

    private void closeWindow() {
        String sTit = "Confirme su respuesta";
        String sMsj = "Realmente desea salir?";
        boolean bResp = ConfirmBox.display(sTit,sMsj);
        if (bResp) {
            System.exit(0);
        }
    }

}
