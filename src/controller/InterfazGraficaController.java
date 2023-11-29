/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Discar
 */
public class InterfazGraficaController implements Initializable {
    
    //SE INGRESA O EDITA PARA EL BOTON ESPECIFICO.
    @FXML
    private Label label;
    
    @FXML
    private Button Presione;
    
    @FXML
    private void eventButton(ActionEvent event){
        JOptionPane.showMessageDialog(null, "Hola bienvenido!");
    }
    
    @FXML
    private TextField text1, text2, text3, text4;
    
    @FXML
    public void eventKey(KeyEvent event){
        Object evt = event.getSource();
        
        if(evt.equals(text1)){
            if(!Character.isLetter(event.getCharacter().charAt(0)) && !event.getCharacter().equals(" ")){
                event.consume();
            }
        }else if(evt.equals(text2)){
            if(!Character.isDigit(event.getCharacter().charAt(0)))
                event.consume();
            
        }else if(evt.equals(text3)){
            if(!Character.isLetter(event.getCharacter().charAt(0)) && !Character.isDigit(event.getCharacter().charAt(0)) && !event.getCharacter().equals(" "))
                event.consume();
                
        }else if(evt.equals(text4)){
            if(text4.getText().length() > 7){
                event.consume();
            }
            
        }
            
            
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        
        
    }    
    
}
