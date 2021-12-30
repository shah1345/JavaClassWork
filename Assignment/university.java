package Assignment;


class Student {

    String Name;
    String Id;
    double CGPA;

    public Student(String name, String id, double CGPA) {
        Name = name;
        Id = id;
        this.CGPA = CGPA;
    }

    double calScholarship() {

        return 0.0;

    }


}


class CollegeStudent extends Student {
    int classPosition;

    public CollegeStudent(String name, String id, double CGPA,int classPosition) {
        super(name, id, CGPA);

        this.classPosition = classPosition;
    }

    @Override
    double calScholarship() {

        return CGPA * 10000 + 10000 / classPosition;

    }

    void printata() {

        System.out.println("Name: " + Name +
                "\nID: " + Id +
                "\ncgpa : " + CGPA +
                "\nscholarship : " + calScholarship()

        );


    }





}

class GradStudent extends Student {

    int noOfPublications;

    public GradStudent(String name, String id, double CGPA,int noOfPublications) {
        super(name, id, CGPA);
        this.noOfPublications = noOfPublications;
    }

    @Override
    double calScholarship() {

        return CGPA * 1000 + 10000 * noOfPublications;

    }

    void printata() {

        System.out.println("Name: " + Name +
                "\nID: " + Id +
                "\ncgpa : " + CGPA +
                "\nscholarship : " + calScholarship()

        );


    }

}


public class university {

    public static void main(String[] args) {

        CollegeStudent C1 = new CollegeStudent("arif", "1000", 3.14,10);
        CollegeStudent C2 = new CollegeStudent("Newaz", "102", 4.00,20);
        CollegeStudent C3 = new CollegeStudent("Oyshi", "1085", 3.67,30);

        GradStudent G1 = new GradStudent("Oyshi", "50", 3.67,1);
        GradStudent G2 = new GradStudent("Oyshi1", "6", 3.67,2);
        GradStudent G3 = new GradStudent("Oyshi3", "466", 3.67,3);


        C1.printata();
        C2.printata();
        C3.printata();
        G1.printata();
        G2.printata();
        G3.printata();


    }
}
