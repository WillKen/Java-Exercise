public class No_1 {

	public static class Shape {
		private String color;
		private boolean filled;
		public Shape() {
			color="green";
			filled=true;
		}
		public Shape(String color,boolean filled) {
			this.color=color;
			this.filled=filled;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {	
			this.color=color;
		}
		public boolean isFilled() {
			return filled;
		}
		public void setFilled(boolean filled) {
			this.filled=filled;
		}
		public String toString() {
			String str;
			str="A shape with color of "+color+" and ";
			if(isFilled())
				str+="filled";
			else
				str+="not filled";
			return str;
		}
	}
	
	public static class Circle extends Shape{
		private double radius;
		public Circle() {
			super();
			radius=1.0;		
		}
		public Circle(double radius, String color, boolean filled) {
			super(color,filled);
			this.radius=radius;
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius=radius;
		}
		public double getArea() {
			return Math.PI*radius*radius;
		}
		public double getPerimeter() {
			return Math.PI*2*radius;
		}
		public String toString() {
			String str;
			str="A Circle with radius="+radius+", which is a subclass of "+super.toString();
			return str;
		}
	}
	
	public static class Rectangle extends Shape{
		private double width;
		private double length;
		public Rectangle() {
			super();
			width=length=1.0;
		}
		public Rectangle(double width,double length) {
			super();
			this.width=width;
			this.length=length;
		}
		public Rectangle(double width, double length,String color, boolean filled) {
			super(color,filled);
			this.width=width;
			this.length=length;
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width=width;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length=length;
		}
		public double getArea() {
			return width*length;
		}
		public double getPerimeter() {
			return width*2+length*2;
		}
		public String toString() {
			String str;
			str="A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
			return str;
		}
	}
	
	public static class Square extends Rectangle{
		public Square() {
			super(1.0,1.0);
		}
		public Square(double side) {
			super(side, side);
		}
		public double getSide() {
			return super.getWidth();
		}
		public void setSide(double side) {
			super.setWidth(side);
			super.setLength(side);
		}
		public void setWidth(double side) {
			super.setWidth(side);
			super.setLength(side);
		}
		public void setLength(double side) {
			super.setWidth(side);
			super.setLength(side);
		}
		public String toString() {
			String str;
			str="A Square with side="+super.getWidth()+", which is a subclass of "+super.toString();
			return str;
		}
	}
	
	
	public static void main(String[] args) {
		Shape s1=new Shape();
		Circle c1=new Circle();
		Rectangle r1=new Rectangle();
		Square sq1=new Square();
		System.out.println(s1.toString());
		System.out.println(c1.toString());
		System.out.println(r1.toString());
		System.out.println(sq1.toString());
	}

}
