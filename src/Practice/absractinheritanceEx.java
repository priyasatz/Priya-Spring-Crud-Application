package Practice;
abstract class shapes{
	public abstract void area();
}

class square extends shapes {
	int sides;
	square (int sides){
	this.sides = sides;
	}
	public  void area() {
		System.out.println("Area of Square is " + sides * sides);
	}
}
 class triangle extends shapes {
	 int base;
	 int height;
	 triangle (int base, int height){
	this.base = base;
	this.height = height;
}
	public  void area() {
		System.out.println("Area of triangle is " + 0.5 * base * height);
	}
}
public class absractinheritanceEx {

	public static void main(String[] args) {
		shapes[] s = new shapes[2];
		s[0] = new square(5);
		s[1]= new triangle(3, 4);
		
		for (shapes a : s) {
			a.area();
		}

	}

}
