
public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle Test1 = new Rectangle(4,40);
		
		System.out.println("This first rectangle has a height of " + Test1.height + " and a width of " + Test1.width + ".");
		System.out.println("It has an area of " + Test1.getArea() + " and a perimeter of " + Test1.getPerimeter());
		
		Rectangle Test2 = new Rectangle(3.5,35.9);
		
		System.out.println("This second rectangle has a height of " + Test2.height + " and a width of " + Test2.width + ".");
		System.out.println("It has an area of " + Test2.getArea() + " and a perimeter of " + Test2.getPerimeter());
		System.out.println("Pretty cool, right?");

	}

}