package com.matheus.controleproducao;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matheus.controleproducao.javafx.JavaFxApp;

import javafx.application.Application;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Application.launch(JavaFxApp.class, args);
    }
}


