package InterfaceIsolation.NoRefactor;

public class DropboxFile implements FileInterface {
    private String name;
    private String ownerUsername;
    private String ownerGroupName;

    public DropboxFile(String name, String ownerUsername, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }

    @Override
    public void changeOwner(String user, String group) {
        //
    }

    @Override
    public void changeExtension(String extension) {
        //
    }
}
