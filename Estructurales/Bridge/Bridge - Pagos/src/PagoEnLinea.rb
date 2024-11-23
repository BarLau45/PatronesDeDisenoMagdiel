class PagoEnLinea < MetodoDePago
  def initialize(pasarela, correo_usuario)
    super(pasarela)
    @correo_usuario = correo_usuario
    @codigo_confirmacion = nil
    @transacciones = []
  end

  def pagar(monto)
    puts "Iniciando pago en línea para el usuario #{@correo_usuario}"
    @pasarela.procesar_pago(monto)
    puts "Pago completado"
    @transacciones << {tipo: 'Pago', monto: monto, metodo: 'Pago en línea'}
  end

  def reembolsar(monto)
    puts "Iniciando reembolso en línea para el usuario #{@correo_usuario}"
    @pasarela.reembolsar_pago(monto)
    @transacciones << {tipo: 'Reembolsar', monto: monto, metodo: 'Reembolso en línea'}
  end

  def to_s
    salida = "#{super}\n"
    salida += "Listado de transacciones para el usuario #{@correo_usuario}\n"
    @transacciones.each_with_index do |transaccion, indice|
      salida += "#{indice+1}. Tipo #{transaccion[:tipo]}, Monto $#{transaccion[:monto]}, Metodo #{metodo[:metodo]}"
    end
    salida
  end
end