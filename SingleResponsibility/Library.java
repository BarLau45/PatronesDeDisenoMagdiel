package SingleResponsibility;

public class Library {
    public String title;
    public String author;
    public boolean isAvailable;
    public String memberName;
    public String memberID;

    public Library(String title, String author, boolean isAvailable, String memberName, String memberID) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.memberName = memberName;
        this.memberID = memberID;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void lendBook() {
        if(isAvailable) {
            isAvailable = false;
            System.out.println("El libro " + title + " no está disponible.");
        } else {
            System.out.println("El libro " + title + " está disponible.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("El libro " + title + " ha sido devuelto.");
    }

    public void borrowBook() {
        System.out.println(memberName + " ha solicitado el préstamo del libro.");
    }

    public void showBookStatus() {
        System.out.println("El estado actual del libro " + title + " es: " + isAvailable);
    }
}