/**
 * Sample Skeleton for 'Mapa.fxml' Controller Class
 */

package com.example.proyecto03pathfinder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Mapa_Controller {
    @FXML // fx:id="image"
    private ImageView image; // Value injected by FXMLLoader

    @FXML // fx:id="ceroauno"
    private Line ceroauno; // Value injected by FXMLLoader

    @FXML // fx:id="unoados"
    private Line unoados; // Value injected by FXMLLoader

    @FXML // fx:id="dosatres"
    private Line dosatres; // Value injected by FXMLLoader

    @FXML // fx:id="dosacinco"
    private Line dosacinco; // Value injected by FXMLLoader

    @FXML // fx:id="cuatroacinco"
    private Line cuatroacinco; // Value injected by FXMLLoader

    @FXML // fx:id="cincoaseis"
    private Line cincoaseis; // Value injected by FXMLLoader

    @FXML // fx:id="seisasiete"
    private Line seisasiete; // Value injected by FXMLLoader

    @FXML // fx:id="sieteaocho"
    private Line sieteaocho; // Value injected by FXMLLoader

    @FXML // fx:id="ochoanueve"
    private Line ochoanueve; // Value injected by FXMLLoader

    @FXML // fx:id="cincoanueve"
    private Line cincoanueve; // Value injected by FXMLLoader

    @FXML // fx:id="cuatroanueve"
    private Line cuatroanueve; // Value injected by FXMLLoader

    @FXML // fx:id="cuatroaquince"
    private Line cuatroaquince; // Value injected by FXMLLoader

    @FXML // fx:id="catorceaquince"
    private Line catorceaquince; // Value injected by FXMLLoader

    @FXML // fx:id="quinceadieciseis"
    private Line quinceadieciseis; // Value injected by FXMLLoader

    @FXML // fx:id="quinceadiecisiete"
    private Line quinceadiecisiete; // Value injected by FXMLLoader

    @FXML // fx:id="dieciseisadiecisiete"
    private Line dieciseisadiecisiete; // Value injected by FXMLLoader

    @FXML // fx:id="nueveadiez"
    private Line nueveadiez; // Value injected by FXMLLoader

    @FXML // fx:id="diaezaonce"
    private Line diaezaonce; // Value injected by FXMLLoader

    @FXML // fx:id="onceadoce"
    private Line onceadoce; // Value injected by FXMLLoader

    @FXML // fx:id="doceatrece"
    private Line doceatrece; // Value injected by FXMLLoader

    @FXML // fx:id="treceacatorce"
    private Line treceacatorce; // Value injected by FXMLLoader

    @FXML // fx:id="dosacuatro"
    private Line dosacuatro; // Value injected by FXMLLoader

    @FXML // fx:id="CD"
    private Text CD; // Value injected by FXMLLoader

    @FXML // fx:id="BC"
    private Text BC; // Value injected by FXMLLoader

    @FXML // fx:id="AB"
    private Text AB; // Value injected by FXMLLoader

    @FXML // fx:id="CF"
    private Text CF; // Value injected by FXMLLoader

    @FXML // fx:id="FG"
    private Text FG; // Value injected by FXMLLoader

    @FXML // fx:id="GH"
    private Text GH; // Value injected by FXMLLoader

    @FXML // fx:id="HI"
    private Text HI; // Value injected by FXMLLoader

    @FXML // fx:id="IJ"
    private Text IJ; // Value injected by FXMLLoader

    @FXML // fx:id="JE"
    private Text JE; // Value injected by FXMLLoader

    @FXML // fx:id="CE"
    private Text CE; // Value injected by FXMLLoader

    @FXML // fx:id="FE"
    private Text FE; // Value injected by FXMLLoader

    @FXML // fx:id="FJ"
    private Text FJ; // Value injected by FXMLLoader

    @FXML // fx:id="JK"
    private Text JK; // Value injected by FXMLLoader

    @FXML // fx:id="KL"
    private Text KL; // Value injected by FXMLLoader

    @FXML // fx:id="LM"
    private Text LM; // Value injected by FXMLLoader

    @FXML // fx:id="MN"
    private Text MN; // Value injected by FXMLLoader

    @FXML // fx:id="NÑ"
    private Text NÑ; // Value injected by FXMLLoader

    @FXML // fx:id="ÑO"
    private Text ÑO; // Value injected by FXMLLoader

    @FXML // fx:id="OP"
    private Text OP; // Value injected by FXMLLoader

    @FXML // fx:id="PQ"
    private Text PQ; // Value injected by FXMLLoader

    @FXML // fx:id="QO"
    private Text QO; // Value injected by FXMLLoader

    @FXML // fx:id="OE"
    private Text OE; // Value injected by FXMLLoader

    @FXML // fx:id="Inicio"
    private TextField Inicio; // Value injected by FXMLLoader

    @FXML // fx:id="InicioRuta"
    private TextField InicioRuta; // Value injected by FXMLLoader

    @FXML // fx:id="FinRuta"
    private TextField FinRuta; // Value injected by FXMLLoader

    @FXML // fx:id="Final"
    private TextField Final; // Value injected by FXMLLoader

    @FXML // fx:id="PorAgregar"
    private TextField PorAgregar; // Value injected by FXMLLoader

    @FXML // fx:id="textoruta"
    private Label textoruta; // Value injected by FXMLLoader

    @FXML
    void Btn_Info(MouseEvent event) throws IOException {
        Datos_Application datos = new Datos_Application();
        Stage stage = new Stage();
        datos.start(stage);

    }

    @FXML
    void Enviar(MouseEvent event) {

        int source = Integer.parseInt(Inicio.getText());
        int arrival = Integer.parseInt(Final.getText());

        if (source != 2 && source != 4 && source != 5 && source != 9 && source != 15 && source <= 17 && source >= 0 && source != arrival) {
            if (arrival == source + 1 || arrival == source - 1) {
                if (Integer.parseInt(AB.getText()) != 0) {

                    //Minutos extra de 1 a 0
                    if (source == 1 && arrival == 0 || source == 0 && arrival == 1) {
                        int total = Integer.parseInt(AB.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        AB.setText(String.valueOf(total));
                    }

                    //Minutos extra de 1 a 2
                    if (source == 1 && arrival == 2) {
                        int total = Integer.parseInt(BC.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        BC.setText(String.valueOf(total));
                    }

                    //Minutos extra de 3 a 2
                    if (source == 3 && arrival == 2) {
                        int total = Integer.parseInt(CD.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        CD.setText(String.valueOf(total));
                    }

                    //Minutos extra de 6 a 5
                    if (source == 6 && arrival == 5) {
                        int total = Integer.parseInt(FG.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        FG.setText(String.valueOf(total));
                    }

                    //Minutos extra de 6 a 7 y viceversa
                    if (source == 6 && arrival == 7 || source == 7 && arrival == 6) {
                        int total = Integer.parseInt(GH.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        GH.setText(String.valueOf(total));
                    }

                    //Minutos extra de 7 a 8 y viceversa
                    if (source == 7 && arrival == 8 || source == 8 && arrival == 7) {
                        int total = Integer.parseInt(HI.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        HI.setText(String.valueOf(total));
                    }

                    //Minutos extra de 8 a 9
                    if (source == 8 && arrival == 9) {
                        int total = Integer.parseInt(IJ.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        IJ.setText(String.valueOf(total));
                    }

                    //Minutos extra de 9 a 10
                    if (source == 10 && arrival == 9) {
                        int total = Integer.parseInt(JK.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        JK.setText(String.valueOf(total));
                    }

                    //Minutos extra de 10 a 11 y viceversa
                    if (source == 10 && arrival == 11 || source == 11 && arrival == 10) {
                        int total = Integer.parseInt(KL.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        KL.setText(String.valueOf(total));
                    }

                    //Minutos extra de 11 a 12 y viceversa
                    if (source == 12 && arrival == 11 || source == 11 && arrival == 12) {
                        int total = Integer.parseInt(LM.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        LM.setText(String.valueOf(total));
                    }

                    //Minutos extra de 13 a 12 y viceversa
                    if (source == 12 && arrival == 13 || source == 13 && arrival == 12) {
                        int total = Integer.parseInt(MN.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        MN.setText(String.valueOf(total));
                    }

                    //Minutos extra de 13 a 14 y viceversa
                    if (source == 14 && arrival == 13 || source == 13 && arrival == 14) {
                        int total = Integer.parseInt(NÑ.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        NÑ.setText(String.valueOf(total));
                    }

                    //Minutos extra de 14 a 15
                    if (source == 14 && arrival == 15) {
                        int total = Integer.parseInt(ÑO.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        ÑO.setText(String.valueOf(total));
                    }

                    //Minutos extra de 16 a 15
                    if (source == 16 && arrival == 15) {
                        int total = Integer.parseInt(OP.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        OP.setText(String.valueOf(total));
                    }

                    //Minutos extra de 16 a 17 y viceversa
                    if (source == 16 && arrival == 17 || source == 17 && arrival == 16) {
                        int total = Integer.parseInt(PQ.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        PQ.setText(String.valueOf(total));
                    }

                    //Minutos extra de 17 a 15
                    if (source == 17 && arrival == 15) {
                        int total = Integer.parseInt(QO.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        QO.setText(String.valueOf(total));
                    }
                } else {
                    System.err.println("Valor invalido");
                }
            } else {
                System.err.println("Valor invalido");
            }
        }
        else if (source == 2 || source == 4 || source == 5 || source == 9 || source == 15) {
            if (Integer.parseInt(AB.getText()) != 0) {
                //Minutos extra de 2 a 1,3,4 o 5
                if (source == 2) {
                    if (arrival == 1) {
                        int total = Integer.parseInt(BC.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        BC.setText(String.valueOf(total));
                    }

                    if (arrival == 3) {
                        int total = Integer.parseInt(CD.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        CD.setText(String.valueOf(total));
                    }

                    if (arrival == 4) {
                        int total = Integer.parseInt(CE.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        CE.setText(String.valueOf(total));
                    }

                    if (arrival == 5) {
                        int total = Integer.parseInt(CF.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        CF.setText(String.valueOf(total));
                    }else {
                        System.err.println("Valor invalido");
                    }
                }
                //Minutos extra de 5 a 2,4,6,9
                if (source == 5) {
                    if (arrival == 6) {
                        int total = Integer.parseInt(FG.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        BC.setText(String.valueOf(total));
                    }
                    if (arrival == 2) {
                        int total = Integer.parseInt(CF.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        CF.setText(String.valueOf(total));
                    }
                    if (arrival == 4) {
                        int total = Integer.parseInt(FE.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        FE.setText(String.valueOf(total));
                    }
                    if (arrival == 9) {
                        int total = Integer.parseInt(FJ.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        FJ.setText(String.valueOf(total));
                    }else {
                        System.err.println("Valor invalido");
                    }
                }
                //Minutos extra de 4 a 2,5,9,15
                if (source == 4) {
                    if (arrival == 2) {
                        int total = Integer.parseInt(CE.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        CE.setText(String.valueOf(total));
                    }
                    if (arrival == 5) {
                        int total = Integer.parseInt(FE.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        FE.setText(String.valueOf(total));
                    }
                    if (arrival == 9) {
                        int total = Integer.parseInt(JE.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        JE.setText(String.valueOf(total));
                    }
                    if (arrival == 15) {
                        int total = Integer.parseInt(OE.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        OE.setText(String.valueOf(total));
                    }else {
                        System.err.println("Valor invalido");
                    }
                }
                //Minutos extra de 9 a 4,5,8,10
                if (source == 9) {
                    if (arrival == 4) {
                        int total = Integer.parseInt(JE.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        JE.setText(String.valueOf(total));
                    }
                    if (arrival == 5) {
                        int total = Integer.parseInt(FJ.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        FJ.setText(String.valueOf(total));
                    }
                    if (arrival == 8) {
                        int total = Integer.parseInt(IJ.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        IJ.setText(String.valueOf(total));
                    }
                    if (arrival == 10) {
                        int total = Integer.parseInt(JK.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        JK.setText(String.valueOf(total));
                    }else {
                        System.err.println("Valor invalido");
                    }
                }
                //Minutos extra de 15 a 4,14,16,17
                if (source == 15) {
                    if (arrival == 4) {
                        int total = Integer.parseInt(OE.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        OE.setText(String.valueOf(total));
                    }
                    if (arrival == 14) {
                        int total = Integer.parseInt(ÑO.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        ÑO.setText(String.valueOf(total));
                    }
                    if (arrival == 16) {
                        int total = Integer.parseInt(OP.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        OP.setText(String.valueOf(total));
                    }
                    if (arrival == 17) {
                        int total = Integer.parseInt(QO.getText());
                        total += Integer.parseInt(PorAgregar.getText());
                        QO.setText(String.valueOf(total));
                    }else {
                        System.err.println("Valor invalido");
                    }
                }
            }else {
                System.err.println("Valor invalido");
            }
        }
        else{
            System.err.println("Error, valor invalido");
        }
    }
    @FXML
    void Ruta(MouseEvent event) {
        int partida = Integer.parseInt(InicioRuta.getText());
        int llegada = Integer.parseInt(FinRuta.getText());

        int graph[][] = new int[][]{
                {0, Integer.parseInt(AB.getText()), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {Integer.parseInt(AB.getText()), 0, Integer.parseInt(BC.getText()), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, Integer.parseInt(BC.getText()), 0, Integer.parseInt(CD.getText()), Integer.parseInt(CE.getText()), Integer.parseInt(CF.getText()), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, Integer.parseInt(CD.getText()), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, Integer.parseInt(CE.getText()), 0, 0, Integer.parseInt(FE.getText()), 0, 0, 0, Integer.parseInt(JE.getText()), 0, 0, 0, 0, 0, Integer.parseInt(OE.getText()), 0, 0},
                {0, 0, Integer.parseInt(CF.getText()), 0, Integer.parseInt(FE.getText()), 0, Integer.parseInt(FG.getText()), 0, 0, Integer.parseInt(FJ.getText()), 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, Integer.parseInt(FG.getText()), 0, Integer.parseInt(GH.getText()), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, Integer.parseInt(GH.getText()), 0, Integer.parseInt(HI.getText()), 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, Integer.parseInt(HI.getText()), 0, Integer.parseInt(IJ.getText()), 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, Integer.parseInt(JE.getText()), Integer.parseInt(FJ.getText()), 0, 0, Integer.parseInt(IJ.getText()), 0, Integer.parseInt(JK.getText()), 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.parseInt(JK.getText()), 0, Integer.parseInt(KL.getText()), 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.parseInt(KL.getText()), 0, Integer.parseInt(LM.getText()), 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.parseInt(LM.getText()), 0, Integer.parseInt(MN.getText()), 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.parseInt(MN.getText()), 0, Integer.parseInt(NÑ.getText()), 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.parseInt(NÑ.getText()), 0, Integer.parseInt(ÑO.getText()), 0, 0},
                {0, 0, 0, 0, Integer.parseInt(OE.getText()), 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.parseInt(ÑO.getText()), 0, Integer.parseInt(OP.getText()), Integer.parseInt(QO.getText())},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.parseInt(OP.getText()), 0, Integer.parseInt(PQ.getText())},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.parseInt(QO.getText()), Integer.parseInt(PQ.getText()), 0}};
        Dijkstra_Algorithm t = new Dijkstra_Algorithm();
        t.dijkstra(graph, partida, llegada);
        textoruta.setText(String.valueOf(t.mostrartexto()));
    }
}







