package L1_strategy_design_pattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("sports speed driving");
    }
}
