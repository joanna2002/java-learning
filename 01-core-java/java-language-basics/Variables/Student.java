public class Student {
    // 1. Fields

    // instance variable - name
    String name;

    // instance variable - gradeLevel
    int gradeLevel;

    // class variable - schoolName
    static String schoolName = "Mountain High School";

    // class variable - studentCount
    static int studentCount = 0;

    // 2. Constructor
    public Student (String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        studentCount++;
    }

    // 3. Method - introduce()
    public void introduce() {
        String message = "Hi, I'm " + name + " in grade " + gradeLevel + " at " + schoolName;
        System.out.println(message);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Alice", 10);
        student1.introduce();

        Student student2 = new Student("Travis", 11);
        student2.introduce();

        Student student3 = new Student("Mary", 9);
        student3.introduce();

        System.out.println("Student Count: " + studentCount);

    }

}
