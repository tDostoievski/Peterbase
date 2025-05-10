package com.matheus.controleproducao.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.matheus.controleproducao.model.Data;
import com.matheus.controleproducao.model.Moinho;
import com.matheus.controleproducao.model.ParametrosDispersao;
import com.matheus.controleproducao.model.Pigmento;
import com.matheus.controleproducao.model.Products;
import com.matheus.controleproducao.service.LotesService;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



// Liga a interface gráfica com a modelagem 

public class LotesFormularyController {

// Definindo variaveis
    @FXML private TextField nomeField, codigoField;
    @FXML private TextField loteField, revisaoField, cargaField;
    @FXML private TextField diaField, mesField, anoField;
    @FXML private TextField codigo_pigmentoField, lote_pigmentoField;
    @FXML private TextField numero_panelaField;
    @FXML private TextField numero_dispersorField;
    @FXML private TextField mescla_viscosidadeField, mescla_velocidadeField, mescla_temperaturaField, mescla_tempoField;
    @FXML private TextField premescla_viscosidadeField, premescla_velocidadeField, premescla_temperaturaField, premescla_tempoField;
    @FXML private TextField numero_moinhoField, rotacao_moinhoField, rotacao_bombaField, pressaoField, vazaoField, passadasField, tempo_moinhoField;
    @FXML private Button cadastrarButton;

    @Autowired
    private LotesService lotesService; 

    @FXML 
    public void initialize (){
        cadastrarButton.setOnAction(event -> cadastrarLote());
    }

    @FXML
    public void cadastrarLote(){
        try {
            Products produto = new Products(
                nomeField.getText(),
                Integer.parseInt(codigoField.getText())
            );

            String lote = loteField.getText(); 
            int revisao = Integer.parseInt(revisaoField.getText());
            int carga = Integer.parseInt(cargaField.getText()); 

            Data data = new Data(
                Integer.parseInt(diaField.getText()),
                Integer.parseInt(mesField.getText()),
                Integer.parseInt(anoField.getText())
            );

            ParametrosDispersao mescla = new ParametrosDispersao(
                Integer.parseInt(mescla_velocidadeField.getText()),
                Integer.parseInt(mescla_tempoField.getText()),
                Integer.parseInt(mescla_temperaturaField.getText()),
                Integer.parseInt(mescla_viscosidadeField.getText())
            ); 

            ParametrosDispersao premescla = new ParametrosDispersao(
                Integer.parseInt(premescla_velocidadeField.getText()),
                Integer.parseInt(premescla_tempoField.getText()),
                Integer.parseInt(premescla_temperaturaField.getText()),
                Integer.parseInt(premescla_viscosidadeField.getText())
            );

            Moinho moinho = new Moinho(
                numero_moinhoField.getText(),
                Integer.parseInt(rotacao_moinhoField.getText()),
                Integer.parseInt(rotacao_bombaField.getText()),
                Double.parseDouble(pressaoField.getText()),
                Integer.parseInt(tempo_moinhoField.getText()),
                Double.parseDouble(vazaoField.getText()),
                Integer.parseInt(passadasField.getText())
            );

            Pigmento pigmento = new Pigmento(
                Integer.parseInt(codigo_pigmentoField.getText()),
                lote_pigmentoField.getText()
            );

            Panela panela = new Panela(
                
            );




        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }
}
