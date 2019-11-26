

package xoxo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class YesOrNoCloseAlertBox {    
    private static Stage stage;
    public static boolean answer;
    public static void displayAlertBox() throws IOException {
        
        Scene scene;
        stage = new Stage();
        ChangeSceneClass changeSceneClass = null;  
        
        changeSceneClass = new ChangeSceneClass();
        
        scene = changeSceneClass.installScene("FXMLDocuments/AlertBox");
        
        stage.setTitle("Game XOXO");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait(); 
        
    }
    
    public static void handleYesKey(Key key){
        key.setKey(true);
        setAnswer(key.isKey());
        stage.close();
    }
    public static void handleNoKey(Key key){
        key.setKey(false);
        setAnswer(key.isKey());
        stage.close();
    }
    
    private static void setAnswer(boolean  b){
        answer = b;
    }
    
} 
