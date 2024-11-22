from src.assembler import Assembler
from src.combat_vehicle_builder import CombatVehicleBuilder

if __name__ == "__main__":
    builder = CombatVehicleBuilder()
    assembler = Assembler(builder)

    tank = assembler.create_vehicle()
    print(tank)