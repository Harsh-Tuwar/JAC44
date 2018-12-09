import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotate extends Application {
	
	@Override
	public void start(Stage primaryStage){
		
		StackPane pane = new StackPane();
		
		Button btOk = new Button("ok");
		btOk.setStyle("-fx-border-color: PINK;");
		pane.getChildren().add(btOk);
		pane.setRotate(45);
		pane.setStyle("-fx-border-color: red;-fx-background-color: lightgrey;");
		Scene sc= new Scene(pane, 200, 200);
		primaryStage.setTitle("NodeStyelRotate");
		primaryStage.setScene(sc);
		primaryStage.show();
		
		
	}
	
}
