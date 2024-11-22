class CombatVehicle:
    def __init__(self, type=None, engine=None, weapons=None, armor=None):
        self.type = type
        self.engine = engine
        self.weapons = weapons
        self.armor = armor

    def __str__(self):
        return f"Tipo: {self.type} \nMotor: {self.engine} \nArmas: {self.weapons} \nBlindaje: {self.armor}"