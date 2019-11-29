
package xoxo.FactoryPackege;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public interface SceneFactory {    
    void create(GridPane pane,BorderPane root,Stage stage);   
}
