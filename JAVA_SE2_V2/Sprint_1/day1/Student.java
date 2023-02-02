package SB101_V2.Sprint_1.day1;

public class Student implements Comparable<Student> {

	private int roll;
	private String name;
	private String email;
	private int marks;
	
	
	public Student(int roll, String name, String email, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.marks>o.getMarks()) return 1;
		else return -1;
	}


	 
	
//	@Override
//    public int compareTo(Student obj) {
//       // return this.marks.compareTo(obj.marks);
//		//return this.marks.compareTo(obj.getMarks());
//    }
//	
	
	
}



