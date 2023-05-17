package StudentManagementSystem;

class Student {
    String name;
    String stuNo;
    int classess;
    Course math;
    Course physics;
    Course chemistry;
    Course vivaMath;
    Course vivaPhy;
    Course vivaChm;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry, Course vivaMath,
            Course vivaChm, Course vivaPhy) {
        this.name = name;
        this.stuNo = stuNo;
        this.classess = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.vivaMath = vivaMath;
        this.vivaChm = vivaChm;
        this.vivaPhy = vivaPhy;
    }

    public void addBulkExamNote(int math, int physics, int chemistry, int vivaMath, int vivaPhy, int vivaChm) {
        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }
        if (vivaMath >= 0 && vivaMath <= 100) {
            this.vivaMath.note = vivaMath;
        }
        if (vivaPhy >= 0 && vivaPhy <= 100) {
            this.vivaPhy.note = vivaPhy;
        }
        if (vivaChm >= 0 && vivaChm <= 100) {
            this.vivaChm.note = vivaChm;
        }


        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("The notes are not fully entered");
        }
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Passed The Class. ");
            }
            else { System.out.println("Failed The Class.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void calcAverage() {
        this.average = (((this.physics.note * 0.8) + (this.vivaPhy.note * 0.2)) +
                ((this.math.note * 0.8) + (this.vivaMath.note)) +
                ((this.chemistry.note * 0.8) + (this.vivaChm.note))) / 3;

    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Grade : " + this.math.note);
        System.out.println("Math Viva Grade : " + this.vivaMath.note);
        System.out.println("Physics Grade : " + this.physics.note);
        System.out.println("Physics Viva Grade : " + this.vivaPhy.note);
        System.out.println("Chemistry Grade : " + this.chemistry.note);
        System.out.println("Chemistry Viva Grade : " + this.vivaChm.note);

    }
}
