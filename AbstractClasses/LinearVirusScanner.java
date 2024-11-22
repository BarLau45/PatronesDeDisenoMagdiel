package AbstractClasses;

public class LinearVirusScanner extends VirusScanEngine {
    private static final byte[][] virusSignatures = new byte[][] {
            new byte[]  {'I', 'L', 'A', 'O', 'V', 'E', 'Y', 'U'},
            new byte[] {'M', 'e', 'l', 'i', 's', 's', 'a'}
    };

    @Override
    int findVirus(byte[] memory, int startIndex) {
        int size = 0;
        scan:
        {
            signatures: for (int v = 0; v < virusSignatures.length; v++) {
                for (int t = 0; t < virusSignatures[v].length; t++) {
                    if (memory[startIndex + t] != virusSignatures[v][t]) {
                        break scan;
                    }
                }
                size = virusSignatures[v].length;
                break signatures;
            }
        }
        return size;
    }

    @Override
    void deleteVirus(byte[] memory, int startIndex, int size) {

    }

    @Override
    void reportVirus(byte[] memory, int startIndex, int size) {
        for(int n = startIndex; n < size; n++) {
            System.out.print(memory[n] + " ");
        }
    }
}
