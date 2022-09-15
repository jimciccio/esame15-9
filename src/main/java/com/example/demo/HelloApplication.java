package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        int j = 467;

        if(j % 2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }




    }

    public static void main(String[] args) {
        launch();
    }
}