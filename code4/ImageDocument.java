package abstraction4;

public class ImageDocument extends Document{
    ImageDocument(String docName,int size){
        super(docName,size);
    }

    String getDocumentType() {
        return "Image";
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("Document Type is:"+this.getDocumentType());
    }
}
