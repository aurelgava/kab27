package com.projects.kab27;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MainClass.class.getResource("mainMenu" +
                "-view.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 320, 240);


        stage.setTitle("Projekat 27!");
        stage.setScene(scene1);
        stage.show();
    }
}
