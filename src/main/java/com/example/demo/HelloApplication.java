package com.example.demo;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        check();
    }

    public static void main(String[] args) {
        launch();
    }

    public boolean check(){
        int j = 465;

        return j % 2 == 0;
    }
}