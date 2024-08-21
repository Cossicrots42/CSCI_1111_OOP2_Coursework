import java.util.Date;

/* Well, I do what I can. I do everything I can, except for when I don't. But it's just hard sometimes
 * because they want us to do so much. And that's not a bad thing, it really isn't. It's just overwhelming
 * at times. But, you know, I have the hope that it'll all bring me somewhere eventually. Honestly, I don't
 * know where that is. But to be fair, I'm not sure if anyone is supposed to know where that is. They tell
 * us we get to choose, and they're right, it's up to us. But we can never connect the dots looking forward.
 * I just hope it's good. I hope it's great, wonderful, and grand. But I have no idea what to except, so I'm
 * afraid. I really shouldn't be that way though. I should just get back to work and make sure that I'm 
 * atleast going in a positive direction.
 */

abstract class GeometricObject {
	
	String color;
	boolean filled;
	Date dateCreated;
	
	public String getColor() {
		return color;
	}
	public boolean getFilled() {
		return filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	//"Are we allowed to do that?" - Bandit Heeler
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}
