package com.matheus.controleproducao.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class MainController {

    @FXML
    private StackPane contentPane; // Este StackPane precisa estar com fx:id="contentPane" no seu mainframe.fxml

    @FXML
    public void abrirCadastroProdutos() {
        try {
            System.out.println("Botão clicado");
            // Carrega o FXML do cadastro de produtos
            Parent cadastroProdutos = FXMLLoader.load(getClass().getResource("/templates/cadastroprodutos.fxml"));
            // Limpa o conteúdo atual do StackPane
            contentPane.getChildren().clear();
            // Adiciona o novo conteúdo
            contentPane.getChildren().add(cadastroProdutos);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clear(){

        contentPane.getChildren().clear();

    }
}

