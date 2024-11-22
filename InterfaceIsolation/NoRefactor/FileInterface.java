package InterfaceIsolation.NoRefactor;

public interface FileInterface {
    void rename(String name);
    void changeOwner(String user, String group);
    void changeExtension(String extension);
}
