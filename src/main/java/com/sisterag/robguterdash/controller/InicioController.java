package com.sisterag.robguterdash.controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.image.Image;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.sisterag.robguterdash.util.funciones.leerJson;

public class InicioController implements Initializable {

    final ScrollPane sp = new ScrollPane();

    @FXML
    private ImageView imgADZ;

    @FXML
    private ImageView imgAGIL;

    @FXML
    private ImageView imgAMS;

    @FXML
    private ImageView imgATRY;

    @FXML
    private ImageView imgBBVA;

    @FXML
    private ImageView imgCLR;

    @FXML
    private ImageView imgDAX;

    @FXML
    private ImageView imgDESA;

    @FXML
    private ImageView imgDJI;

    @FXML
    private ImageView imgENRS;

    @FXML
    private ImageView imgGGR;

    @FXML
    private ImageView imgIBE;

    @FXML
    private ImageView imgLIB;

    @FXML
    private ImageView imgNDX;

    @FXML
    private ImageView imgNI225;

    @FXML
    private ImageView imgRBT;

    @FXML
    private ImageView imgREP;

    @FXML
    private ImageView imgSAN;

    @FXML
    private ImageView imgSLR;

    @FXML
    private ImageView imgSPX;

    @FXML
    private ImageView imgTEL;

    @FXML
    private ImageView imgUKX;

    @FXML
    private ImageView imgVANA;

    @FXML
    private ImageView imgVYT;

    @FXML
    private Pane pnlADZ;

    @FXML
    private Pane pnlAMS;

    @FXML
    private Pane pnlATRY;

    @FXML
    private Pane pnlBBVA;

    @FXML
    private Pane pnlCLR;

    @FXML
    private Pane pnlDAX;

    @FXML
    private Pane pnlDESA;

    @FXML
    private Pane pnlDJI;

    @FXML
    private Pane pnlENRS;

    @FXML
    private Pane pnlEsp;

    @FXML
    private Pane pnlGGR;

    @FXML
    private Pane pnlIBE;

    @FXML
    private Pane pnlInd;

    @FXML
    private Pane pnlLIB;

    @FXML
    private Pane pnlNDX;

    @FXML
    private Pane pnlNI225;

    @FXML
    private Pane pnlRBT;

    @FXML
    private Pane pnlREP;

    @FXML
    private Pane pnlSLR;

    @FXML
    private Pane pnlTEL;

    @FXML
    private Pane pnlUKX;

    @FXML
    private Pane pnlVANA;

    @FXML
    private Pane pnlVYT;

    @FXML
    private Pane pnlVol;

    @FXML
    private Text txtADZEmp;

    @FXML
    private Text txtADZNom;

    @FXML
    private Text txtADZPrc;

    @FXML
    private Text txtADZVar;

    @FXML
    private Text txtAGILEmp;

    @FXML
    private Text txtAGILNom;

    @FXML
    private Text txtAGILPrc;

    @FXML
    private Text txtAGILVar;

    @FXML
    private Text txtAMSEmp;

    @FXML
    private Text txtAMSNom;

    @FXML
    private Text txtAMSPrc;

    @FXML
    private Text txtAMSVar;

    @FXML
    private Text txtATRYEmp;

    @FXML
    private Text txtATRYNom;

    @FXML
    private Text txtATRYPrc;

    @FXML
    private Text txtATRYVar;

    @FXML
    private Text txtBBVAEmp;

    @FXML
    private Text txtBBVANom;

    @FXML
    private Text txtBBVAPrc;

    @FXML
    private Text txtBBVAVar;

    @FXML
    private Text txtCLREmp;

    @FXML
    private Text txtCLRNom;

    @FXML
    private Text txtCLRPrc;

    @FXML
    private Text txtCLRVar;

    @FXML
    private Text txtDAXEmp;

    @FXML
    private Text txtDAXNom;

    @FXML
    private Text txtDAXPrc;

    @FXML
    private Text txtDAXVar;

    @FXML
    private Text txtDESAEmp;

    @FXML
    private Text txtDESANom;

    @FXML
    private Text txtDESAPrc;

    @FXML
    private Text txtDESAVar;

