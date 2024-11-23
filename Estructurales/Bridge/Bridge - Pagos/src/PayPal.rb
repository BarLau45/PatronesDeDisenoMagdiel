class PayPal < PasarelaDePago
  attr_accessor :moneda, :tarifa_transaccion

  def initialize(moneda = 'USD', tarifa = 2.5)
    @moneda = 'USD'
    @tarifa_transaccion = 2.5
  end

  def procesar_pago(monto)
    monto_total = monto + (monto * tarifa_transaccion / 100)
    puts "Procesando pago #{monto_total} a través de PayPal, con una tarifica de transacción de #{tarifa_transaccion}"
  end

  def rembolsar_pago(monto)
    puts "Rembolso exitoso de #{monto} #{moneda} a través de PayPal"
  end
end