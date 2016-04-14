import com.example.models.Student;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		Student student =  new Student("Kalle");	
		System.err.println("Name of student: " + student.getName());
	}

}
