/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoxo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import xoxo.Controllers.FXMLDocumentController1;
import static xoxo.Controllers.FXMLDocumentController1.BUTTONS;

/**
 *
 * @author ARTEM
 */
public class XOXO extends Application {
    
    public static Scene scene;
    private static ChangeSceneClass changeScene;
    private Stage stage;
//    private String pathCSS = "D:\\Dropbox\\XOXO\\src\\xoxo\\CSS_Files";
    private String pathCSS = "C:\\Users\\Master\\Dropbox\\XOXO\\src\\xoxo\\CSS_Files";
    @Override
    public void start(Stage window) throws Exception {
        stage = window;
        changeScene = new ChangeSceneClass();
        stage.setOnCloseRequest(e -> {
            e.consume();             
            closeProgram();
            });
        
        stage.setTitle("Game XOXO");
        BorderPane root = new BorderPane();        
        GridPane pane = FXMLLoader.load(getClass().getResource("FXMLDocuments/FXMLDocument_1.fxml"));
        root.setCenter(pane);
        BorderPane.setMargin(pane, new Insets(0, 0, 0, 90));
        MenuBar bar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuStyles = new Menu("Styles");
        Menu menuSize = new Menu("Size");
        MenuItem restartItem = new MenuItem("Restart");        
        restartItem.setOnAction((ActionEvent e) -> {
            FXMLDocumentController1.activate();
        });
        menuFile.getItems().add(restartItem);
        menuEdit.getItems().addAll(menuStyles,menuSize);
        createMenu(menuStyles,pathCSS);
        bar.getMenus().addAll(menuFile,menuEdit);
        root.setTop(bar);
        VBox vBox = new VBox();
        Button activate = new Button("Restart");
        activate.setId("button_restart");
        vBox.getChildren().addAll(activate);
        vBox.setPrefWidth(70);
        activate.setTranslateX(55);
        activate.setTranslateY(200);
        activate.setOnAction(e -> {
            FXMLDocumentController1.activate();
        });
        
        root.setLeft(vBox);
        scene = new Scene(root,650,450);
        
        changeScene.setScene("CSS_Files/Viper.css", scene);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }

    public static Scene getScene() {
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
    
    public static ArrayList<String> fileNames(String directoryPath) {
    File dir = new File(directoryPath);
    ArrayList<String> files  = new ArrayList<>();
    if(dir.isDirectory()){
        File[] listFiles = dir.listFiles();
        for(File file : listFiles){
            if(file.isFile()) {
                files.add(file.getName());
            }
        }
    }
    return files;
}
    
    public void createMenu(Menu menu,String path){
        ArrayList<String> arr = fileNames(path);
        for(String str:arr){
            MenuItem item = new MenuItem(str.substring(0,str.indexOf(".css")));            
            menu.getItems().add(item);
            item.setOnAction(e->{
                changeScene.setScene("CSS_Files/" + str, scene);
            });
          
        }
    }
    
    
    
    
    
}
