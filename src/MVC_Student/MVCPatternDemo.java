package MVC_Student;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);

        controller.updateView();
        controller.setStudentName("Michael");
        System.out.println("\nAfter updating, Student Details are as follows");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Andrew");
        student.setId("5585");
        student.setYear(2);
        return student;

    }
}
