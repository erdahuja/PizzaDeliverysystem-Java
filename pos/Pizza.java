package pos;

public class Pizza {
private String name;
private double time;
private double cookingTime;
public Pizza(String name, double time, double cookingTime) {
	super();
	this.name = name;
	this.time = time;
	this.cookingTime = cookingTime;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getTime() {
	return time;
}
public void setTime(double time) {
	this.time = time;
}
public double getCookingTime() {
	return cookingTime;
}
public void setCookingTime(double cookingTime) {
	this.cookingTime = cookingTime;
}




}
