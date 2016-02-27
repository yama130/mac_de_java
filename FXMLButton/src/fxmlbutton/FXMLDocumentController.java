/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlbutton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;


/**
 *
 * @author ba20034
 */
public class FXMLDocumentController implements Initializable {
  
  @FXML
  private Label label;
  
  @FXML
  private void handleButtonAction(ActionEvent event) {
//    System.out.println("You clicked me!");
//    label.setText("Hello World!");
    Alert al=new Alert(AlertType.INFORMATION);
    al.setHeaderText("");
    al.setContentText("ポップアップ");
    al.showAndWait();
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  
  
}
