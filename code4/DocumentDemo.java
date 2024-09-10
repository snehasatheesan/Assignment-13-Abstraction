package abstraction4;


public class DocumentDemo {
    public static void main(String[] args) {
        Document d;
        d=new ImageDocument("Birthday",20);
        d.getDetails();
        System.out.println("-----------------------------------");

        d=new PDFDocument("Notes",15);
        d.getDetails();
        System.out.println("-----------------------------------");

        d=new TextDocument("Details",19);
        d.getDetails();
        System.out.println("-----------------------------------");
    }
}
