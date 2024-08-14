import java.util.Date;

public class GeometricObject {
	
	private String color;
	private Boolean filled;
	private Date dateCreated;
	
	public void setColor(String newColor) {
		color = newColor;
	}
	public String getColor() {
		return color;
	}
	public void setFilled(Boolean isFilled) {
		filled = isFilled;
	}
	public Boolean getFilled() {
		return filled;
	}
	public void setDate(Date today) {
		dateCreated = today;
	}
	public Date getDate() {
		return dateCreated;
	}
	
}
