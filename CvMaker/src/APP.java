import java.util.Scanner;

class person {
	String name, f_name, m_name, sex, scl, h_sc, course_1 ,uni_1, course_2, uni_2,add_1, add_2, add_3, add_4;
	int age, date_1, date_2, date_3, date_4;
	long pin;
	
	
	void func() {
		System.out.println("\nINFORMATION ABOUT THE PERSON.\n");
	}
}

public class APP {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
		
		person person = new person();
		
		System.out.println("Enter the name:");
		person.name = input.nextLine();
		System.out.println("Enter the father name:");
		person.f_name = input.nextLine();
		System.out.println("Enter the mother name:");
		person.f_name = input.nextLine();
		System.out.println("Enter the city/village name:");
		person.add_1 = input.nextLine();
		System.out.println("Enter the distric name:");
		person.add_2 = input.nextLine();
		System.out.println("Enter the state name:");
		person.add_3 = input.nextLine();
		System.out.println("Enter the pin code:");
		person.pin = input.nextLong();
		System.out.println("Enter the nationality name:");
		person.add_4 = input.next();
		System.out.println("Enter the age:");
		person.age = input.nextInt();	
		System.out.println("Enter the gender name:");
		person.sex = input.next();
		System.out.println("Enter the secondary board name:");
		person.scl = input.next();
		System.out.println("Enter the year passing:");
		person.date_1 = input.nextInt();
		System.out.println("Enter the high secondary board name:");
		person.h_sc = input.next();
		System.out.println("Enter the year passing:");
		person.date_2 = input.nextInt();
		System.out.println("Enter the bachelor degree name:");
		person.course_1 = input.next();
		System.out.println("Enter the university name:");
		person.uni_1 = input.next();
		System.out.println("Enter the year passing:");
		person.date_3 = input.nextInt();
		System.out.println("Enter the master degree name:");
		person.course_2 = input.next();	
		System.out.println("Enter the university name:");
		person.uni_2 = input.next();
		System.out.println("Enter the year passing:");
		person.date_4 = input.nextInt();
		person.func();
		
		System.out.println("NAME: " + person.name);
		System.out.println("FATHE NAME: " + person.f_name);
		System.out.println("MOTHER NAME: " + person.m_name);
		System.out.println("CITY/VILLAGE: " + person.add_1);
		System.out.println("DISTRIC: " + person.add_2);
		System.out.println("STATE: " + person.add_3);
		System.out.println("pin: " + person.pin);
		System.out.println("NATIONALITY: " + person.add_4);
		System.out.println("AGE: " + person.age);
		System.out.println("GENDER: "+ person.sex);
		System.out.println("10th BOARD: " + person.scl);
		System.out.println("YEAR OF PASSING: " + person.date_1);
		System.out.println("12th BOARD: " + person.h_sc);
		System.out.println("YEAR OF PASSING: " + person.date_2);
		System.out.println("UG DEGREE NAME: " + person.course_1);
		System.out.println("UNIIVERSITY NAME: " + person.uni_1);
		System.out.println("YEAR OF PASSING: " + person.date_3);
		System.out.println("PG COURSE NAME: " + person.course_2);
		System.out.println("UNIIVERSITY NAME: " + person.uni_2);
		System.out.println("YEAR OF PASSING: " + person.date_4);

	}

}
