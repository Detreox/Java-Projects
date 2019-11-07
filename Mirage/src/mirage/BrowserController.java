package mirage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class BrowserController implements Initializable {

    @FXML
    private Button buttonWeb;

    @FXML
    private WebView viewWeb;

    @FXML
    private TextField textfieldWeb;

    @FXML
    void homebuttonWeb(ActionEvent event) throws IOException {
        //LOAD NEW SCENE (HomePage)
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.sizeToScene();
        app_stage.setResizable(false);
        app_stage.show();
    }

    @FXML
    //BACK BUTTON
    void backbuttonWeb(ActionEvent event) {
        viewWeb.getEngine().getHistory().go(-1);
        setUrl(getUrlFromHistory());
    }

    private String getUrlFromHistory() {
        return viewWeb.getEngine().getHistory().getEntries().get(viewWeb.getEngine().getHistory().getCurrentIndex()).getUrl();
    }

    private void setUrl(String urlFromHistory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @FXML
    //GO HOME
    void refbuttonWeb(ActionEvent event) {
        viewWeb.getEngine().reload();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final WebEngine we = viewWeb.getEngine();
        we.load("http://www.google.com/");
        we.setJavaScriptEnabled(true);
        textfieldWeb.setText("www.google.com/");
        EventHandler<ActionEvent> toEnter = (ActionEvent event) -> {
            we.load(textfieldWeb.getText().startsWith("http://") ? textfieldWeb.getText() : "http://" + textfieldWeb.getText());
        };
        textfieldWeb.setOnAction(toEnter);
        buttonWeb.setOnAction(toEnter);
        we.locationProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            textfieldWeb.setText(newValue);
        });
    }
}
