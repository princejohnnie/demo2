package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        try {
            Connection dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db", "root", "Yungjohn4619#");
            welcomeText.setText("Welcome to JavaFX Application!");
            System.out.println(dbConn.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }



    }
}