package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/sample.fxml"));
        Parent parent = loader.load ();

//        Controller controller = loader.getController ();
        Scene scene = new Scene(parent);

        primaryStage.setTitle(" Message Birds");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen ();
        primaryStage.setMinHeight (650);
        primaryStage.setMinWidth (600);
        primaryStage.getIcons().add(new Image (getClass ().getResourceAsStream ("/image/icon.png")));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
