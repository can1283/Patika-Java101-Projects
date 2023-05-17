package StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math", "MAT101","MAT");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry","CHM101", "CHM");
        Course vivaMAth = new Course("Math", "MAT101","MAT");
        Course vivaPhy = new Course("Physics", "PHY101", "PHY");
        Course vivaChm = new Course("Chemistry","CHM101", "CHM");

        Teacher t1 = new Teacher("Rob","90123","MAT");
        Teacher t2 = new Teacher("Jenny", "90456", "PHY");
        Teacher t3 = new Teacher("Barbara", "90789", "CHM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Jack", 4, "01", math, physics,chemistry,vivaMAth,vivaPhy,vivaChm);
        s1.addBulkExamNote(50,20,40,50,60,80);
        s1.isCheckPass();

        Student s2 = new Student("Oliver",4,"02",math, physics,chemistry,vivaMAth,vivaPhy,vivaChm);
        s2.addBulkExamNote(100,50,40,60,40,70);
        s2.isCheckPass();

        Student s3 = new Student("Oscar",4,"03",math,physics,chemistry,vivaMAth,vivaPhy,vivaChm);
        s3.addBulkExamNote(50,20,40,20,10,30);
        s3.isCheckPass();
    }
}
