package javafxBasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// create a border pane
		BorderPane pane = new BorderPane();
		
		// place nodes in the pane
		pane.setTop(new CustomePane("Top"));
		pane.setRight(new CustomePane("Right"));
		pane.setBottom(new CustomePane("Bottom"));
		pane.setLeft(new CustomePane("Left"));
		pane.setCenter(new CustomePane("Center"));
		
		// create a scene and place it in the stage
		Scene scene = new Scene(pane);
		
		primaryStage.setTitle("ShowBorderPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

/*
 *  To remove a node from the top region, invoke
 *  setTop(null). If a region is not occupied, no space will be allocated for this region. 
 */

class CustomePane extends StackPane
{
	public CustomePane(String title)
	{
		getChildren().add(new Label(title));
		setStyle("-fx-border-color: red");
		setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	}
}
