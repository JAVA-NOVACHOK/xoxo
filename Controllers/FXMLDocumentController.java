/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoxo.Controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import xoxo.ButtonClass;
import xoxo.Key;


public class FXMLDocumentController implements Initializable{

    @FXML
    private  ButtonClass buttonClass;
    @FXML
    public static ArrayList<Button[]> arrButtons = new ArrayList<>();   
    @FXML
    public static final ArrayList<Key> BUTTONS = new ArrayList<>(); 
    @FXML
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
        buttonClass.handle(key1);                
        }
    @FXML  
        public void handle2(){            
        buttonClass.handle(key2);                
        }
    @FXML  
        public void handle3(){            
        buttonClass.handle(key3);                 
        }    
    @FXML  
        public void handle4(){           
        buttonClass.handle(key4);                 
        }
    @FXML  
        public void handle5(){          
        buttonClass.handle(key5);                 
        }
    @FXML  
        public void handle6(){
        buttonClass.handle(key6);               
        }   
    @FXML  
        public void handle7(){
        buttonClass.handle(key7);
        }
    @FXML  
        public void handle8(){        
        buttonClass.handle(key8);                
        }
    @FXML  
        public void handle9(){        
        buttonClass.handle(key9);                 
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
    public void initialize(URL location, ResourceBundle resources){
        buttonClass = new ButtonClass();
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
    
