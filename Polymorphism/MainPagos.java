package Polymorphism;

public class MainPagos {
    public static void main(String[] args) {
        ProcesadorDePago procesador = new ProcesadorDePago();

        Pago pagoConTarjeta = new TarjetaDeCredito("1234567890", "15-05-25", "233");
        Pago pagoConPayPal = new PayPal("yuyoandmore@gmail.com");

        procesador.procesar(pagoConTarjeta);
        System.out.println("-------------------------------------------");
        procesador.procesar(pagoConPayPal);
    }
}
