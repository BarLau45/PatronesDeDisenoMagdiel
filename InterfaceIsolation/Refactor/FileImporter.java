package InterfaceIsolation.Refactor;

public class FileImporter {
    public void importFile(SupportsRenaming file, String name) {
        // lógica para importar
        file.rename(name);
    }
}
