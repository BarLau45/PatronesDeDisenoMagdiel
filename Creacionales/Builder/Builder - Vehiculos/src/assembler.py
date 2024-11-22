class Assembler:
    def __init__(self, builder):
        self.builder = builder

    def create_vehicle(self):
        return self.builder.build_type("Tanque").build_engine("Motor de 1500 HP").build_weapons("Cañón de 120 mm").build_armor("Blindaje pesado").build()
