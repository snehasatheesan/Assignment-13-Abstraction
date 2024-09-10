package abstraction3;
public class MovieDemo {
    public static void main(String[] args) {
        Movie m;
        m=new ActionMovie("Basha",2008353f);
        m.getDetails();
        System.out.println();

        m=new RomComMovie("18 Again",10900f);
        m.getDetails();
        System.out.println();

        m=new ThrillerMovie("Flipped",28765f);
        m.getDetails();
    }
}
