module com.sisterag.robguterdash {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    requires java.desktop;
    requires javafx.graphics;

    requires javafx.base;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires org.json;
    requires com.google.gson;
    requires com.jfoenix;

    opens com.sisterag.robguterdash to javafx.fxml;
    exports com.sisterag.robguterdash;
    exports com.sisterag.robguterdash.controller;
    opens com.sisterag.robguterdash.controller to javafx.fxml;
}