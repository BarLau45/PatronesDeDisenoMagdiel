class PasarelaDePago
  def procesar_pago(monto)
    raise NotImplementedError
  end

  def rembolsar_pago(monto)
    raise NotImplementedError
  end
end