    @FXML
    private Text txtDJIEmp;

    @FXML
    private Text txtDJINom;

    @FXML
    private Text txtDJIPrc;

    @FXML
    private Text txtDJIVar;

    @FXML
    private Text txtENRSEmp;

    @FXML
    private Text txtENRSNom;

    @FXML
    private Text txtENRSPrc;

    @FXML
    private Text txtENRSVar;

    @FXML
    private Text txtGGREmp;

    @FXML
    private Text txtGGRNom;

    @FXML
    private Text txtGGRPrc;

    @FXML
    private Text txtGGRVar;

    @FXML
    private Text txtIBEEmp;

    @FXML
    private Text txtIBENom;

    @FXML
    private Text txtIBEPrc;

    @FXML
    private Text txtIBEVar;

    @FXML
    private Text txtLIBEmp;

    @FXML
    private Text txtLIBNom;

    @FXML
    private Text txtLIBPrc;

    @FXML
    private Text txtLIBVar;

    @FXML
    private Text txtNDXEmp;

    @FXML
    private Text txtNDXNom;

    @FXML
    private Text txtNDXPrc;

    @FXML
    private Text txtNDXVar;

    @FXML
    private Text txtNI225Emp;

    @FXML
    private Text txtNI225Nom;

    @FXML
    private Text txtNI225Prc;

    @FXML
    private Text txtNI225Var;

    @FXML
    private Text txtRBTEmp;

    @FXML
    private Text txtRBTNom;

    @FXML
    private Text txtRBTPrc;

    @FXML
    private Text txtRBTVar;

    @FXML
    private Text txtREPEmp;

    @FXML
    private Text txtREPNom;

    @FXML
    private Text txtREPPrc;

    @FXML
    private Text txtREPVar;

    @FXML
    private Text txtSANEmp;

    @FXML
    private Text txtSANNom;

    @FXML
    private Text txtSANPrc;

    @FXML
    private Text txtSANVar;

    @FXML
    private Text txtSLREmp;

    @FXML
    private Text txtSLRNom;

    @FXML
    private Text txtSLRPrc;

    @FXML
    private Text txtSLRVar;

    @FXML
    private Text txtSPXEmp;

    @FXML
    private Text txtSPXNom;

    @FXML
    private Text txtSPXPrc;

    @FXML
    private Text txtSPXVar;

    @FXML
    private Text txtTELEmp;

    @FXML
    private Text txtTELNom;

    @FXML
    private Text txtTELPrc;

    @FXML
    private Text txtTELVar;

    @FXML
    private Text txtUKXEmp;

    @FXML
    private Text txtUKXNom;

    @FXML
    private Text txtUKXPrc;

    @FXML
    private Text txtUKXVar;

    @FXML
    private Text txtVANAEmp;

    @FXML
    private Text txtVANANom;

    @FXML
    private Text txtVANAPrc;

    @FXML
    private Text txtVANAVar;

    @FXML
    private Text txtVYTEmp;

    @FXML
    private Text txtVYTNom;

    @FXML
    private Text txtVYTPrc;

    @FXML
    private Text txtVYTVar;

    Integer dTope = 100;
    ProgressIndicator PI;

