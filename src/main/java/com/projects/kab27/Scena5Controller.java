package com.projects.kab27;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Scena5Controller {
    public TextField text2;
    public TextField text1;
    public Label lblrez;

    public void onClickScena1Btn(ActionEvent actionEvent) {
        kab27Application.stage.setScene(kab27Application.scenaGlavna);
    }


    public void onClickSaberiBtn(ActionEvent actionEvent) {
        int sab1 = Integer.parseInt(text1.getText());
        int sab2 = Integer.parseInt(text2.getText());
        int rez = sab1 + sab2;
        lblrez.setText(Integer.toString(rez));
    }
}
