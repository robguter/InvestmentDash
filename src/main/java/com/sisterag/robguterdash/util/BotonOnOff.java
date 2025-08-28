package com.sisterag.robguterdash.util;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class BotonOnOff extends StackPane {
    public Rectangle back = null;
    public final Button button = new Button();
    public final Text texto = new Text();
    public String btnStylOff = "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.52), 0.2, 0.0, 0.0, 2); -fx-background-color: WHITE; -fx-cursor: hand";
    public String btnStyleOn = "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.52), 0.2, 0.0, 0.0, 2); -fx-cursor: hand;";
    public String bckStyle = "-fx-cursor: hand";
    public String txtStyle = "-fx-fill: rgba(255,255,255,.5); -fx-font-family: verdana; -fx-font-size: 16; -fx-font-weight: normal; -fx-cursor: hand";
    public String txtStylT = "-fx-fill: rgba(255,255,255,1); -fx-font-family: verdana; -fx-font-size: 16; -fx-font-weight: bold; -fx-cursor: hand";

    //BarraProgreso bp = new BarraProgreso(5, 0);
    //public Boolean state = false;

    private final BooleanProperty state = new SimpleBooleanProperty(this, "state", false);

    public boolean getState() {
        return state.get();
    }

    public final void setState(Boolean value) {
        this.state.set(value);
        if (this.getState()) {
            this.button.setStyle(btnStyleOn);
            this.back.setFill(Color.valueOf("rgba(0,127,127,1)"));
            setAlignment(button, Pos.CENTER_RIGHT);
            this.texto.setStyle(txtStylT);
            if (this.getNombre().equals("btnLengua")) {
                this.texto.setText("Español");
            }
        } else if (!this.getState()) {
            this.button.setStyle(btnStylOff);
            this.back.setFill(Color.valueOf("rgba(50,60,65,.85)"));
            setAlignment(button, Pos.CENTER_LEFT);
            this.texto.setStyle(txtStyle);
            if (this.getNombre().equals("btnLengua")) {
                this.texto.setText("English");
            }
        }
        System.out.println(this.getState());
    }

    public final BooleanProperty stateProperty() {
        return state;
    }

    private final StringProperty nombre = new SimpleStringProperty(this, "nombre", "?");

    public String getNombre() {
        return nombre.get();
    }

    public final void setNombre(String value) {
        nombre.set(value);
    }

    public final StringProperty nombreProperty() {
        return nombre;
    }

    private void init(int anc, int alto, String lang, String nmbr) {
        back = new Rectangle(anc, alto, Color.GREEN);
        this.setNombre(nmbr);
        this.getChildren().addAll(back, texto, button);
        this.setMinSize(anc, alto);
        this.setPrefSize(anc, alto);
        this.setMaxSize(anc, alto);
        this.back.setArcHeight(back.getHeight());
        this.back.setArcWidth(back.getHeight());
        this.back.setFill(Color.valueOf("rgba(50,60,65,.85)"));
        this.back.setStroke(Color.valueOf("#FeF5Fa"));
        this.back.setStrokeWidth(1);
        this.back.setStyle(bckStyle);
        setAlignment(back, Pos.CENTER_LEFT);
        this.texto.setStyle(txtStyle);
        this.texto.setText(lang);
        setAlignment(texto, Pos.CENTER);
        //Double r = 2.0;
        this.button.setShape(new Circle(alto));
        setAlignment(button, Pos.CENTER_LEFT);
        int dAlto = alto - 2;
        this.button.setMaxSize(dAlto, dAlto);
        this.button.setMinSize(dAlto, dAlto);
        this.button.setStyle(btnStylOff);
        //int i = 0;
        this.button.setBorder(new Border(new BorderStroke(Color.WHITE,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.EMPTY.DEFAULT)));
    }
    public BotonOnOff(int anc, int alto, String lang, String nmbr) {
        back = new Rectangle(anc, alto, Color.RED);
        init(anc, alto, lang, nmbr);
    }


}