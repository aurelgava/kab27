package com.projects.kab27;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ScenaGlavnaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void goToScene2(ActionEvent actionEvent) {
        kab27Application.stage.setScene(kab27Application.scena2);
    }

    public void onScena3ClkBtn(ActionEvent actionEvent) {
        kab27Application.stage.setScene(kab27Application.scena3);
    }

    public void onScena4ClkBtn(ActionEvent actionEvent) {
        kab27Application.stage.setScene(kab27Application.scena4);
    }

    public void onScena5ClkBtn(ActionEvent actionEvent) {
        kab27Application.stage.setScene(kab27Application.scena7);
    }

    public void onScena8ClkBtn(ActionEvent actionEvent) {
        kab27Application.stage.setScene(kab27Application.scena8);
    }

    public void onScena9ClkBtn(ActionEvent actionEvent) {
        kab27Application.stage.setScene(kab27Application.scena9);
    }

    public void onScena10ClkBtn(ActionEvent actionEvent) {
        kab27Application.stage.setScene(kab27Application.scena10);
    }

    public static class Scena9Controller {
    }
}
