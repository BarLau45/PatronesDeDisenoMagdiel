package Polymorphism;
class Logger {
    public void log(String... messages) {
        System.out.println("Múltiples mensajes:");

        for(String message : messages) {
            System.out.println(message);
        }
    }
    public <T> void log(T message) {
        System.out.println("Mensaje genérico: " + message);
    }
    public void log(int level, String... messages) {
        System.out.println("Múltiple mensajes con niveles:" + level);
        for(String message : messages)
            System.out.println(message);
    }
}

