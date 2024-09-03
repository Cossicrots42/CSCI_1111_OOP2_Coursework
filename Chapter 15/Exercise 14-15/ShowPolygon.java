//Do we have to import EVERYHING??!!!
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

//For the text on the STOP sign
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;

public class ShowPolygon extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		// Create a scene and place it in the stage
		Scene scene = new Scene(new MyPolygon(), 400, 400);
		primaryStage.setTitle("Hol' up I can change this lol"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

class MyPolygon extends Pane {
	private void paint() {
		// Create a polygon and place polygon to pane
		Font Times = Font.font("Times New Roman", FontWeight.BOLD, 85);
		
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
		//polygon.setStroke(Color.BLACK);
		polygon.setRotate(22.5);
		
		Label text = new Label("STOP");
		text.setFont(Times);
		text.setTextFill(Color.WHITE);
		text.setAlignment(Pos.CENTER);
		text.setLayoutX(93);
		text.setLayoutY(150);
		
		ObservableList<Double> list = polygon.getPoints();
		
		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;

		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		int s = 8;
		
		double pi = Math.PI;
		
		// Add points to the polygon list
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.sin(2 * i * pi / s)); 
			list.add(centerY - radius * Math.cos(2 * i * pi / s));
		}     
		
		getChildren().clear();
		getChildren().add(polygon);
		getChildren().add(text);
	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}

/* Once I tried to get what I thought was a cupcake by baking cupcakes. It didn't work, but looking
 * back it actually wasn't the cupcakes I baked her, it was something entirely differnt. I'm over
 * that now. It doesn't bother me anymore. I just don't need it to. So as I was saying, I can see
 * why most people just use modeling programs that write this kind of code for you.
 */