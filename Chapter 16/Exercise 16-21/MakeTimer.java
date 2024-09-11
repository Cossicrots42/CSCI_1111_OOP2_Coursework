import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/* Do you ever just write a piece of code, and it works, but then you need to add another
 * functionality to it, but in the process of doing that you need to like rewrite several parts of
 * if in a different way for it to work with the new functionality, but then it just gets so messy
 * and chaotic that you end up deleting practically the whole thing and starting over again?
 * Because that's kind of what happened to me here...
 */

public class MakeTimer extends Pane	{
	
	public MakeTimer() {
	
		GetANumber();
		
	}
	
	Label timer = new Label();
	TextField timerInput = new TextField();
	Font ComicSans = new Font("Comic Sans MS", 100);
	Text prompt = new Text("Enter Seconds");
	
	public void GetANumber() {
		
		timer.setLayoutX(240);
		timer.setLayoutY(60);
		timer.setFont(ComicSans);
		
		timerInput.setLayoutX(225);
		timerInput.setLayoutY(200);
		
		prompt.setLayoutX(230);
		prompt.setLayoutY(180);
		
		getChildren().addAll(timerInput, prompt);
		
		timerInput.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent en) {
				if (en.getCode().equals(KeyCode.ENTER)) {
					
					try {
						int time = Integer.parseInt(timerInput.getText());
					
						timerInput.clear();
						PaintTimer(time);
					} catch (NumberFormatException ex) {
						prompt.setText("I SAID SECONDS!!!");
					}
				}
			}
		});
		
	}
	
	public void PaintTimer(int seconds) {
		
		getChildren().remove(prompt);
		
		final int time[] = {seconds};
		
		timer.setText(String.valueOf(time[0]));		
		
		EventHandler<ActionEvent> TimerTicker = e -> {
			
			if (time[0] > 1) {
				timer.setText(String.valueOf(time[0] - 1));
				
				time[0] = (time[0] - 1);
			} else {
				timer.setLayoutX(25);
				timer.setText("TIMES UP!!!");
				
				PlayTimesUp();
				
				Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
                
			}
			
		};
				
		Timeline TimerAnimation = new Timeline(new KeyFrame(Duration.seconds(1), TimerTicker));
		TimerAnimation.setCycleCount(Timeline.INDEFINITE);
		
		getChildren().addAll(timer);
		TimerAnimation.play();
	}
	
	public void PlayTimesUp() {
		
		EventHandler<ActionEvent> TimesUp = o -> {
			
			if (timer.getTextFill() == (Color.BLACK)) {
				timer.setTextFill(Color.RED);
			} else {
				timer.setTextFill(Color.BLACK);
			}
			
		};
		
		Timeline TimesUpAnimation = new Timeline(new KeyFrame(Duration.millis(250), TimesUp));
		TimesUpAnimation.setCycleCount(Timeline.INDEFINITE);
		
		TimesUpAnimation.play();
	}
	
}
