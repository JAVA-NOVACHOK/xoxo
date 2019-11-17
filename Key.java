

package xoxo;

import javafx.scene.control.Button;

public class Key extends Button{
    private boolean isKey;

    public Key() {
        isKey = false;
    }

    public boolean isKey() {
        return isKey;
    }

    public void setKey(boolean isKey) {
        this.isKey = isKey;
    }
    
    
    
} 
