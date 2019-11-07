package mirage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class LoginController {

    //USERNAME AND PASSWORD VARIABLES TO CHECK
    String username = "admin";
    String password = "password";
    String checkUser, checkPass;

    //USERNAME FIELD
    @FXML
    private TextField passwordText;

    //PASSWORD FIELD
    @FXML
    private TextField usernameText;

    @FXML
    //EXIT BUTTON ACTION
    void exitAction(ActionEvent event) {
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure you would like to Exit?", " ", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank You for using Mirage.\nCheck out our Website: www.mirage.com");
            Platform.exit();
        } else {
        }
    }

    @FXML
    //LOGIN BUTTON ACTION
    void loginAction(ActionEvent event) throws IOException {
        checkUser = usernameText.getText();
        checkPass = passwordText.getText();
        if (checkUser.equals(username) && checkPass.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome Back!");
            //LOAD NEW SCENE (HomePage)
            Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
            Scene home_page_scene = new Scene(home_page_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(home_page_scene);
            app_stage.sizeToScene();
            app_stage.show();
        } else {
            //INCORRECT LOGIN INFO
            JOptionPane.showMessageDialog(null, "Wrong Username or Passowrd. Please try again.");
            usernameText.clear();
            passwordText.clear();
        }
    }
}
