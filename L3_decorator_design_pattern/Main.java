package L3_decorator_design_pattern;

import L3_decorator_design_pattern.base.BasePizza;
import L3_decorator_design_pattern.base.FarmHouse;
import L3_decorator_design_pattern.base.Margherita;
import L3_decorator_design_pattern.base.VegDelight;
import L3_decorator_design_pattern.decorators.ExtraCheese;
import L3_decorator_design_pattern.decorators.Mushroom;

public class Main {

    public static void main(String[] args) {
        BasePizza margheritaBase = new Margherita();
        BasePizza farmHouseBase = new FarmHouse();
        BasePizza vegDelightBase = new VegDelight();

        System.out.println("Basic Margherita Pizza cost: "+margheritaBase.getCost());
        System.out.println("Basic FarmHouse Pizza cost: "+farmHouseBase.getCost());
        System.out.println("Basic VegDelight Pizza cost: "+vegDelightBase.getCost());

        BasePizza margheritaWithExtraCheese = new ExtraCheese(margheritaBase);
        BasePizza margheritaWithMushroom = new Mushroom(margheritaBase);
        System.out.println("\nMargherita + Extra Cheese Pizza cost: "+margheritaWithExtraCheese.getCost());
        System.out.println("Margherita + Mushroom Pizza cost: "+margheritaWithMushroom.getCost());

        BasePizza farmHouseWithMushroom = new Mushroom(farmHouseBase);
        BasePizza farmHouseWithExtraCheeseAndMushroom = new ExtraCheese(farmHouseWithMushroom);
        System.out.println("\nFarmHouse + Mushroom + Extra cheese Pizza cost: "+farmHouseWithExtraCheeseAndMushroom.getCost());
    }

}
