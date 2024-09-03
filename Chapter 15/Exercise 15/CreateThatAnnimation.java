import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.application.Application;  
import javafx.stage.Stage; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;

/*Astronomy is a perfect reason to lose sleep. Like, it's literally just so cool compared to all 
 * the other things you could be doing while losing sleep.
 */


public class CreateThatAnnimation extends Application {
	
	@Override  
    public void start(Stage AnnimationThing) throws Exception {  
		
			int x = 1;
			int y = 1;
		
			PentagonAnnimation thing = new PentagonAnnimation();
		
			Scene IncludesRectangle = new Scene(thing, 600, 600);
		
			AnnimationThing.setTitle("I'll be good at this someday (:");
			AnnimationThing.setScene(IncludesRectangle);
			AnnimationThing.show();
		
		}
	
	 public static void main (String[] args) {
		 
	        launch(args);  
	    }  
}

/* Why has everyone in southern Utah been to BYU?
*
*/