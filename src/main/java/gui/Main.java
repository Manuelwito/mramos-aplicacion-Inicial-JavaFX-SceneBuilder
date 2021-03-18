/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	  @Override
	    public void start(Stage stage) throws Exception {
	        Parent root = FXMLLoader.load(getClass().getResource("viewsandcontrollers/main/Main.fxml"));
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	    }
	    
	  
	  
	  
	    public static void main(String[] args) {
	        launch(args);
	    }
	}

