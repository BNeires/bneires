/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author bneir
 */
public class MenuPrincipalController implements Initializable {

    @FXML
    private TextField txtn1;

    @FXML
    private TextField txtn2;

    @FXML
    private TextField txtr;

    @FXML
    private Button som;

    @FXML
    private void soma(ActionEvent e) {
        Double n1 = Double.parseDouble(txtn1.getText());
        Double n2 = Double.parseDouble(txtn2.getText());
        Double somaa = n1 + n2;
        txtr.setText(somaa.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
