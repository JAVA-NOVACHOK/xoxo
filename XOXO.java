/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoxo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ARTEM
 */
public class XOXO extends Application {
    
    private static Scene scene;
    private static ChangeSceneClass changeScene;
    @Override
    public void start(Stage stage) throws Exception {
        changeScene = new ChangeSceneClass();
        
        scene = changeScene.getScene();
        
        changeScene.setScene("viper.css");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }

    public Scene getScene() {
        return scene;
    }    
    
    public static ChangeSceneClass getSetScene(){
        return changeScene;
    }
    
    
    
    
}
