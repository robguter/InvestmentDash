package com.sisterag.robguterdash.util;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class AlertBox {

    public static void display(String Title, String Msj) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(Title);
        window.setMinWidth(400);
        window.setMinHeight(150);

        Label oEtiq = new Label();
        oEtiq.setText(Msj);
        oEtiq.getStyleClass().add("etiquetab");

        Button btnClose = new Button("Close the Window");
        btnClose.setOnAction(e->window.close());
        btnClose.getStyleClass().add("boton");

        VBox layout = new VBox(20);
        layout.getChildren().addAll(oEtiq,btnClose);
        layout.setAlignment(Pos.CENTER);
        layout.getStyleClass().add("ventanab");

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}