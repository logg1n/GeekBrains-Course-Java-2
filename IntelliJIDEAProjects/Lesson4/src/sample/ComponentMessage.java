package sample;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ComponentMessage extends Group {
    Label label;
    ImageView imageView;
    //   private static final String urlDefault = "/image/defaultIco.jpg";

    //   private ImageView img;
//    private static StringBuilder stringBuilder;


    public ComponentMessage(String message, String url) {
        label = new Label ( );
        label.setId ("label_com");

        imageView = new ImageView (getClass ( ).getResource ("/image/defaultIco.png").toString ( ));
        imageView.setFitWidth (40);
        imageView.setFitHeight (40);

        label.setGraphic (imageView);
        this.getStylesheets ( ).add (ComponentMessage.class.getResource ("/css/style_commsg.css").toExternalForm ( ));
        label.setText (message);

        //      stringBuilder = new StringBuilder ();
//      setStringBuilder(message);
        //if (url == null){
        //    img = new ImageView (urlDefault);
        //}
        //    else img = new ImageView (url);
        //    img.setId ("img_msg");
        this.getChildren ( ).add (label);
        this.setVisible (true);
        this.layout ( );
    }

/*
    protected static String getStringBuilder() {
        return stringBuilder.toString ();
    }

    private static void setStringBuilder(String stringBuilder) {
        this.stringBuilder.append (stringBuilder);
    }
*/
}
