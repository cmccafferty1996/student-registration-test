package year4.assignment1.student_registration_test;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import year4.assignment1.student_registration_system.Course;
import year4.assignment1.student_registration_system.Module;
import year4.assignment1.student_registration_system.Student;

public class DriverClass {
    public static void main( String[] args ){
    	
    	//Create 5 new Students
    	Student student1 = new Student("John Smith", 18, "Dublin", "12/07/1999", "ST0012");
    	Student student2 = new Student("Mary O'Neil", 21, "Galway", "21/03/1996", "ST7564");
    	Student student3 = new Student("Paul O'Brian", 22, "Limerick", "02/03/1995", "ST5290");
    	Student student4 = new Student("Laura Smith", 21, "Athlone", "01/10/1996", "ST1111");
    	Student student5 = new Student("Joe Toole", 36, "Dublin", "12/04/1981", "ST8354");
    	
    	//Add to a List
    	List<Student> students1 = new ArrayList<Student>();
    	students1.add(student1);
    	students1.add(student2);
    	
    	List<Student> students2 = new ArrayList<Student>();
    	students2.add(student3);
    	students2.add(student4);
    	students2.add(student5);
    	
    	//Create 5 new Modules
    	Module module1 = new Module("Software Engineering", "CT417", students1);
    	Module module2 = new Module("Data Mining", "CT475", students1);
    	Module module3 = new Module("Telecommunications", "EE453", students2);
    	Module module4 = new Module("System on chip", "EE451", students2);
    	
    	//Add to a list
    	List<Module> itModules = new ArrayList<Module>();
    	itModules.add(module1);
    	itModules.add(module2);
    	
    	List<Module> engModules = new ArrayList<Module>();
    	engModules.add(module3);
    	engModules.add(module4);
    	
    	//Create two new courses
    	DateTime start = new DateTime();
    	start.withDate(2017, 9, 4);
    	DateTime end = new DateTime();
    	end.withDate(2018, 5, 16);
    	
    	Course course1 = new Course("Engineering", engModules, start, end);
    	Course course2 = new Course("Information Technology", itModules, start, end);
    	
    	//Add to a List for printing
    	List<Course> courses = new ArrayList<Course>();
    	courses.add(course1);
    	courses.add(course2);
    	
    	//print
    	System.out.println("Students registered for courses here:");
    	for (int i=0; i < courses.size(); i++){
    		System.out.println("In "+courses.get(i).getName() + ":");
    		List<Module> modules = courses.get(i).getModules();
    		for (int j=0; j < modules.size(); j++){
    			System.out.println("Studying: "+modules.get(j).getName()+ ":");
    			List<Student> students = modules.get(j).getStudents();
    			for (int k=0; k < students.size(); k++){
    				System.out.println(students.get(k).getName());
    			}
    		}
    		System.out.println(" ");
    	}
    	System.out.println(" ");
    }
}
