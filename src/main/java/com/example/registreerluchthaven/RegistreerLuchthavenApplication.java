package com.example.registreerluchthaven;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistreerLuchthavenApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RegistreerLuchthavenApplication.class.getResource("RegistreerLuchthaven.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 725, 529);
        stage.setTitle("RegistreerLuchthaven!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}