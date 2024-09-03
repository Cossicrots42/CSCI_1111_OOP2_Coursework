import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Random;


public class TestClockPane extends Application{
	
	
	
	@Override
	public void start(Stage primaryStage) {   
		Random rand = new Random();
		
		int hour = rand.nextInt(12);
		int setMinute = rand.nextInt(2);
		int minute = 0;
		
		if (setMinute == 1) {
			minute = 0;
		} else {
			minute = 30;
		}
		
		Scene scene = new Scene(new ClockPane(hour, minute, 0, true, true, false), 400, 400);
		primaryStage.setTitle("This clock is way cooler than the lame default one"); 
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		
		launch(args);
	}

}
