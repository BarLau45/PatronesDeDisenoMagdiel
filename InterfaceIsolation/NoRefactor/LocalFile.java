package InterfaceIsolation.NoRefactor;

public class LocalFile implements FileInterface {
    private String name;
    private String ownerUsername;
    private String ownerGroupName;
    private String extension;

    public LocalFile(String name, String ownerUsername, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String Name) {
        this.name = Name;
    }

    @Override
    public void changeOwner(String user, String group) {
        this.ownerUsername = user;
        this.ownerGroupName = group;
    }

    @Override
    public void changeExtension(String extension) {
        this.extension = extension;
    }
}
