import {IWizardTower} from "./IWizardTower";
import {Wizard} from "./Wizard";
import {Logger} from "./Logger";

export class IvoryTower implements IWizardTower{
    enter(wizard: Wizard) {
        Logger.info("{} enters the tower.", wizard);
    }
}