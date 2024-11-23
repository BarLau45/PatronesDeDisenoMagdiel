require_relative 'PasarelaDePago'
require_relative 'PayPal'
require_relative 'TransferenciaBancaria'
require_relative 'MetodoDePago'
require_relative 'PagoEnLinea'

class Main

  pasarela_paypal = PayPal.new
  pago_linea_paypal = PagoEnLinea.new(pasarela_paypal, "jazgalau@hotmail.com")

  pago_linea_paypal.pagar(150)

  puts pago_linea_paypal
  
end