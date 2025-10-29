package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane pane = new BorderPane();
			pane.setRight(new CustomPane("Right"));
			pane.setLeft(new CustomPane("Left"));

			CustomHorizontalTop customTop = new CustomHorizontalTop();
			pane.setTop(customTop);

			CustomGridPaneCenter customCenter = new CustomGridPaneCenter();
			pane.setCenter(customCenter);

			CustomHorizontalBottom customBottom = new CustomHorizontalBottom();
			pane.setBottom(customBottom);

			Scene scene = new Scene(pane);
			primaryStage.setTitle("COMP228 | Lab 5 | Pierre Moreau");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
