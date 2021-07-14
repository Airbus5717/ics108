import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Circle circle = new Circle();
        TextField radiusField = new TextField(String.valueOf(circle.getRadius()));
        Label areaDisplay = new Label("NaN");
        Label circumDisplay = new Label("NaN");
        Label radiusLabel = new Label("Enter Radius");
        Label areaLabel = new Label("Area");
        Label circumLabel = new Label("Circum");
        Button btn = new Button("Calculate");

        btn.setOnAction(e -> {
            circle.setRadius(Double.parseDouble(radiusField.getText()));
            areaDisplay.setText(String.valueOf(circle.getArea()));
            circumDisplay.setText(String.valueOf(circle.getCircum()));
        });
        VBox vbox = new VBox(20);
        HBox radius = new HBox(10);
        HBox area = new HBox(10);
        HBox circum = new HBox(10);
        area.getChildren().addAll(areaLabel, areaDisplay);
        circum.getChildren().addAll(circumLabel, circumDisplay);
        radius.getChildren().addAll(radiusLabel, radiusField);
        vbox.getChildren().addAll(btn, radius, area, circum);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        Scene scene = new Scene(vbox, 310, 200);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Circle Area and circum calculator");
        primaryStage.show();
    }
}
