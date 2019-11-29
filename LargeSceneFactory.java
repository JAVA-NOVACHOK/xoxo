
package xoxo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import xoxo.FactoryPackege.SceneFactory;


public class LargeSceneFactory implements SceneFactory{

   private GridPane create() {
        GridPane pane = null;
        try {            
             pane = FXMLLoader.load(getClass().getResource("FXMLDocuments/Large_Size.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(SmallSceneFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
       return pane;
    }
    
    @Override
    public void create(GridPane pane, BorderPane root,Stage stage) {
        root.getChildren().remove(pane);
                GridPane p = create();
                root.setCenter(p);
                BorderPane.setMargin(p, new Insets(0, 0, 0, 100));
                stage.setWidth(820);
                stage.setHeight(700);
        
    }

}
