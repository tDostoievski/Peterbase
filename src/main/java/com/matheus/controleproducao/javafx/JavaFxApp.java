package com.matheus.controleproducao.javafx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.matheus.controleproducao.Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JavaFxApp extends Application{
    
    private ConfigurableApplicationContext springContext;


    @Override
    public void init() throws Exception {
        springContext = new SpringApplicationBuilder(Main.class).run();
    }

    @Override
    public void start(Stage primaryStage){
        StackPane root = new StackPane(new Label("Olá JavaFX + Spring!"));
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Controle de Produção");
        primaryStage.show();
    }

    @Override 
    public void stop() throws Exception {
        springContext.close();
    }
}
