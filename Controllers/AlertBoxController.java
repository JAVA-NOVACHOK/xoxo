

package xoxo.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import xoxo.Key;
import xoxo.YesOrNoCloseAlertBox;

public class AlertBoxController implements Initializable{
//    YesOrNoCloseAlertBox yesOrNoCloseAlertBox;
    @FXML
    private Key yes;
    @FXML
    private Key no;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        yesOrNoCloseAlertBox = new YesOrNoCloseAlertBox();
    }
    
    public void handleYesKey(){
        YesOrNoCloseAlertBox.handleYesKey(yes);
    } 
    public void handleNoKey(){
        YesOrNoCloseAlertBox.handleNoKey(no);
    } 
} 
