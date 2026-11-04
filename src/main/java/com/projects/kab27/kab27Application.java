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
    public static Scene scena4;
    public static Scene scena5;
    public static Scene scena6;
    public static Scene scena7;

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

        FXMLLoader fxmlLoader4 = new FXMLLoader(kab27Application.class.getResource("scena4-view.fxml"));
        Scene scena4 = new Scene(fxmlLoader4.load(), 320, 240);
        kab27Application.scena4 = scena4;

        FXMLLoader fxmlLoader5 = new FXMLLoader(kab27Application.class.getResource("scena5-view.fxml"));
        Scene scena5 = new Scene(fxmlLoader5.load(), 320, 240);
        kab27Application.scena5 = scena5;

        FXMLLoader fxmlLoader6 = new FXMLLoader(kab27Application.class.getResource("scena6-view.fxml"));
        Scene scena6 = new Scene(fxmlLoader6.load(), 320, 240);
        kab27Application.scena6 = scena6;

        FXMLLoader fxmlLoader7 = new FXMLLoader(kab27Application.class.getResource("scena7-view.fxml"));
        Scene scena7 = new Scene(fxmlLoader7.load(), 320, 240);
        kab27Application.scena7 = scena6;
        
        stage.setTitle("kab27!");
        stage.setScene(scenaGlavna);
        stage.show();
    }
}
