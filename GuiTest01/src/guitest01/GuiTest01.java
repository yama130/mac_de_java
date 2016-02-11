/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
        
        
/**
 *
 * @author ba20034
 */
public class GuiTest01 extends Application {
  
  @Override
  public void start(Stage primaryStage) {
    Button btn = new Button();
    btn.setText("日経ソフトウェアは");
    btn.setOnAction(new EventHandler<ActionEvent>() {
      
      @Override
      public void handle(ActionEvent event) {
//        System.out.println("毎月２４日発売です");
         Alert al =new Alert(AlertType.INFORMATION);
         al.setHeaderText("");
         al.setContentText("毎月２４日発売です!");
         al.showAndWait();
      }
    });
    
    StackPane root = new StackPane();
    root.getChildren().add(btn);
    
    Scene scene = new Scene(root, 300, 150);
    
    primaryStage.setTitle("GUI TEST01");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
  
}
