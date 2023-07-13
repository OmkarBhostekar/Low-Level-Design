package L1_strategy_design_pattern;

import L1_strategy_design_pattern.strategy.DriveStrategy;
import L1_strategy_design_pattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{


    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
