class TestCourse {

    public static void main(String[] args) {
        Course course = new Course("CSE");
  
        course.addStudent("Clark");
        course.addStudent("Oliver");
        course.addStudent("Bruce");
      
        course.dropStudent("Bruce");
       
        System.out.println("The Students enrolled in the course are");
        for(int i = 0; i < course.getNumberOfStudents(); ++i) {
            System.out.println(course.getStudents()[i]);
        }
    }

}