package InterfaceIsolation.Refactor;

public class FilePermissionManager {
    public void transferOwnerShip(SupportsChangeOfOwnership file, String ownerUsername, String ownerGroupName) {
        //
        file.changeOwner(ownerUsername, ownerGroupName);
    }
}
