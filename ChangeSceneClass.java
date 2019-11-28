
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
    
    public void setScene(String css,Scene scene){
        scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource(css).toExternalForm());
    }
    

    

}
