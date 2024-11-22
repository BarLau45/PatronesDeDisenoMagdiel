package Interfaces;

public class BasicOperations {

    public static class Addition implements Operation {

        public int execute(int a, int b) {
            return a + b;
        }
    }

    public static class Subtract implements Operation {
        public int execute(int a, int b) {
            return a - b;
        }
    }

    public static class Multiply implements Operation {
        public int execute(int a, int b) {
            return a * b;
        }
    }

    public static class Divide implements Operation {
        public int execute(int a, int b) {
            return a / b;
        }
    }
}
