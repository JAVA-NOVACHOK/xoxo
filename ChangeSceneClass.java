
package xoxo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class ChangeSceneClass {
 
   
    public Scene installScene(String source) throws IOException{
    
       Parent root = FXMLLoader.load(getClass().getResource(source + ".fxml"));
    
        Scene  scene = new Scene(root);
      
        return scene;
    }
    
    public void setScene(String css){
        XOXO.scene.getStylesheets().clear();
        XOXO.scene.getStylesheets().add(getClass().getResource(css).toExternalForm());
    }
    
    public void setViperScene(){
    try {
        XOXO.setScene("viper");
    } catch (IOException ex) {
        Logger.getLogger(ChangeSceneClass.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void setRedDragonScene(){
    try {
        XOXO.setScene("redDragon");
    } catch (IOException ex) {
        Logger.getLogger(ChangeSceneClass.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
//    public Scene getScene(){
//        return scene;
//    }
    
    
    
    
    
    

}
