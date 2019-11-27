

package xoxo;

import java.util.List;
import javafx.scene.control.Button;
import static xoxo.Controllers.FXMLDocumentController1.BUTTONS;
import static xoxo.Controllers.FXMLDocumentController1.isX;
import xoxo.Controllers.FXMLDocumentController1;

public class ButtonClass {
    
    public void handle(Key button){ 
        
        if(!button.isKey()){                        
            if(isX){
                button.setText("X");
                isX = false;
            }        
            else{
                button.setText("O");
                isX = true;
            }
        }
            button.setKey(true);
            changeColorWinnerButtons(FXMLDocumentController1.arrButtons);  
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
                    button.setId("winner_buttons");                    
                }                
                disable(true);
            }
        });
        }
    public void disable(boolean b){
        FXMLDocumentController1.BUTTONS.forEach((button) -> {
            button.setDisable(b);
        });
    }
    public void activate(){
        for(Button button:BUTTONS){
                button.setText("");
                button.setId("button");                
            }        
            isX = true;
    }
} 
