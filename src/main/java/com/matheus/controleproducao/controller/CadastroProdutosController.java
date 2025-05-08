package com.matheus.controleproducao.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class CadastroProdutosController {
    
    @FXML
    private StackPane campoFormulario;

    @FXML 
    public void abrirFormularioLotes(){
        try {
            // Carrega o FXML do cadastro de produtos
            Parent formulario = FXMLLoader.load(getClass().getResource("/templates/formulary.fxml"));
            // Limpa o conteúdo atual do StackPane
            campoFormulario.getChildren().clear();
            // Adiciona o novo conteúdo
            campoFormulario.getChildren().add(formulario);
        }
        catch (IOException e) {
            e.printStackTrace();
        }   
    }
}
