package com.example.algobox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputEvent;
import javafx.scene.input.InputMethodEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.Arrays;


public class MergeSortController {
    private String inputString = "";
    private Scene scene;
    private Stage stage;
    @FXML
    private TextField Fields;

@FXML
protected void createArray(ActionEvent event) throws IOException {
   inputString = Fields.getText();
   inputString = inputString.replaceAll(" ", "");
   int[] arr = new int[inputString.length()];
   for (int i = 0; i < inputString.length(); i++) {
       arr[i] = Integer.parseInt(inputString.substring(i, i + 1));
   }
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("merge-sort-2.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(fxmlLoader.load(), 600, 600);

    String css = this.getClass().getResource("algDesign.css").toExternalForm();
    scene.getStylesheets().add(css);

    stage.setScene(scene);
    stage.show();
}
@FXML
protected void backToVisualizer(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("visualize-screen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 600, 600);

        String css = this.getClass().getResource("algDesign.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.show();
}

}
