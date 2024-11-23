import {IvoryTowerProxy} from "./IvoryTowerProxy";
import {IvoryTower} from "./IvoryTower";
import {Wizard} from "./Wizard";

const proxy = new IvoryTowerProxy(new IvoryTower());

proxy.enter(new Wizard("Merlin", 10))
proxy.enter(new Wizard("Maguito de Sonrics", 12))
proxy.enter(new Wizard("Mago de Oz", 2))
proxy.enter(new Wizard("MagoLexis", 99))
proxy.enter(new Wizard("MAGo", 15))
proxy.enter(new Wizard("Wizard Installer", 13))