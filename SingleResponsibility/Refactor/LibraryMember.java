package SingleResponsibility.Refactor;

public class LibraryMember {
    private String name;
    private String memberID;

    public LibraryMember(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void borrowBook(Book book) {
        System.out.println(name + " ha solicitado el préstamo del libro.");
        book.lendBook();
    }

    public void returnBook(Book book) {
        System.out.println("El libro " + book.title + " ha sido devuelto.");
    }
}
