abstract class Document {
    protected String title;
    protected String author;

    public Document(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void open();
    public abstract void close();
    public abstract String getDocumentType();

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Document Type: " + getDocumentType());
    }
}

class PDFDocument extends Document {
    private int numPages;

    public PDFDocument(String title, String author, int numPages) {
        super(title, author);
        this.numPages = numPages;
    }

    @Override
    public void open() {
        System.out.println("Opening PDF document: " + title);
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document: " + title);
    }

    @Override
    public String getDocumentType() {
        return "PDF Document";
    }

    public void printPageCount() {
        System.out.println("Total Pages: " + numPages);
    }
}

class TextDocument extends Document {
    private int wordCount;

    public TextDocument(String title, String author, int wordCount) {
        super(title, author);
        this.wordCount = wordCount;
    }

    @Override
    public void open() {
        System.out.println("Opening Text document: " + title);
    }

    @Override
    public void close() {
        System.out.println("Closing Text document: " + title);
    }

    @Override
    public String getDocumentType() {
        return "Text Document";
    }

    public void printWordCount() {
        System.out.println("Total Words: " + wordCount);
    }
}

class ImageDocument extends Document {
    private String resolution;

    public ImageDocument(String title, String author, String resolution) {
        super(title, author);
        this.resolution = resolution;
    }

    @Override
    public void open() {
        System.out.println("Opening Image document: " + title);
    }

    @Override
    public void close() {
        System.out.println("Closing Image document: " + title);
    }

    @Override
    public String getDocumentType() {
        return "Image Document";
    }

    public void printResolution() {
        System.out.println("Resolution: " + resolution);
    }
}

public class MyDocuments {
    public static void main(String[] args) {
        Document pdf = new PDFDocument("Java Guide", "A Rufus", 120);
        Document text = new TextDocument("Notes", "Rufus Victor", 5000);
        Document image = new ImageDocument("Sunset", "Victor J", "1920x1080");
        System.out.println("Document Details:\n");
        pdf.displayDetails();
        pdf.open();
        ((PDFDocument) pdf).printPageCount();
        pdf.close();
        System.out.println();
        text.displayDetails();
        text.open();
        ((TextDocument) text).printWordCount();
        text.close();
        System.out.println();
        image.displayDetails();
        image.open();
        ((ImageDocument) image).printResolution();
        image.close();
    }
}
