package com.projects.kab27;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Scena3Controller {

    @FXML
    private TextField sabirak1;
    @FXML
    private TextField sabirak2;
    @FXML
    private Button zbir;
    @FXML
    private Button back;

    public void onClickBackBtn(ActionEvent actionEvent) {
        kab27Application.stage.setScene(kab27Application.scenaGlavna);
    }

    public void onClickZbirBtn(ActionEvent actionEvent) {

    }
}
