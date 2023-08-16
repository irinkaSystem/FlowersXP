package com.example.flowersxp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
      @FXML
    Label leftside, centralside, rightside;
    @FXML
    Button masha;
    @FXML
    Button tanya;
    @FXML
    Button day;
    @FXML
    Label dayNumber;
    int dayNumber1=1;
    public void actionOfMasha()
    {
        String s = centralside.getText();
        centralside.setText(rightside.getText());
        rightside.setText(s);
    }
    public void actionOfTanya()
    {
        String s1 = centralside.getText();
        centralside.setText(leftside.getText());
        leftside.setText(s1);
    }
    public void actionOfDay()
    {
        actionOfMasha();
        actionOfTanya();
        day.setText("День ");
        dayNumber1++;
        System.out.println(""+dayNumber1);
        dayNumber.setText("прошло дней"+ dayNumber1);
    }
    }

    //@FXML
    //protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    //}
