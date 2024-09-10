package abstraction3;

public class ThrillerMovie extends Movie{
    ThrillerMovie(String title,float budget){
        super(title,budget);
    }

    String getGenre() {
        return "The genre of the movie is Thriller.";
    }
    void getDetails() {
        super.getDetails();
        System.out.println("Genre:"+getGenre());
    }
}
