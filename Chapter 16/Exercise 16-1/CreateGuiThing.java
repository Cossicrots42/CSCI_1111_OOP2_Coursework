import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;

import java.util.Random;

public class CreateGuiThing extends Pane{
	
	Random rand = new Random();
	
	public CreateGuiThing() {
		paintGuiThing();
	}
	
	Circle[] pizzaz = new Circle[200];
	Font Times = Font.font("Comic Sans MS", FontWeight.BOLD, 25);
	Label thing = new Label("I would agree, Programming is Fun");
	
	RadioButton option1 = new RadioButton("RED!!");
	RadioButton option2 = new RadioButton("YELLOW!!");
	RadioButton option3 = new RadioButton("BLACK!!");
	RadioButton option4 = new RadioButton("ORANGE!!");
	RadioButton option5 = new RadioButton("GREEN!!");
	
	Button Left = new Button("<=");
	Button Right = new Button("=>");
	
	public void paintGuiThing() {
		
		for (int i = 0; i < pizzaz.length; i++) {
			
			pizzaz[i] = new Circle(5);
			pizzaz[i].setFill(Color.CYAN);
			
			pizzaz[i].setLayoutY(rand.nextInt(400));
			pizzaz[i].setLayoutX(rand.nextInt(600));
			
			getChildren().add(pizzaz[i]);
			
		}
		
		thing.setFont(Times);
		thing.setAlignment(Pos.CENTER);
		
		thing.setTextFill(Color.RED);
		thing.setLayoutX(0);
		thing.setLayoutY(150);
		
		option1.setLayoutX(50);
		option1.setLayoutY(10);
		
		option2.setLayoutX(150);
		option2.setLayoutY(10);
		
		option3.setLayoutX(250);
		option3.setLayoutY(10);
		
		option4.setLayoutX(350);
		option4.setLayoutY(10);
		
		option5.setLayoutX(450);
		option5.setLayoutY(10);
		
		ToggleGroup colorGroup = new ToggleGroup();
		
		option1.setToggleGroup(colorGroup);
		option2.setToggleGroup(colorGroup);
		option3.setToggleGroup(colorGroup);
		option4.setToggleGroup(colorGroup);
		option5.setToggleGroup(colorGroup);
		
		Left.setLayoutY(375);
		Left.setLayoutX(265);
		
		Right.setLayoutY(375);
		Right.setLayoutX(305);
		
		getChildren().addAll(thing, option1, option2, option3, option4, option5, Left, Right);
		
		option1.setOnAction(button -> {
			thing.setTextFill(Color.RED);
			Confetti(Color.CYAN);
		});
		option2.setOnAction(button -> {
			thing.setTextFill(Color.GOLD);
			Confetti(Color.PURPLE);
		});
		option3.setOnAction(button -> {
			thing.setTextFill(Color.BLACK);
			Confetti(Color.GRAY);
		});
		option4.setOnAction(button -> {
			thing.setTextFill(Color.ORANGE);
			Confetti(Color.BLUE);
		});
		option5.setOnAction(button -> {
			thing.setTextFill(Color.GREEN);
			Confetti(Color.RED);
		});
		
		Left.setOnAction(button -> {
            
            if (thing.getLayoutX() - 10 >= -300) {
                thing.setLayoutX(thing.getLayoutX() - 10);
            }
		});
		
		Right.setOnAction(button -> {
            
            if (thing.getLayoutX() + 10 <= 450) {
                thing.setLayoutX(thing.getLayoutX() + 10);
            }
		});
		
	}

	public void Confetti(Color complementary) {
		
			getChildren().clear();
		
		for (int j = 0; j < pizzaz.length; j++) {
			
			getChildren().removeAll(pizzaz[j]);
			
		}
		
		for (int i = 0; i < pizzaz.length; i++) {
			
			pizzaz[i].setFill(complementary);
			
			pizzaz[i].setLayoutY(rand.nextInt(400));
			pizzaz[i].setLayoutX(rand.nextInt(600));
			
			getChildren().add(pizzaz[i]);
			
		}
		
		getChildren().addAll(thing, option1, option2, option3, option4, option5, Left, Right);
	}
}

/* I have wonderful parents, I really do. And I was a super abnoxious five year old, I really was.
 * Like, I would poop on the floor because I was afraid of the toilet. And I would never wear clothes
 * because I didn't feel like it. So I would run outside in my underwear, I even bumped into a cop
 * once. And I would do things like put nails in the wall and dump out Maple syrup and once I even
 * tried turning our window well into a swimming pool. To be blunt, I learned that windows aren't
 * water tight at a young age. But I think the cherry on top of all these stories is one that makes
 * me realize I probably shouldn't even be alive right now, because 5 year old me learned through
 * experimentation that cars driving by in the neighborhood will stop if you go in the street in
 * front of them. And through the same methods I learned that, I also learned very early on that the
 * horns on school busses are louder than the horns on regular cars. Pretty cool, right?
 */