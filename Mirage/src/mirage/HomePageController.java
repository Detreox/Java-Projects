package mirage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class HomePageController implements Initializable {

    @FXML
    //EXIT BUTTON ACTION
    void exitAction(ActionEvent event) {
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure you would like to Exit?", "EXIT", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank You for using Mirage.\nCheck out our Website: www.mirage.com");
            Platform.exit();
        } else {
        }
    }

    @FXML
    //ACCOUNT INFO
    void accountinfoAction(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Currently Not Available", "Error", JOptionPane.ERROR_MESSAGE);
    }

    @FXML
    //ACCOUNT EDIT
    void accounteditAction(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Currently Not Available", "Error", JOptionPane.ERROR_MESSAGE);
    }

    @FXML
    //SOFTWARE INFO
    void softwareinfoAction(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Mirage Version: 0.6.12");
    }

    @FXML
    //LOAD NEW SCENE (Browser)
    void gotoBrowser(ActionEvent event) throws IOException {
        Parent browser_parent = FXMLLoader.load(getClass().getResource("FXMLBrowser.fxml"));
        Scene browser_scene = new Scene(browser_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(browser_scene);
        app_stage.sizeToScene();
        app_stage.setResizable(true);
        app_stage.show();
    }

      @FXML
    //LOAD NEW SCENE (Netflix)
    void gotoNetflix(ActionEvent event) throws IOException {
        Parent netflix_parent = FXMLLoader.load(getClass().getResource("FXMLNetflix.fxml"));
        Scene netflix_scene = new Scene(netflix_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(netflix_scene);
        app_stage.sizeToScene();
        app_stage.setResizable(true);
        app_stage.show();
    }
    
    @FXML
    //LOAD NEW SCENE (YouTube)
    void gotoYouTube(ActionEvent event) throws IOException {
        Parent youtube_parent = FXMLLoader.load(getClass().getResource("FXMLYouTube.fxml"));
        Scene youtube_scene = new Scene(youtube_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(youtube_scene);
        app_stage.sizeToScene();
        app_stage.setResizable(true);
        app_stage.show();
    }
    
    @FXML
    //LOAD NEW SCENE (Gmail)
    void gotoGmail(ActionEvent event) throws IOException {
        Parent gmail_parent = FXMLLoader.load(getClass().getResource("FXMLGmail.fxml"));
        Scene gmail_scene = new Scene(gmail_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(gmail_scene);
        app_stage.sizeToScene();
        app_stage.setResizable(true);
        app_stage.show();
    }
    
    @FXML
    //LOAD NEW SCENE (Facebook)
    void gotoFacebook(ActionEvent event) throws IOException {
        Parent facebook_parent = FXMLLoader.load(getClass().getResource("FXMLFacebook.fxml"));
        Scene facebook_scene = new Scene(facebook_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(facebook_scene);
        app_stage.sizeToScene();
        app_stage.setResizable(true);
        app_stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
