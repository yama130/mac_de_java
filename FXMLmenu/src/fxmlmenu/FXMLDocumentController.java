/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlmenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author ba20034
 */
public class FXMLDocumentController implements Initializable {
  
  @FXML
  private void handleMenuFileExit(ActionEvent event){
    Platform.exit();
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  
  
}
