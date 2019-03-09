package sample;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ComponentMessage extends Label{
    private static final String urlDefault = "sample/resources/image/defaultIco.jpg";
   // private final Label label;
 //   private ImageView img;
//    private static StringBuilder stringBuilder;

    public ComponentMessage(String message, String url){
//      stringBuilder = new StringBuilder ();
//      setStringBuilder(message);
        this.setText(message);
        this.setId ("label_msg");
        //if (url == null){
      //      img = new ImageView (urlDefault);
        //}
    //    else img = new ImageView (url);
    //    img.setId ("img_msg");

//        this.getStylesheets ().add (getClass ().getResource ("sample/resources/css/style_commsg.css").toExternalForm ());
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
