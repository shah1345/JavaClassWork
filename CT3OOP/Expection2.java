package CT3OOP;


class Date {
    private int day;
    private int year;
    private int month;

    public Date(int day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Date() {
    }

    public void Check() {

        try {


            if (!(day <= 31 && day >= 1)) {

                throw new InvalidDayException(30);
            }

            if (!(month <= 12 && month >= 1)) {

                throw new InvalidMonthException(month);
            }
            if (year < 0) {
                throw new InvalidYearException();
            }
            if (!(month % 2 == 0 && day <= 30)
                    || (!(month == 2 && day <= 28)
                    && !(month == 2 && day <= 29 && checkLeap(year) == true))
            ) {

//                System.out.println("It's Leap Year: " + checkLeap(Year) +
//                        "\n Day: "+ Day +
//                        "\n Month: "+ Month
//                );
//                System.out.println("Logic 1: " + !(Month % 2 == 0 && Day <= 30) +
//                        "\n Logic 2:  "+ !(Month == 2 && Day <= 29 && checkLeap(Year) == true) +
//                        "\n Logic 3: : "+ !(Month == 2 && Day <= 28 )
//                );

                throw new DayMonthMismatchException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkLeap(int year) {
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }

            // if the year is not century
            else
                return true;
        } else
            return false;


    }


}


class Student1 {
    int id; // instance variable
    static String university = "UIU"; // static variable only has one copy

    void fnc() {
        System.out.println(university);
        university = "UIU CSE";
    }
}


public class Expection2 {
    public static void main(String[] args) {


//        2. Write a main method for the Date class in the previous question and create five objects: 1 with valid
//        parameters and four others with all the possible exception cases. Use all the try...catch blocks that
//        are necessary.


        Date obj1 = new Date(25, 2020, 2);
        Date obj2 = new Date(31, 2020, 4);
        Date obj3 = new Date(61, 2020, 2);
        Date obj4 = new Date(29, 2022, 2);
        Date obj5 = new Date(25, -20, 2);


        obj1.Check();
        obj2.Check();
        obj3.Check();
        obj4.Check();
        obj5.Check();


//        System.out.println(Student1.university);
//        System.out.println(Student1.university);


    }


}


class InvalidDayException extends Exception {

    public InvalidDayException(int Day) {
        super("Day is not in the range 1-31");

    }


    public InvalidDayException(String msg) {
        super(msg);


    }
}

class InvalidMonthException extends Exception {


    InvalidMonthException(int Month) {

        super("the month is not in the range 1-12");

    }


}


class InvalidYearException extends Exception {


    InvalidYearException() {


        super("the year is negative");
    }


}

class DayMonthMismatchException extends Exception {

    public DayMonthMismatchException() {
        super("input does not match with month");

    }

}


//3. Is it possible to think of any parent class of the Exception classes defined in Question 1?
//        If your answer is yes, name that super class and mention what changes might be needed in your
//        codes?
//        If your answer is no, you have to justify why it is not possible


//
//  if (Year < 0) {
//
//        throw new IllegalArgumentException();
//        }


