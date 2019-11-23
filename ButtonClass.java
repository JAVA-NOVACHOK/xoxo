

package xoxo;

import xoxo.Controllers.FXMLDocumentController;
import java.util.List;
import javafx.scene.control.Button;
import static xoxo.Controllers.FXMLDocumentController.BUTTONS;
import static xoxo.Controllers.FXMLDocumentController.isX;

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
                    button.setId("winner_buttons");                    
                }                
                disable(true);
            }
        });
        }
    public void disable(boolean b){
        FXMLDocumentController.BUTTONS.forEach((button) -> {
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
