package service;
import module.Country;
import module.Student;

public class MainService {

	public static void main(String[] args) {
		Student student1 =new Student();
		System.out.println(student1);
		
		Student student2 = new Student (" AB987654" , "John" , "Sarford" ,  "ITF", 2007 , Country.other , "LU236890");
		
		System.out.println(student2);
	}

}
