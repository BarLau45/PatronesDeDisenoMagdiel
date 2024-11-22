package InterfaceIsolation.Refactor;

public class DropboxFile implements SupportsRenaming{
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

    public String getName() {
        return name;
    }
}
