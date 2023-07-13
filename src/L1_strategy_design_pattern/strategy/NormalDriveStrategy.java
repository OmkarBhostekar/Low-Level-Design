package L1_strategy_design_pattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("normal speed driving");
    }
}
