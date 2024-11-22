package SingleResponsibility.Refactor;

public class Book {
    public String title;
    public String author;
    public boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailible() {
        return isAvailable;
    }

    public void setAvailible(boolean availible) {
        isAvailable = availible;
    }

    public void lendBook() {
        if(isAvailable) {
            isAvailable = false;
            System.out.println("El libro " + title + " ha sido prestado");
        } else {
            System.out.println("El libro " + title + " no está disponible");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("El libro " + title + " ha sido devuelto.");
    }
}