    public Task trabajo() {
        return new Task() {
            @Override
            protected Object call() throws Exception {
                int i = 0;
                while (i < (dTope)) {
                    Thread.sleep(1000);
                    updateProgress(i,10);
                    i++;
                    PI.setVisible(true);
                }
                System.exit(0);
                return true;
            }
        };
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            String sUrl = "src/main/resources/Data.json";
            String sPth = "src/main/resources/images/";
            JsonObject data = leerJson(sUrl);

            JsonArray Indices = data.getAsJsonArray("Indices");
            JsonArray Espanolas = data.getAsJsonArray("Espanolas");
            JsonArray volatiles = data.getAsJsonArray("volatiles");
            JsonArray Ganadores = data.getAsJsonArray("Ganadores");

            if (Indices != null) {
                for (int i = 0; i < Indices.size(); i++) {
                    JsonObject item = Indices.get(i).getAsJsonObject();
                    String sImgn = item.get("Imagen").getAsString();
                    String dImag = sPth + sImgn;
                    FileInputStream input = new FileInputStream(dImag);
                    Image image = new Image(input);
                    String dEmp = item.get("EMP").getAsString();
                    String dNom = item.get("Nombre").getAsString();
                    String dPre = item.get("Precio").getAsString();
                    String dVar = item.get("Varia").getAsString();
                    if (i==0) {
                        imgSPX.setImage(image);
                        txtSPXEmp.setText(dEmp);
                        txtSPXNom.setText(dNom);
                        txtSPXPrc.setText(dPre);
                        txtSPXVar.setText(dVar);

                    }else if (i==1) {
                        imgNDX.setImage(image);
                        txtNDXEmp.setText(dEmp);
                        txtNDXNom.setText(dNom);
                        txtNDXPrc.setText(dPre);
                        txtNDXVar.setText(dVar);

                    }else if (i==2) {
                        imgDJI.setImage(image);
                        txtDJIEmp.setText(dEmp);
                        txtDJINom.setText(dNom);
                        txtDJIPrc.setText(dPre);
                        txtDJIVar.setText(dVar);
                    }else if (i==3) {
                        imgNI225.setImage(image);
                        txtNI225Emp.setText(dEmp);
                        txtNI225Nom.setText(dNom);
                        txtNI225Prc.setText(dPre);
                        txtNI225Var.setText(dVar);
                    }else if (i==4) {
                        imgUKX.setImage(image);
                        txtUKXEmp.setText(dEmp);
                        txtUKXNom.setText(dNom);
                        txtUKXPrc.setText(dPre);
                        txtUKXVar.setText(dVar);

                    }else if (i==5) {
                        imgDAX.setImage(image);
                        txtDAXEmp.setText(dEmp);
                        txtDAXNom.setText(dNom);
                        txtDAXPrc.setText(dPre);
                        txtDAXVar.setText(dVar);
                    }
                }
            }
            if (Espanolas != null) {
                for (int i = 0; i < Espanolas.size(); i++) {
                    JsonObject item = Espanolas.get(i).getAsJsonObject();
                    String sImgn = item.get("Imagen").getAsString();
                    String dImag = sPth + sImgn;
                    FileInputStream input = new FileInputStream(dImag);
                    Image image = new Image(input);
                    String dEmp = item.get("EMP").getAsString();
                    String dNom = item.get("Nombre").getAsString();
                    String dPre = item.get("Precio").getAsString();
                    String dVar = item.get("Varia").getAsString();
                    if (i==0) {
                        imgSAN.setImage(image);
                        txtSANEmp.setText(dEmp);
                        txtSANNom.setText(dNom);
                        txtSANPrc.setText(dPre);
                        txtSANVar.setText(dVar);

                    }else if (i==1) {
                        imgTEL.setImage(image);
                        txtTELEmp.setText(dEmp);
                        txtTELNom.setText(dNom);
                        txtTELPrc.setText(dPre);
                        txtTELVar.setText(dVar);

                    }else if (i==2) {
                        imgBBVA.setImage(image);
                        txtBBVAEmp.setText(dEmp);
                        txtBBVANom.setText(dNom);
                        txtBBVAPrc.setText(dPre);
                        txtBBVAVar.setText(dVar);
                    }else if (i==3) {
                        imgIBE.setImage(image);
                        txtIBEEmp.setText(dEmp);
                        txtIBENom.setText(dNom);
                        txtIBEPrc.setText(dPre);
                        txtIBEVar.setText(dVar);
                    }else if (i==4) {
                        imgREP.setImage(image);
                        txtREPEmp.setText(dEmp);
                        txtREPNom.setText(dNom);
                        txtREPPrc.setText(dPre);
                        txtREPVar.setText(dVar);

                    }else if (i==5) {
                        imgAMS.setImage(image);
                        txtAMSEmp.setText(dEmp);
                        txtAMSNom.setText(dNom);
                        txtAMSPrc.setText(dPre);
                        txtAMSVar.setText(dVar);
                    }
                }
            }
            if (volatiles != null) {
                for (int i = 0; i < volatiles.size(); i++) {
                    JsonObject item = volatiles.get(i).getAsJsonObject();
                    String sImgn = item.get("Imagen").getAsString();
                    String dImag = sPth + sImgn;
                    FileInputStream input = new FileInputStream(dImag);
                    Image image = new Image(input);
                    String dEmp = item.get("EMP").getAsString();
                    String dNom = item.get("Nombre").getAsString();
                    String dPre = item.get("Precio").getAsString();
                    String dVar = item.get("Varia").getAsString();
                    if (i==0) {
                        imgAGIL.setImage(image);
                        txtAGILEmp.setText(dEmp);
                        txtAGILNom.setText(dNom);
                        txtAGILPrc.setText(dPre);
                        txtAGILVar.setText(dVar);

                    }else if (i==1) {
                        imgDESA.setImage(image);
                        txtDESAEmp.setText(dEmp);
                        txtDESANom.setText(dNom);
                        txtDESAPrc.setText(dPre);
                        txtDESAVar.setText(dVar);

                    }else if (i==2) {
                        imgVANA.setImage(image);
                        txtVANAEmp.setText(dEmp);
                        txtVANANom.setText(dNom);
                        txtVANAPrc.setText(dPre);
                        txtVANAVar.setText(dVar);
                    }else if (i==3) {
                        imgLIB.setImage(image);
                        txtLIBEmp.setText(dEmp);
                        txtLIBNom.setText(dNom);
                        txtLIBPrc.setText(dPre);
                        txtLIBVar.setText(dVar);
                    }else if (i==4) {
                        imgATRY.setImage(image);
                        txtATRYEmp.setText(dEmp);
                        txtATRYNom.setText(dNom);
                        txtATRYPrc.setText(dPre);
                        txtATRYVar.setText(dVar);

                    }else if (i==5) {
                        imgGGR.setImage(image);
                        txtGGREmp.setText(dEmp);
                        txtGGRNom.setText(dNom);
                        txtGGRPrc.setText(dPre);
                        txtGGRVar.setText(dVar);
                    }
                }
            }
            if (Ganadores != null) {
                for (int i = 0; i < Ganadores.size(); i++) {
                    JsonObject item = Ganadores.get(i).getAsJsonObject();
                    String sImgn = item.get("Imagen").getAsString();
                    String dImag = sPth + sImgn;
                    FileInputStream input = new FileInputStream(dImag);
                    Image image = new Image(input);
                    String dEmp = item.get("EMP").getAsString();
                    String dNom = item.get("Nombre").getAsString();
                    String dPre = item.get("Precio").getAsString();
                    String dVar = item.get("Varia").getAsString();
                    if (i==0) {
                        imgADZ.setImage(image);
                        txtADZEmp.setText(dEmp);
                        txtADZNom.setText(dNom);
                        txtADZPrc.setText(dPre);
                        txtADZVar.setText(dVar);

                    }else if (i==1) {
                        imgENRS.setImage(image);
                        txtENRSEmp.setText(dEmp);
                        txtENRSNom.setText(dNom);
                        txtENRSPrc.setText(dPre);
                        txtENRSVar.setText(dVar);

                    }else if (i==2) {
                        imgRBT.setImage(image);
                        txtRBTEmp.setText(dEmp);
                        txtRBTNom.setText(dNom);
                        txtRBTPrc.setText(dPre);
                        txtRBTVar.setText(dVar);
                    }else if (i==3) {
                        imgVYT.setImage(image);
                        txtVYTEmp.setText(dEmp);
                        txtVYTNom.setText(dNom);
                        txtVYTPrc.setText(dPre);
                        txtVYTVar.setText(dVar);
                    }else if (i==4) {
                        imgSLR.setImage(image);
                        txtSLREmp.setText(dEmp);
                        txtSLRNom.setText(dNom);
                        txtSLRPrc.setText(dPre);
                        txtSLRVar.setText(dVar);

                    }else if (i==5) {
                        imgCLR.setImage(image);
                        txtCLREmp.setText(dEmp);
                        txtCLRNom.setText(dNom);
                        txtCLRPrc.setText(dPre);
                        txtCLRVar.setText(dVar);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
