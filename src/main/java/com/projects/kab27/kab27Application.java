package com.projects.kab27;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class kab27Application extends Application {
    public static Stage stage;
    public static Scene scenaGlavna,scena2;
    public static Scene scena3;

    @Override
    public void start(Stage stage) throws IOException {
        kab27Application.stage = stage;

        FXMLLoader fxmlLoader1 = new FXMLLoader(kab27Application.class.getResource("scenaGlavna-view.fxml"));
        Scene scenaGlavna = new Scene(fxmlLoader1.load(), 320, 240);
        kab27Application.scenaGlavna = scenaGlavna;

        FXMLLoader fxmlLoader2 = new FXMLLoader(kab27Application.class.getResource("scena2-view.fxml"));
        Scene scena2 = new Scene(fxmlLoader2.load(), 320, 240);
        kab27Application.scena2 = scena2;

        FXMLLoader fxmlLoader3 = new FXMLLoader(kab27Application.class.getResource("scena3-view.fxml"));
        Scene scena3 = new Scene(fxmlLoader3.load(), 320, 240);
        kab27Application.scena3 = scena3;

        stage.setTitle("kab27!");
        stage.setScene(scenaGlavna);
        stage.show();
    }
}
