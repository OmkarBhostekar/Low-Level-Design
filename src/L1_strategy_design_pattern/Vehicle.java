package L1_strategy_design_pattern;

import L1_strategy_design_pattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

}
