package StudentManagementSystem;

class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int vivaMath;
    int vivaPhy;
    int vivaChm;
    int note;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.courseTeacher = courseTeacher;
        this.note = 0;
    }


    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t; System.out.println("The operation is successful"); }
        else { System.out.println(t.name + " Academician cannot teach this course."); }

    }

    public void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " Academician of the course: " + courseTeacher.name);
        }
        else {
            System.out.println(this.name + " to the course no Academician has been appointed.");
        }

    }
}
