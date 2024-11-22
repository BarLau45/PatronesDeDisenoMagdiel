package AbstractClasses;

public abstract class VirusScanEngine {
    public boolean scan(byte[] memory, Action action) {

        boolean virusFound = false;
        int index = 0;

        while (index < memory.length) {
            int size = findVirus(memory, index);

            if(size > 0) {
                switch(action) {
                    case DELETE:
                        deleteVirus(memory, index, size);
                        break;
                    case REPORT:
                        reportVirus(memory, index, size);
                        break;
                }
                index += size;
                virusFound = true;
            }
            index++;
        }
        return virusFound;
    }

    abstract int findVirus(byte[] memory, int startIndex);

    abstract void deleteVirus(byte[] memory, int startIndex, int size);

    abstract void reportVirus(byte[] memory, int startIndex, int size);
}
