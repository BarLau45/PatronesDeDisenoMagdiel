class MetodoDePago
  def initialize(pasarela)
    @pasarela = pasarela
  end

  def pagar(monto)
    raise NotImplementedError
  end

  def reembolsar_pago(monto)
    raise NotImplementedError
  end

  def to_s
    "Método de Pago: #{self.class.name}, Pasarela #{@pasarela.class.name}"
  end
end