package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField txt;
    private boolean a;

    @FXML
    protected void onHelloButtonClick() {
        a=check(Integer.parseInt(txt.getText()));
        welcomeText.setText(String.valueOf(a));
    }

    public boolean check(int i){

        return i % 2 == 0;
    }
}