/*
    Project for ICS 108 - Fraction Calculator.
    This work have been done by ******** ******** and ******** ********
    IDs: ******** and ********, respectively.

    This program is design to take any two fraction ( which includes integers ) as input and calculate
    their sum, difference, product and quotient, also, taking one fraction and reduce it.
    This program have 4 different classes: App, Controller, Fraction and ParseInput.
    This program uses FXML and CSS for the outer design.
*/

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// The App class is programmed to initiated the calculator and load the FXML and CSS files.
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override // Override the start method
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Fraction Calculator");
        Parent root = FXMLLoader.load(getClass().getResource("App.fxml")); // load FXML file.
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm()); // load CSS file.
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
