import javafx.application.Application;  
import javafx.stage.Stage;
import javafx.scene.Scene;

public class ShowGuiThing extends Application{

	public static void main(String[] args) {
		
		launch(args);

	}

	public void start(Stage guiStage) throws Exception {
		
		CreateGuiThing Toaster = new CreateGuiThing();
		
		Scene ToasterOven = new Scene(Toaster, 600, 400);
		
		guiStage.setTitle("Yo dis thing has buttons");
		guiStage.setScene(ToasterOven);
		guiStage.show();
		
	}

}
