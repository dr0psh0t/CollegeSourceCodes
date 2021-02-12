package javafxBasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		// pane to hold a circle
		Pane pane = new Pane();
		
		// create a circle and set its properties
		Circle circle = new Circle();
		
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("ShowCircleCentered");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
