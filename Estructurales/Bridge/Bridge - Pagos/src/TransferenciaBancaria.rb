class TransferenciaBancaria < PasarelaDePago
  attr_accessor :moneda, :tarifa_transaccion

  def initialize(moneda = 'USD', tarifa_transaccion = 1.0)
    @moneda = moneda
    @tarifa_transaccion = tarifa_transaccion
  end

  def procesar_pago(monto)
    monto_total = monto + (monto * @tarifa_transaccion / 100)
    puts "Procesando pago de #{monto_total} a través de la transferencia bancaria, con una tarifa de #{tarifa_transaccion}"
  end

  def rembolsar_pago(monto)
    puts "Rembolso exitoso de #{monto} #{moneda} a través de transferencia bancaria"
  end
end