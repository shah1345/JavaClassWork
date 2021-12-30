// Java Encapsulation



public class ClockTime {
    private int second;
    private int minute;
    private int hour;

    ClockTime(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    int getHour(){
        return hour;
    }

    void setHour(int hour){
        if(hour>=0 && hour<24)
            this.hour = hour;
    }
}

class EncapsulationTest{
    public static void main(String[] args) {
        ClockTime t1 = new ClockTime(50, 50, 12);
        t1.setHour(18);
        System.out.println(t1.getHour());
    }
}

/*
Task: Create a class Student which has 3 instance
variables: name, id and cgpa.

The id should be a six digit number.

cgpa should be: (write yourself)

Create the student class with proper
Encapsulation.

Time: 4: 30 PM
 */