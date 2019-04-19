public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Game Design");
		Course course2 = new Course("Interactive Media");

		course1.addStudent("Tony Stark");
		course1.addStudent("Steve Rogers");
		course1.addStudent("Bruce Banner");

		course2.addStudent("Peter Parker");
		course2.addStudent("Bucky Barnes");

		System.out.println("Number of students in Game Design: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ". ");

		System.out.println();
		System.out.print("Number of students in Interactive Media: "
			+ course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		
		System.out.println();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students2[i] + ". ");
	}
}