
package xoxo;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class ChangeSceneClass {
private Scene scene;

    public ChangeSceneClass() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        scene = new Scene(root);
    }

    public Scene getScene() {
        
        return scene;
    }
    
    public void setScene(String css){
        scene.getStylesheets().add(getClass().getResource(css).toExternalForm());
    }
    
    
    
    

}
