package Polymorphism;
//clase base Pago
abstract class Pago {
    abstract void procesarPago();
}
//Clase derivada para pagos con tarjeta de crédito
class TarjetaDeCredito extends Pago {
    private String numeroTarjeta;
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaDeCredito(String numeroTarjeta, String fechaExpiracion, String codigoSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    void procesarPago() {
        System.out.println("Procesando pago con tarjeta de crédito");
        //Lógica para procesar pago con tarjeta de crédito
    }
    public void verificarLimiteCredito() {
        System.out.println("Verificando límite de crédito");
        //Lógica para verificar límite de crédito
    }
}

class PayPal extends Pago {
    private String emailUsuario;

    public PayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    @Override
    void procesarPago() {
        System.out.println("Procesando pago con PayPal...");
        //Lógica para procesar pago con PayPal
    }
    public void enviarRecibo() {
        System.out.println("Enviando recibo al correo...");
        //Lógica para enviar recibo al correo
    }
}