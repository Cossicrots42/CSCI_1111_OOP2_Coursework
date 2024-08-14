import java.util.Date;

public class Triangle extends GeometricObject {
	
	private double[] side = {1, 1, 1};
	
	public Triangle(double newSide1, double newSide2, double newSide3, String newColor, boolean newFilled, Date today) {
		
		side[0] = newSide1;
		side[1] = newSide2;
		side[2] = newSide3;
		
		this.setColor(newColor);
		this.setFilled(newFilled);
		this.setDate(today);
		
	}
	
	public double getArea() {
		double s = ((side[0] + side[1] + side[2]) / 2);
		return Math.sqrt(s * (s - side[0]) * (s - side[1]) * (s - side[2]));
	}
	public double getPerimeter() {
		return (side[0] + side[1] + side[2]);
	}
	
	//You know, it's kinda funny because I keep forgetting that jAvA iS cAsE sEnSaTiVe.
	
	public String toString() {
		return "Triangle: side1 = " + side[0] + " side2 = " + side[1] + " side3 = " + side[2];
	}
	public void setSide(int s, double newSide) {
		side[s - 1] = newSide;
	}
	public double getSide(int s) {
		return side[s - 1];
	}
}