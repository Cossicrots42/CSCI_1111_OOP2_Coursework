import java.util.Date;

public class Triangle extends GeometricObject {
	
	private double[] side = {1, 1, 1};
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled, Date dateCreated) {
		
		side[0] = side1;
		side[1] = side2;
		side[2] = side3;
		
		this.setColor(color);
		this.setFilled(filled);
		this.setDateCreated(dateCreated);
		
	}
	
	public double getArea() {
		double s = ((side[0] + side[1] + side[2]) / 2);
		return Math.sqrt(s * (s - side[0]) * (s - side[1]) * (s - side[2]));
	}
	public double getPerimeter() {
		return (side[0] + side[1] + side[2]);
	}
	
	public String toString() {
		return "Triangle: side1 = " + side[0] + " side2 = " + side[1] + " side3 = " + side[2];
	}
	public void setSide(int s, double newSide) {
		side[s - 1] = newSide;
	}
	public double getSide(int s) {
		return side[s - 1];
	}
	
	//We have rendered what was requested.
	public void howToColor() {
		System.out.println("Color all three sides");
	}
}

/* Well, I'm telling you. This is how I see it. Minecraft 1.15 is like standard life, 1.16 is new
 * stuff, 1.17 is newer stuff, 1.18 is latest and greatest stuff, 1.19 is still in development, 
 * 1.20 is cutting edge, 1.21 (the current version) is next generation Minecraft, 1.22 is what my
 * kids will be playing in 2050, 1.23 is out of the question, and 1.24 is going to Minecraft's final
 * update and then Mojang will either be bankrupt or the lead of the gaming industry now releasing
 * nostalgia based voxel games and more Minecraft spin-offs.
 */