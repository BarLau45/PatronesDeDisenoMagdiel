package SingleResponsibility;

public class MainLibrary {
    public static void main(String[] args) {
        Library usbi = new Library("Fundamentos de Sistemas Operativos", "JVergara", true, "Ricardo", "123AA");
        usbi.showBookStatus();
        usbi.borrowBook();
        usbi.lendBook();
        usbi.showBookStatus();
        usbi.returnBook();
        usbi.showBookStatus();
    }
}