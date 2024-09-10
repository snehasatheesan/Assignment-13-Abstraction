package abstraction3;
public class RomComMovie extends Movie{
    RomComMovie(String title,float budget){
        super(title,budget);
    }
    String getGenre() {
        return "The genre of the movie is Rom Com.";
    }

    void getDetails() {
        super.getDetails();
        System.out.println("Genre:"+getGenre());
    }
}
