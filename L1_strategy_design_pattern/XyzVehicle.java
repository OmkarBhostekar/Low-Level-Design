package L1_strategy_design_pattern;

import L1_strategy_design_pattern.strategy.DriveStrategy;
import L1_strategy_design_pattern.strategy.SportsDriveStrategy;

public class XyzVehicle extends Vehicle {

    public XyzVehicle() {
        super(new SportsDriveStrategy());
    }
}
