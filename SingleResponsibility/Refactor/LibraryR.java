package SingleResponsibility.Refactor;

public class LibraryR {
    private Book book;
    private LibraryMember member;

    public LibraryR(Book book, LibraryMember member) {
        this.book = book;
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LibraryMember getMember() {
        return member;
    }

    public void setMember(LibraryMember member) {
        this.member = member;
    }

    public void lendBook() {
        member.borrowBook(book);
    }

    public void returnBook() {
        member.returnBook(book);
    }

    public void showBookStatus() {
        System.out.println("El estado actual del libro " + book.title + " es: " + book.isAvailable);
    }

}