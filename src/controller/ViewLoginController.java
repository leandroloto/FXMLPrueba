/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;
import model.Users;

/**
 * FXML Controller class
 *
 * @author Discar
 */
public class ViewLoginController implements Initializable {

    private Users model = new Users();
    
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
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        }
                
                
    }
    
    @FXML
    private void eventAction(ActionEvent event){
        
        Object evt = event.getSource();
        
        if(evt.equals(btnLogin)){
            if(!txtUser.getText().isEmpty() && !txtPassword.getText().isEmpty()){
                String user = txtUser.getText();
                String pass = txtPassword.getText();
                
                int state = model.loginConex(user, pass);
                if(state == 1){
                    loadStage("/view/viewPrincipal.fxml", event);
                    JOptionPane.showMessageDialog(null, "Bienvenido "+user);
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña son incorrectos. Verifique.");
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"Error al iniciar sesion, datos incorrectos."+" Advertencia: "+JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void loadStage(String url, Event event){
        
        try{
            
            Object eventSource = event.getSource();
            Node sourceAsNode = (Node) eventSource;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window;            
            stage.hide();
            
            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
            
            newStage.setOnCloseRequest(new EventHandler<WindowEvent>(){
                @Override
                public void handle(WindowEvent event){
                    Platform.exit();
                }
            });
            
        } catch (IOException ex) {
            Logger.getLogger(ViewLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
