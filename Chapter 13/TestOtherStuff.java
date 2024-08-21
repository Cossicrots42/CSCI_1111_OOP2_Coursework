import java.util.Random;
import java.util.Date;

public class TestOtherStuff {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Triangle[] triangles = new Triangle[5];
		
		for (int i = 0; i < triangles.length; i++) {
			
			triangles[i] = new Triangle(1,1,1,"yellow",true,new Date());
			
			triangles[i].setSide(1, rand.nextInt(10) + 1);
			triangles[i].setSide(2, rand.nextInt(10) + 1);
			triangles[i].setSide(3, rand.nextInt(10) + 1);
			
			System.out.println(triangles[i].toString());
			
			double side1 = triangles[i].getSide(1);
			double side2 = triangles[i].getSide(2);
			double side3 = triangles[i].getSide(3);
			
			if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
				System.out.println("That triangle is not Colorable beause it doesn't exist.");
			} else {
				System.out.println("Area: " + triangles[i].getArea());
				triangles[i].howToColor();
			}
		}
		
	}

}
