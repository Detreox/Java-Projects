package mirage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class NetflixController implements Initializable {

    @FXML
    private WebView viewNetflix;

    @FXML
    void homebuttonNetflix(ActionEvent event) throws IOException {
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final WebEngine nf = viewNetflix.getEngine();
        nf.load("http://www.netflix.com/");
        nf.setJavaScriptEnabled(true);

    }

}
