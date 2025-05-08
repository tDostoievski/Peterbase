package com.matheus.controleproducao.javafx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.matheus.controleproducao.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class JavaFxApp extends Application{
    
    private ConfigurableApplicationContext springContext;


    @Override
    public void init() throws Exception {
        springContext = new SpringApplicationBuilder(Main.class).run();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Font.loadFont(getClass().getResource("/fonts/inter.ttf").toExternalForm(), 20);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/templates/mainframe.fxml"));
        Parent root = loader.load(); 
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu Principal");
        scene.getStylesheets().add(getClass().getResource("/templates/stylesheets.css").toExternalForm());
        primaryStage.show();
    }

    @Override 
    public void stop() throws Exception {
        springContext.close();
    }
}
