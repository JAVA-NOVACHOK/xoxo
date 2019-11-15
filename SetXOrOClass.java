
package xoxo;

import java.util.List;
import javafx.scene.control.Button;


public class SetXOrOClass {

    public static boolean isX = true;
    public void handle(Button button){                    
            if(isX){
                button.setText("X");
                isX = false;
            }        
            else{
                button.setText("O");
                isX = true;
            }            
//            changeWinnerColorButtons(arrButtons());            
        }
    public String takeButtonArray(Button...buttons){
//            StringBuilder sb = new StringBuilder();
            String text = "";
            for (Button button : buttons) {
                text = text + (button.getText()).toString();
                
            }
//            System.out.println(text);
            return text;
        }
        
        public void changeWinnerColorButtons(List<Button[]> list){
            
            for (Button[] buttons : list) {
                String text = takeButtonArray(buttons);
                if(text.equals("XXX")
                        || text.equals("OOO")){
                    for (Button button : buttons) {
                        button.setStyle("-fx-background-color: crimson");
                    }
                }
            }
        }


}
