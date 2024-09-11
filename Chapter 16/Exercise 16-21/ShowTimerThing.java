import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowTimerThing extends Application{

	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage timerStage) throws Exception {
		
		MakeTimer Toaster = new MakeTimer();
		
		Scene ToasterOven = new Scene(Toaster, 600, 400);
		
		timerStage.setTitle("Our time is more precious than diamonds.");
		timerStage.setScene(ToasterOven);
		timerStage.show();
		
	}

}
