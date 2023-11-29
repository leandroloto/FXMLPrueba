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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author Discar
 */
public class ViewLoginController implements Initializable {

    @FXML
    private TextField txtUser;
    
    @FXML
    private PasswordField txtPassword;
    
    @FXML
    private Button btnLogin;
    
    @FXML
    private void eventKey(KeyEvent event){
        Object evt = event.getSource();
        
        if(evt.equals(txtUser)){
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        }else if(evt.equals(txtPassword)){
            
        }
                
                
    }
    
    @FXML
    private void eventAction(ActionEvent event){
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        
    }    
    
}
