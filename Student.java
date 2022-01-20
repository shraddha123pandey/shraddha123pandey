package helloworld;
//Question 2:Develop a simple Java Program that displays student name, age (year and days), Dob, Contact no, and subject Grade value.
import java.util.Scanner;
public class Student {
	private String name;
	private String dob;
	private String contactno;
	private String subjectGrade;
	private int ageYear;
	public Student(String name, String dob, String contactno, String subjectGrade, int ageYear ) {
        this.name = name;
        this.dob = dob;
        this.contactno =contactno;
        this.subjectGrade = subjectGrade;
        this.ageYear = ageYear;
    }
	 public void setStudentName(String name) {
	        this.name = name;
	 }

	    public String getStudentName() {
	        return "The Name of Student  is: " + name;
	  }
	    public void setStudentDob(String dob) {
	        this.dob = dob;
	    }

	    public String getStudentDob() {
	        return "The Dob Student is: " + dob;
	    }
	    public void setStudentContactNo(String contactno) {
	        this.contactno = contactno;
	    }

	    public String getStudentContactNo() {
	        return "The ContactNo of Student is: " + contactno;
	    }
	    public void setStudentSubjectGrade(String subjectGrade) {
	        this.subjectGrade = subjectGrade;
	    }

	    public String getStudentSubjectGrade() {
	        return "The SubjectGrade of Student is: " + subjectGrade;
	    }
	    public void setStudentAge(int ageYear) {
	        this.ageYear = ageYear;
	    }

	    public String getStudentAge() {
	        return "The Age of Student is " + ageYear;
	    }
	public static void main(String[] args) {
		System.out.println("Enter Name of Student : ");
        System.out.println("Enter Date-of-birth of the Student: : ");
        System.out.println("Enter ContactNo of the Student : ");
        System.out.println("Enter SubjectGrade of theStudent : ");
        System.out.println("Enter Age of the Student is : ");
        Scanner strInput = new Scanner(System.in);
        String nameofStudent= strInput.nextLine();
        String dateOfBirthofStudent= strInput.nextLine();
        String contactNoOfStudent= strInput.nextLine();
        String subjectGradeOfStudent= strInput.nextLine();
        
        Scanner intInput = new Scanner(System.in);
        int ageOfStudent= intInput.nextInt();
        Student student = new Student(nameofStudent,dateOfBirthofStudent,contactNoOfStudent,subjectGradeOfStudent,ageOfStudent);
        intInput.close();
        strInput.close();
        System.out.println("****************************************");
        System.out.println();
        System.out.println("You have the following Student data...");
        System.out.println();
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentDob());
        System.out.println(student.getStudentContactNo());
        System.out.println(student.getStudentSubjectGrade());
        System.out.println(student.getStudentAge());
		
	}
	
}
// Shraddha Pandey-20MEI10029