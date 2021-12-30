/*2. a) Consider the following MovieTheater class. Now, write a Movie class in such a way that MovieTheater
class will give expected output as shown below.
        Code  */


class Movie {
    String name,time;
    int year;


    public Movie(String Name, int Year, String Time) {

        name=Name;
        year=Year;
        time=Time;


    }

    public static void movieInfo(Movie m_debi) {


        System.out.println("Movie name: " + m_debi.name + ", year: "+ m_debi.year + ", Duration: " + m_debi.time);

    }

    public void play() {

        System.out.println(" Playing: " + name + " [" + year +"]");
    }
}




public class MovieTheater {
    public static void main(String[] args) {
        Movie m_Debi = new Movie("Debi", 2018, "1hr 30min");
        Movie m_Venom = new Movie ("Venom", 2018, "1hr");
        m_Debi.play();
        m_Venom.play();
        Movie.movieInfo(m_Debi);
    }
}



