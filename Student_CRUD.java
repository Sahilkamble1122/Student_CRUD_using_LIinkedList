package linked_list;

import java.util.LinkedList;
import java.util.Scanner;


class Student{
	int roll_no;
	String name;
	String gender;
	long Contact_no;
	int year;
	String branch;
	static Scanner sc= new Scanner(System.in);
	
	public Student(int rollNo, String name, String gender, long contact, int year, String branch) {
        this.roll_no = rollNo;
        this.name = name;
        this.gender = gender;
        this.Contact_no = contact;
        this.year = year;
        this.branch = branch;
    }
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("enter name");
		this.name = sc.next();
	}
	public String getGender() {
		return gender;
	}
	public void setGender() {
		System.out.println("enter gender");
		this.name = sc.next();
	}
	public long getContact_no() {
		return Contact_no;
	}
	public void setContact_no() {
		System.out.println("enter contact no");
		this.Contact_no = sc.nextLong();
	}
	public int getYear() {
		return year;
	}
	public void setYear() {
		System.out.println("enter year");
		this.Contact_no = sc.nextLong();
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch() {
		System.out.println("enter Branch");
		this.branch = sc.next();
	}	
	
	public void display() {
	    System.out.println("Roll No: " + roll_no);
	    System.out.println("Name: " + name);
	    System.out.println("Gender: " + gender);
	    System.out.println("Contact: " + Contact_no);
	    System.out.println("Year: " + year);
	    System.out.println("Branch: " + branch);
	    System.out.println("------------------------------------");
	}

}


public class Student_CRUD {
	
	static LinkedList<Student> students =new LinkedList<>();
	static Scanner sc=new Scanner(System.in);

	static void menu(){
		System.out.print("\nStudent Menu");
		System.out.print("\n-----------------");
		System.out.print("\n1.Add new student");
		System.out.print("\n2.Update student on Roll no");
		System.out.print("\n3.Search student on Roll no");
		System.out.print("\n4.Delete student on Roll no");
		System.out.print("\n5.List All Student");
		System.out.println("----------------------------------");
		System.out.print("\no.Exit");
		System.out.print("\n:");
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			menu();
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				addStudent();
				break;
			case 2:
				update_student();
				break;
			case 3:
				display_byRoll_no();
				break;
			case 4:
				delete();
				break;
			case 5:
				display_All();
				break;
			default:
					System.out.println("enter valid");
			}
		}while(choice!=6);
		
	}
	
	static void addStudent()
    {
        System.out.println("Enter roll no:");
        int rollno=sc.nextInt();
        System.out.println("Enter Name:");
        String name=sc.next();
        System.out.println("Enter Gender:");
        String gender=sc.next();
        System.out.println("Enter Contact:");
        long contact=sc.nextLong();
        System.out.println("Enter Year:");
        int year=sc.nextInt();
        System.out.println("Enter Branch:");
        String branch=sc.next();
        students.add(new Student(rollno,name,gender,contact,year,branch));
        System.out.print("\nStudent Added to list");
    }
	
	
	static void delete() {
		System.out.println("enter roll no");
		int roll_no = sc.nextInt();
		for(Student s: students) {
			if(s.getRoll_no()==roll_no) {
				students.remove(s);
				break;
			}else {
				System.out.println("student not fount");
			}
	    }
	}
	
	static void update_student() {
		System.out.println("enter roll no");
		int roll_no = sc.nextInt();
		
		for(Student s: students) {
			if(s.getRoll_no()==roll_no) {
				s.setName(); 
				s.setGender();
				s.setContact_no();
				s.setYear();
				s.setYear();
				break;
			}
			else {
				System.out.println("Student not found");
			}
		}
	}
	static void display_byRoll_no() {
		System.out.println("enter roll no");
		int roll_no = sc.nextInt();
		
		for(Student s: students) {
			if(s.getRoll_no()==roll_no) {
				s.display();
				break;
	        }
			else {
				System.out.println("Student not found");
			}
	     }
	}
	static void display_byRollno() {
		System.out.println("enter roll no");
		int roll_no = sc.nextInt();
		
		for(Student s: students) {
			if(s.getRoll_no()==roll_no) {
				s.display();
				break;
	        }
			else {
				System.out.println("Student not found");
			}
	     }
	}static void display_All() {
		
		for(Student s: students) {
				s.display();
	     }
	}
}
