package Polymorphism;

public class ProcesadorDePago {
    public void procesar(Pago pago) {
        pago.procesarPago();

        //Casteo hacia abajo (downcasting) para acceder a funcionalidades específicas
        if(pago instanceof TarjetaDeCredito) {
            TarjetaDeCredito tarjeta = (TarjetaDeCredito) pago;
            tarjeta.verificarLimiteCredito();
        } else if (pago instanceof PayPal) {
            PayPal payPal = (PayPal) pago;
            payPal.enviarRecibo();
        }
    }
}
