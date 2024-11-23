export class Wizard {
    private name: string;
    private level: number;

    constructor(name: string, level: number) {
        this.name = name;
        this.level = level;
    }

    public getLevel(): number {
        return this.level;
    }

    public setLevel(level: number): void {
        this.level = level;
    }
}