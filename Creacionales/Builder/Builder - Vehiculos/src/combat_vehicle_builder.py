from src.combat_vehicle import CombatVehicle


class CombatVehicleBuilder:
    def __init__(self):
        self.vehicle = CombatVehicle()

    def build_type(self, type):
        self.vehicle.type = type
        return self
    def build_engine(self, engine):
        self.vehicle.engine = engine
        return self
    def build_weapons(self, weapons):
        self.vehicle.weapons = weapons
        return self
    def build_armor(self, armor):
        self.vehicle.armor = armor
        return self

    def build(self):
        return self.vehicle