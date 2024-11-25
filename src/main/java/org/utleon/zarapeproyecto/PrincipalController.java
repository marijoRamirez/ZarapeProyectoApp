package org.utleon.zarapeproyecto;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class PrincipalController {
    @FXML
    private AnchorPane mainContainer;

    @FXML
    private HBox homeItemBar;
    @FXML
    private HBox sucursalItemBar;
    @FXML
    private HBox salirItemBar;

    @FXML
    public void initialize() {
        homeItemBar.setOnMouseClicked(event -> {
            loadFXML("home");
        });
        sucursalItemBar.setOnMouseClicked(event -> {
            loadFXML("sucursal");
        });
        salirItemBar.setOnMouseClicked(event -> {
            System.exit(0);
        });
    }

    private void loadFXML(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/utleon/zarapeproyecto/" + fxml + ".fxml"));
            AnchorPane newLoadedPane = loader.load();
            AnchorPane.setTopAnchor(newLoadedPane, 0.0);
            AnchorPane.setRightAnchor(newLoadedPane, 0.0);
            AnchorPane.setBottomAnchor(newLoadedPane, 0.0);
            AnchorPane.setLeftAnchor(newLoadedPane, 0.0);
            mainContainer.getChildren().clear(); // Limpia el contenedor
            mainContainer.getChildren().add(newLoadedPane); // Añade el nuevo FXML cargado
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
