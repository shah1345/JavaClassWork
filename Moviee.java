

class Movie {
    String name;
    String director;
    String ryear;

    public Movie() {

    }


    void Movie(){
        System.out.println("This is a movie");
    }
    Movie(String name,
          String director,
          String ryear){
        this.name = name;
        this.director = director;
        this.ryear = ryear;
    }
}
class scifi extends Movie{


    public scifi() {

    }

    void scifi(){


        Movie();

    }
    scifi(String name,String director,String ryear){
        this.name = name;
        this.director = director;
        this.ryear = ryear;
    }


}
class Moviee{
    public static void main(String[] args) {
        scifi movie1 = new scifi();
        movie1.scifi();
        scifi movie2 = new scifi("tenet","nolan","2020");



    }
}