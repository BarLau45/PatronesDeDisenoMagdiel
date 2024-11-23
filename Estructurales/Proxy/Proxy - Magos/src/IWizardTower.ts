import {Wizard} from "./Wizard";

export interface IWizardTower {
    enter(wizard: Wizard): void;
}