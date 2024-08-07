//This program represents Rectangles

/*
 It was while writing this program, I knew, that this was my life now. I'd be spending 15 hours
 each week here, more than ever before. But it was all for the greater good. My bank account would
 say otherwise, but it'll be happy again if my scholarship kicks in. What do you think? Am I cool
 enough to get the scholarship of merit or whatever it's called? 
 */

public class Rectangle {
	
	double height = 1.0;
	double width = 1.0;
	
	Rectangle() {
		
	}
	
	Rectangle(double newHeight, double newWidth) {
		height = newHeight;
		width = newWidth;
	}
	
	double getArea() {
		return (height * width);
	}
	double getPerimeter() {
		return 2.0 * (height + width);
	}
}