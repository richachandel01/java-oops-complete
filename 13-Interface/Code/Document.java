public class Document implements Printable {

    @Override
    public void print() {

        System.out.println("Printing document");
    }

    public static void main(String[] args) {

        Printable document = new Document();

        document.print();
    }
}