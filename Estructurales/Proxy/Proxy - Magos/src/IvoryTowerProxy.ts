import {IWizardTower} from "./IWizardTower";
import {Wizard} from "./Wizard";
import {Logger} from "./Logger";

export class IvoryTowerProxy implements IWizardTower {
    private NUM_WIZARDS_ALLOWED: number;
    private numWizards: number;
    private tower: IWizardTower;

    constructor(tower: IWizardTower) {
        this.tower = tower;
        this.numWizards = 0;
        this.NUM_WIZARDS_ALLOWED = 3;
    }

    public getNumWizards(): number {
        return this.numWizards;
    }

    enter(wizard: Wizard): void {
        if (this.getNumWizards() < this.NUM_WIZARDS_ALLOWED && wizard.getLevel() >= 10) {
            this.tower.enter(wizard);
            this.numWizards++;
        } else {
            Logger.info("{} is not allowed to enter :(", wizard);
        }
    }
}