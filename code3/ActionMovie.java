package abstraction3;
public class ActionMovie extends Movie{
    ActionMovie(String title,float budget){
        super(title,budget);
    }

   String getGenre() {
        return "The genre of the movie is Action.";
    }
    void getDetails() {
        super.getDetails();
        System.out.println("Genre:"+getGenre());
    }
}
