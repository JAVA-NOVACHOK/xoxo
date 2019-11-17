/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoxo;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class FXMLDocumentController implements Initializable{
    @FXML
    private  ButtonClass buttonClass;
    @FXML
    public static ArrayList<Button[]> arrButtons = new ArrayList<>();   
    @FXML
    public static final ArrayList<Key> BUTTONS = new ArrayList<>(); 
    
    public static boolean isX = true;        
    
    @FXML
    public Key key2;
    @FXML
    public Key key1; 
    @FXML
    public Key key3; 
    @FXML
    public Key key4;
    @FXML
    public Key key5; 
    @FXML
    public Key key6; 
    @FXML
    public Key key7; 
    @FXML
    public Key key8; 
    @FXML
    public Key key9; 
    @FXML
    public Button restart;
    
    
    @FXML  
        public void handle1(){
            if(!key1.isKey()){
        buttonClass.handle(key1);                 
        key1.setKey(true);
            }
    }
    @FXML  
        public void handle2(){
            if(!key2.isKey()){
        buttonClass.handle(key2);                 
        key2.setKey(true);
            }
    }
    @FXML  
        public void handle3(){
            if(!key3.isKey()){
        buttonClass.handle(key3);                 
        key3.setKey(true);
            }
    }
    @FXML  
        public void handle4(){
            if(!key4.isKey()){
        buttonClass.handle(key4);                 
        key4.setKey(true);
            }
    }
    @FXML  
        public void handle5(){
            if(!key5.isKey()){
        buttonClass.handle(key5);                 
        key5.setKey(true);
            }
    }
    @FXML  
        public void handle6(){
            if(!key6.isKey()){
        buttonClass.handle(key6);                 
        key6.setKey(true);
            }
    }
    @FXML  
        public void handle7(){
            if(!key7.isKey()){
        buttonClass.handle(key7);                 
        key7.setKey(true);
            }
    }
    @FXML  
        public void handle8(){
            if(!key8.isKey()){
        buttonClass.handle(key8);                 
        key8.setKey(true);
            }
    }
    @FXML  
        public void handle9(){
            if(!key9.isKey()){
        buttonClass.handle(key9);                 
        key9.setKey(true);
            }
    }
        @FXML
        public void activate(){       
            buttonClass.disable(false);
            buttonClass.activate();
            BUTTONS.forEach((key) -> {
                key.setKey(false);
        });
        }   

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        BUTTONS.addAll(Arrays.asList(key1,key2,key3,key4,key5,key6,key7,key8,key9));
        restart.setId("button_restart");
        arrButtons.add(new Button[]{key1,key2,key3});
        arrButtons.add(new Button[]{key4,key5,key6});
        arrButtons.add(new Button[]{key7,key8,key9});
        arrButtons.add(new Button[]{key1,key8,key6});
        arrButtons.add(new Button[]{key7,key2,key4});
        arrButtons.add(new Button[]{key3,key5,key9});
        arrButtons.add(new Button[]{key1,key4,key9});
        arrButtons.add(new Button[]{key3,key4,key8});        
    }    
}
    

