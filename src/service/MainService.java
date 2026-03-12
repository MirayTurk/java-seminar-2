package service;
import module.Country;
import module.Student;

public class MainService {

	public static void main(String[] args) {
		System.out.println("----------------STUDENTS--------------------");
		Student student1 =new Student();
		System.out.println(student1);
		
		Student student2 = new Student (" AB987654" , "John" , "Sarford" ,  "ITF", 2007 , Country.other , "LU236890");
		
		System.out.println(student2);
		
		System.out.println("---------------PROFESSORS----------------------");
		Professor prof1= new Professor();
		System.out.println(prof1);
		Professor prof2= new Professor("Estera" , "Vitola", ProfDegree.master);
		System.out.println(prof2);
	}

}
