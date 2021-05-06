
public class Main {

	public static void main(String[] args) {
		
		
		
		 Student student = new Student(0, "nurullah@gmail.com", 58, "nurullah", "diri");
		 
		 Instructor ınstructor = new Instructor(02,"engin@gmail.com",21,"engin","demırog");

		 StudentManager studentManager = new StudentManager();
	
		 studentManager.add(student);
		
		
		 InstructorManager ınstructorManager = new InstructorManager();
	
		 ınstructorManager.add(ınstructor);
	
         }
		 
		 
	}


