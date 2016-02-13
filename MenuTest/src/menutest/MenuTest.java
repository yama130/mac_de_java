/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menutest;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;    
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 *
 * @author ba20034
 */
public class MenuTest extends Application {
  
  @Override
  public void start(Stage primaryStage) {
    BorderPane root =new BorderPane();
    MenuBar menuBar =new MenuBar();
    root.setTop(menuBar);
    Menu menuFile=new Menu("ファイル(_F)");
    menuBar.getMenus().add(menuFile);
    MenuItem menuItemFileExit=new MenuItem("終了(_x)");
    menuItemFileExit.setOnAction(
      new EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent event){
        Platform.exit();
    }});
    menuFile.getItems().add(menuItemFileExit);
    Scene scene = new Scene(root, 300, 250);
    
    primaryStage.setTitle("メニューのテスト");
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
