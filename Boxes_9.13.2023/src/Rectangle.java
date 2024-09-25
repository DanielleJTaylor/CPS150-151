
//Rectangle.java: represents a 2-D rectangle ("box")

public class Rectangle {
	private double width, height;
	
public Rectangle (double w, double h){
if (w<=0 || h<=0) {
	throw new IllegalArgumentException(" ");
}
width = w ;
height = h ;
}

public Rectangle() {
	width=1;
	height=1;
}

//System.out.println(box1.toString());
//System.out.println(box2.toString());


public double getArea() {
	double area = width *height;
	return area;
}

public double getPerimeter() {
	double perimeter = (2*width) + (2*height);
	return perimeter;
}

public String toString() {
	
	String result = ("Rectangle with width");
	
	 return result;
	

}

}//end rectangle class