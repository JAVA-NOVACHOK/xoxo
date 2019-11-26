/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoxo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public static Scene scene;
    private static ChangeSceneClass changeScene;
    private Stage stage;
    @Override
    public void start(Stage window) throws Exception {
        stage = window;
        changeScene = new ChangeSceneClass();
        stage.setOnCloseRequest(e -> {
            e.consume();             
            closeProgram();
            });
        
        stage.setTitle("Game XOXO");
        scene = changeScene.installScene("FXMLDocuments/FXMLDocument");       
        changeScene.setViperScene();
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
    
    public void closeApplication(){
        stage.close();
    }
    
    public void closeProgram(){
        try {        
            YesOrNoCloseAlertBox.displayAlertBox();
        } catch (IOException ex) {
            Logger.getLogger(XOXO.class.getName()).log(Level.SEVERE, null, ex);
        }
                if(YesOrNoCloseAlertBox.answer)
                    stage.close();
    }
    
    public static void setScene(String css) throws IOException{
        changeScene.setScene("CSS_Files/" + css +".css");
//        scene = changeScene.getScene();
    }
    
    
    
}
