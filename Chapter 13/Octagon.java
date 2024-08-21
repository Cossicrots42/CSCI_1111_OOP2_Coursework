import java.util.Date;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	
	//Makes Octagon with equal sides.
	public Octagon(double side, String color, Boolean filled, Date dateCreated) {
		
		for (int i = 0; i > this.side.length; i++) {
			this.side[i] = side;
		}
		
		this.setColor(color);
		this.setDateCreated(dateCreated);
		this.setFilled(filled);
		
	}
		
	private double[] side = {1, 1, 1, 1, 1, 1, 1, 1};
	
	public int compareTo(Octagon clone) {
		
		if (this.getArea() > clone.getArea()) {
			return 1;
		} else if (this.getArea() < clone.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public Octagon clone() throws CloneNotSupportedException {
		return (Octagon) super.clone();
	}
	
	public double getArea() {
		return (2 + (4 / Math.sqrt(2)) * side[0] * side[0]);
	}
	
	public double getPerimeter() {
		return this.side[0] * 8;
	}
}


/* Anything for criptic bakery language today? Surprisingly, not. Nothing comes to mind today. Not much
 * at all. Not happy, not sad. Just kinda chill. Almost content. Perhaps the free pizza subdued my emotions.
 * It doesn't always work that way, though. Sorry, nothing today.
 */