class Car {
    
    engineType: number;
    make: string;

    constructor(engine: number) {
        this.engineType = engine;
    }
    constructor(engine: number, make: string) {
        this.make = make;
    }


}