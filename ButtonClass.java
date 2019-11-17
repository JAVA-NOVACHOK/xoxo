

package xoxo;

import java.util.List;
import javafx.scene.control.Button;
import static xoxo.FXMLDocumentController.BUTTONS;
import static xoxo.FXMLDocumentController.isX;

public class ButtonClass {
    
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
                disable(true);
            }
        });
        }
    public void disable(boolean b){
        for(Button button:FXMLDocumentController.BUTTONS){
            button.setDisable(b);
        }
    }
    public void activate(){
        for(Button button:BUTTONS){
                button.setText("");
                button.setStyle("-fx-background-color: #16a085;");                
            }
            isX = true;
    }
} 
