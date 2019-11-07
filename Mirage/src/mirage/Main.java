package mirage;

/*
TO DO:
Placeholders for icons have been done >> Need to implement the correct icons.
Account Menu functionality has yet to be implemented. Basic Options like "About" and "Exit" have already been added.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Mirage");
        stage.setResizable(false);
        stage.getIcons().add(new Image("icon.png"));
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
