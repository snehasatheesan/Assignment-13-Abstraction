 //4. Create 'Document' abstract class. Create subclasses like PDFDocument, TextDocument, ImageDocument, etc.
    //Create abstract methods and concrete methods and demonstrate how they work.

package abstraction4;

public abstract class Document {
   
    String docName;
    int size; // in bytes
    Document(String docName,int size){
        this.docName=docName;
        this.size=size;
    }
    public void getDetails(){
        System.out.println("Name:"+this.docName);
        System.out.println("Size (in Bytes):"+this.size);
    }
    abstract String getDocumentType();
}
