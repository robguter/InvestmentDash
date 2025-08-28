package com.sisterag.robguterdash.controller;

import com.jfoenix.controls.JFXButton;
import com.sisterag.robguterdash.util.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ContentDisplay;

import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainController extends Application implements Initializable {

    @FXML
    public ProgressIndicator pbIndi;


    private ResourceBundle Mensaje;

    /*private ResourceBundle bundle;*/
    AnchorPane srcPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/sisterag/robguterdash/vistas/inicio.fxml")));

    private final Double dAncho = this.srcPane.getWidth();

    String strPath, strTitle = "";

    @FXML
    BotonOnOff btnLengua = new BotonOnOff(140,25, "Language","btnLengua");

    @FXML
    BotonOnOff btnCambio = new BotonOnOff(140,25, "Cambio", "btnCambio");

    @FXML
    BotonOnOff btnActivo = new BotonOnOff(140,25, "Activo","btnActivo");

    @FXML
    private Pane pnlIzq;

    @FXML
    private VBox vbxPnlIzq, vbxBusca;

    @FXML
    private JFXButton btnMenu, btnCartOpt, btnAnaCartOpt,
            btnRastrea, btnPondera, btnClose;

    @FXML
    private FontIcon aweMnu, aweCrt, aweAna, aweRst, awePnd;

    @FXML
    private FontIcon awePln, aweGsi, aweCnb, aweCmg, aweCnf, aweExt;

    @FXML
    private Pane pnlSup;

    @FXML
    private ScrollPane pnlCntn;

    BarProgreso BP = new BarProgreso();
    String lcldfl = Locale.getDefault().toString();
    double a1, a3 = 0.0;
    Integer iCount = 0;

    //ResourceBundle bundle = ResourceBundle.getBundle("main/resources/Bundle");
    Boolean bVlr=false;

    public MainController() throws IOException {
    }

    /**************/
    boolean mousePressed = false;

    public void setMousePressed(boolean mousePressed) {
        this.mousePressed = mousePressed;
    }
    public boolean isMousePressed() {
        return mousePressed;
    }
    /******************/
    @FXML
    HBox hbxPB;
    @FXML
    public void handleClick(ActionEvent e) throws IOException {
        String url = "";
        if (e.getSource() == btnMenu) {
            ajstMnu();
            return;
        }else if (e.getSource() == btnCartOpt) {
            url = "/com/sisterag/robguterdash/vistas/cartopt.fxml";
            strTitle = "Cartera Óptima";
        }else if (e.getSource() == btnAnaCartOpt) {
            url = "/com/sisterag/robguterdash/vistas/anacartopt.fxml";
            strTitle = "Análisis Cartera Óptima";
        }else if (e.getSource() == btnRastrea) {
            url = "/com/sisterag/robguterdash/vistas/rastrea.fxml";
            strTitle = "Rastreador";
        }else if (e.getSource() == btnPondera) {
            url = "/com/sisterag/robguterdash/vistas/pondera.fxml";
            strTitle = "Ponderador";
        }else if (e.getSource() == btnClose) {
            Boolean Resp = ConfirmBox.display("Verifique su respuesta","Realmente desea salir");
            if (Resp == true) {
                System.exit(0);
            }
        }
        FXMLLoader.load(Objects.requireNonNull(getClass().getResource(url)));
        pnlCntn.prefWidth(dAncho);
        //srcPane.prefHeight(this.pnlCntn.getHeight());
        pnlCntn.setMinWidth(dAncho);
        //srcPane.setMinHeight(this.pnlCntn.getHeight());

        this.pnlCntn.setContent(srcPane);
        //this.pnlCntn.getChildren().setAll(srcPane);

    }
    private void ajstMnu() {
        ContentDisplay cnt;
        Integer a2;
        if (pnlIzq.getPrefWidth() == 140) {
            cnt = ContentDisplay.GRAPHIC_ONLY;
            a1 = 50;
            a2 = 16;
            a3 = 1650;
            vbxBusca.setVisible(false);
        }else{
            cnt = ContentDisplay.TOP;
            a1 = 140;
            a2 = 18;
            a3 = 1520;
            vbxBusca.setVisible(true);
        }
        btnCartOpt.setContentDisplay(cnt);
        btnPondera.setContentDisplay(cnt);
        btnRastrea.setContentDisplay(cnt);
        btnAnaCartOpt.setContentDisplay(cnt);

        pnlIzq.setPrefWidth(a1);
        vbxPnlIzq.setPrefWidth(a1);
        pnlCntn.setLayoutX(a1);
        srcPane.setLeftAnchor(pnlCntn, a1);

        aweMnu.setIconSize(a2);
        aweCrt.setIconSize(a2);
        aweAna.setIconSize(a2);
        aweRst.setIconSize(a2);
        awePnd.setIconSize(a2);

        pnlCntn.setPrefWidth(a3);
        pnlCntn.setMaxWidth(a3);
        pnlCntn.setMinWidth(a3);
    }
    private void DaForma() {
        pnlIzq.setStyle("pnli");
        vbxPnlIzq.setStyle("vrtBx");
        btnMenu.setStyle("btn");
        aweMnu.setStyle("awes");
        btnCartOpt.setStyle("btn");
        aweCrt.setStyle("awes");
        btnAnaCartOpt.setStyle("btn");
        aweAna.setStyle("awes");
        btnRastrea.setStyle("btn");
        aweRst.setStyle("awes");
        btnPondera.setStyle("btn");
        awePnd.setStyle("awes");

    }

    @Override
    public void start(Stage stage) throws Exception {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //DaForma();
        Mensaje = resources;

        strTitle = "Panel Principal";
        srcPane.setPrefWidth(this.pnlCntn.getPrefWidth());
        //srcPane.setMinHeight(this.pnlCntn.getHeight());
        srcPane.setMaxWidth(this.pnlCntn.getMaxWidth());
        srcPane.setMinWidth(this.pnlCntn.getMinWidth());
        //srcPane.setMaxHeight(this.pnlCntn.getHeight());
        //srcPane.getChildren().addAll(sp);

        btnLengua.setTranslateX(0);
        btnLengua.setTranslateY(0);

        btnLengua.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (btnLengua.getState()==true) {
                    btnLengua.setState(false);
                }else {
                    btnLengua.setState(true);
                }
                if (lcldfl.equals("es_ES")) {
                    lcldfl = "Ing";
                } else if (lcldfl.equals("en_EN")) {
                    lcldfl = "Esp";
                }
                try {
                    new cambiarIdioma(lcldfl);
                } catch (IOException | InterruptedException en) {
                    en.printStackTrace();
                }
            }
        });

        btnCambio.setTranslateX(0);
        btnCambio.setTranslateY(0);

        btnCambio.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (btnCambio.getState()==true) {
                    btnCambio.setState(false);
                }else {
                    btnCambio.setState(true);
                }
            }
        });

        btnActivo.setTranslateX(0);
        btnActivo.setTranslateY(0);

        btnActivo.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (btnActivo.getState()==true) {
                    btnActivo.setState(false);
                }else {
                    btnActivo.setState(true);
                }
            }
        });
        vbxBusca.getChildren().add(btnLengua);
        vbxBusca.getChildren().add(btnCambio);
        vbxBusca.getChildren().add(btnActivo);
        //this.pnlCntn.getChildren().setAll(srcPane);
        this.pnlCntn.setContent(srcPane);

        if (lcldfl.equals("es_ES")) {
            btnLengua.setState(true);
        } else if (lcldfl.equals("en_EN")) {
            btnLengua.setState(false);
        }
    }
}
