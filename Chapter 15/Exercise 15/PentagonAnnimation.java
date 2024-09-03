import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.application.Application;  
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.collections.ObservableList;

public class PentagonAnnimation extends Pane{
	
	public PentagonAnnimation() {
		paint();
        widthProperty().addListener(ov -> paint());
        heightProperty().addListener(ov -> paint());
	}

    private void paint() {
        getChildren().clear();

        Polygon polygon = new Polygon();
        polygon.setFill(Color.BLUE);
        polygon.setStroke(Color.BLACK);
        polygon.setStrokeWidth(5);
        
        ObservableList<Double> list = polygon.getPoints();
        
        Rectangle moves = new Rectangle();
        moves.setWidth(60);
        moves.setHeight(80);
    	moves.setFill(Color.RED);
    	moves.setStroke(Color.BLACK);
    	moves.setStrokeWidth(5);
    	
    	Button pause = new Button("Pause");
    	pause.setLayoutX(0);
    	pause.setLayoutY(0);

        double centerX = getWidth() / 2, centerY = getHeight() / 2;
        double radius = 90; //Size of polygon
        
        int sides = 5;  // Number of sides of the polygon

        for (int i = 0; i < sides; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / sides));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / sides));
        }

        polygon.setRotate(54);

        getChildren().addAll(polygon, moves, pause);
        
        //wait, it's that easy?
        PathTransition GO = new PathTransition();
        GO.setDuration(Duration.millis(2000));
        GO.setPath(polygon);
        GO.setNode(moves);
        GO.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        GO.setCycleCount(Timeline.INDEFINITE);
        
        FadeTransition Opacity = new FadeTransition(Duration.millis(2000), moves);
        Opacity.setFromValue(1.0);
        Opacity.setToValue(0.1);
        Opacity.setCycleCount(Timeline.INDEFINITE);
        Opacity.setAutoReverse(true);
        
        ParallelTransition Animation = new ParallelTransition(moves, GO, Opacity);
        Animation.play();
        
        pause.setOnAction(button -> {
    		if (pause.getText() == "Pause") {
    			pause.setText("Play");
    			Animation.pause();
    		} else {
    			pause.setText("Pause");
    			Animation.play();
    		}
    	});
        
    }
}