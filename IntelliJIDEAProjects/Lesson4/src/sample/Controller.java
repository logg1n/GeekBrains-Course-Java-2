package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextFlow;

public class Controller {
    @FXML
    private Button btn_Send;

    @FXML
    private TextField text_Input;

    @FXML
    private TextFlow text_Chat;

    @FXML
    private void enterPressKey(KeyEvent event){
        switch (event.getCode()){
            case ENTER: text_Input.setText ("");break;//addChatMessage();break;
            case ESCAPE: text_Input.setFocusTraversable (false);
        }
    }

    @FXML
    private void click(ActionEvent event) {
                addChatMessage ();
    }

    private void addChatMessage(){
        ComponentMessage com = new ComponentMessage (text_Input.getText (),"");
        text_Chat.getChildren ().add (com);
        text_Input.setText ("");
        text_Chat.layout ();
    }
}
