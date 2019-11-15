/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoxo;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author ARTEM
 */
public class FXMLDocumentController implements Initializable{
    
    
    public static ArrayList<Button[]> arrButtons = new ArrayList<>;    
    
    public static boolean isX = true;
    
    public boolean isKey1 = true;
    public boolean isKey2 = true;
    public boolean isKey3 = true;
    public boolean isKey4 = true;
    public boolean isKey5 = true;
    public boolean isKey6 = true;
    public boolean isKey7 = true;
    public boolean isKey8 = true;
    public boolean isKey9 = true;    

    

        
    
    @FXML
    public Button key2;
    @FXML
    public Button key1; 
    @FXML
    public Button key3; 
    @FXML
    public Button key4;
    @FXML
    public Button key5; 
    @FXML
    public Button key6; 
    @FXML
    public Button key7; 
    @FXML
    public Button key8; 
    @FXML
    public Button key9; 
    
    
    
    
    
    @FXML  
        public void handle1(){
            if(isKey1){
        handle(key1);                 
        isKey1 = false;
            }
    }
    @FXML
        public void handle2(){
            if(isKey2){
        handle(key2);
        isKey2 = false;
            }
    }
    @FXML
        public void handle3(){
            if(isKey3){
        handle(key3);
        isKey3 = false;
            }
    }
    @FXML
        public void handle4(){
            if(isKey4){
        handle(key4);
        isKey4 = false;
            }
    }
    @FXML
        public void handle5(){
            if(isKey5){
        handle(key5);
        isKey5 = false;
            }
    }
    @FXML
        public void handle6(){
            if(isKey6){
        handle(key6);
        isKey6 = false;
            }
    }
    @FXML
        public void handle7(){
            if(isKey7){
        handle(key7);
        isKey7 = false;
            }
    }
    @FXML
        public void handle8(){
            if(isKey8){
        handle(key8);
        isKey8 = false;
            }
    }
    @FXML
        public void handle9(){
            if(isKey9){
        handle(key9);
        isKey9 = false;
            }
    }     
            
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        arrButtons.add(new Button[]{key1,key2,key3});
        arrButtons.add(new Button[]{key4,key5,key6});
        arrButtons.add(new Button[]{key7,key8,key9});
        arrButtons.add(new Button[]{key1,key8,key6});
        arrButtons.add(new Button[]{key7,key2,key4});
        arrButtons.add(new Button[]{key3,key5,key9});
        arrButtons.add(new Button[]{key1,key4,key9});
        arrButtons.add(new Button[]{key3,key4,key8});
    }
    
   public void handle(Button button){                    
            if(isX){
                button.setText("X");
                isX = false;
            }        
            else{
                button.setText("O");
                isX = true;
            }            
            changeColorWinnerButtons(FXMLDocumentController.arrButtons);            
        }
    public String readButtonsText(Button...buttons){
            StringBuilder sb = new StringBuilder();            
            for (Button button : buttons) {
                sb.append(button.getText()).toString();                
            }            
            return sb.toString();
        }
        
    public void changeColorWinnerButtons(List<Button[]> list){
            
        list.forEach((buttons) -> {
            String text = readButtonsText(buttons);
            if (text.equals("XXX")
                    || text.equals("OOO")) {
                for (Button button : buttons) {
                    button.setStyle("-fx-background-color: crimson");
                }
            }
        });
        }        
     
}
    

