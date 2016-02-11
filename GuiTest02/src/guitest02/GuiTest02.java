/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest02;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.controlsfx.dialog.FontSelectorDialog;

/**
 *
 * @author ba20034
 */
public class GuiTest02 extends Application {
  
  @Override
  public void start(Stage primaryStage) {
    Button btn = new Button();
    btn.setText("日経ソフトウェア");
    btn.setOnAction(new EventHandler<ActionEvent>() {
      
      @Override
      public void handle(ActionEvent event) {
//        System.out.println("Hello World!");
        FontSelectorDialog fsd =new FontSelectorDialog(btn.getFont());
        Optional<Font> selectedFont=fsd.showAndWait();
        btn.setFont(selectedFont.get());
      }
    });
    
    StackPane root = new StackPane();
    root.getChildren().add(btn);
    
    Scene scene = new Scene(root, 300, 250);
    
    primaryStage.setTitle("Hello World!");
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
