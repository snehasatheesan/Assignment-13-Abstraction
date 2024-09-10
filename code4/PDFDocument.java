package abstraction4;

public class PDFDocument extends Document{
    PDFDocument(String docName,int size){
        super(docName,size);
    }

    String getDocumentType() {
        return "PDF";
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("Document Type:"+this.getDocumentType());
    }
}
