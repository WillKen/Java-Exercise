
public class No_2 {

	public static class Circle2D {
		double x,y;
		double radius;
		public double get_x() {
			return x;
		}
		public double get_y() {
			return y;
		}
		public double get_radius() {
			return radius;
		}
		public Circle2D(){
			x=0;
			y=0;
			radius=1;
		}
		public Circle2D(double new_x,double new_y,double new_radius){
			x=new_x;
			y=new_y;
			radius=new_radius;
		}
		public double getArea() {
			return Math.PI*radius*radius;
		}
		public double  getPerimeter() {
			return 2*Math.PI*radius;
		}
		public boolean contains(double obj_x, double obj_y) {
			if(((obj_x-x)*(obj_x-x)+(obj_y-y)*(obj_y-y))<radius*radius)
				return true;
			return false;
		}
		public boolean contains(Circle2D circle) {
			if(Math.sqrt((circle.get_x()-x)*(circle.get_x()-x)+(circle.get_y()-y)*(circle.get_y()-y))+circle.get_radius()<radius)
				return true;
			return false;
		}
		public boolean overlaps(Circle2D circle) {
			if(Math.sqrt((circle.get_x()-x)*(circle.get_x()-x)+(circle.get_y()-y)*(circle.get_y()-y))<(circle.get_radius()+radius))
				return true;
			return false;
		}
	}
	public static void main(String[] args) {
		Circle2D c1=new Circle2D(2,2,5.5);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.contains(3,3));
		System.out.println(c1.contains(new Circle2D(4,5,10.5)));
		System.out.println(c1.overlaps(new Circle2D(3,5,2.3)));
	}

}
