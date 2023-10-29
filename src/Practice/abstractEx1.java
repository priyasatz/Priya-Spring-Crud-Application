package Practice;
abstract class person {
	protected String fname = "Priya";
	protected String lname = "Satz";
	protected int 	age  = 25;
	protected String gender = "Female";
	protected String dept = "Computer science";
	protected int yearofjoin= 2018;
	protected String emailid = "prisatz@yahoo.com";
	
	public abstract void details();
}
class faculty extends person {
	 public void details() {
	 System.out.println("FACULTY DETAILS:");
	 }
}
public class abstractEx1 {
	public static void main(String[] args) {
		faculty f1 = new faculty();
		f1.details();
		System.out.println(f1.fname);
		System.out.println(f1.lname);
		System.out.println(f1.age);
		System.out.println(f1.gender);
		System.out.println(f1.dept);
		System.out.println(f1.yearofjoin);
		System.out.println(f1.emailid);
		
	}

}




