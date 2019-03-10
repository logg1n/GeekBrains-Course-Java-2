package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class Controller {
    @FXML
    private Button btn_Send;

    @FXML
    private TextField text_Input;

    @FXML
    private VBox vbox_text_chat;

    @FXML
    private void enterPressKey(KeyEvent event){
        switch (event.getCode()){
            case ENTER: addChatMessage ();break;
            case ESCAPE: text_Input.setFocusTraversable (false);
        }
    }

    @FXML
    private void click(ActionEvent event) {
                addChatMessage ();
    }

    private void addChatMessage(){
        ComponentMessage group = new ComponentMessage (text_Input.getText () ,"");
        group.setVisible (true);
        group.setStyle ("-fx-end-margin: 10");
        vbox_text_chat.getChildren ().add (group);
        text_Input.setText ("");
        vbox_text_chat.layout ();
    }
}
