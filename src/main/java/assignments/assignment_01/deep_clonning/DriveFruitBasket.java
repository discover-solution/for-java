package assignments.assignment_01.deep_clonning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriveFruitBasket {
    public static void main(String[] args) {
        Fruit papaya = new Fruit("Papaya", "Vitamin-B12", 20);
        Fruit mango = new Fruit("Mango", "Vitamin-(A+B+C+E)", 70);
        Fruit orange = new Fruit("Orange", "Vitamin-C", 40);
        List<Fruit> listOfFruits = new ArrayList<>();
        listOfFruits.addAll(Arrays.asList(papaya,mango,orange));
        FruitBasket basket = new FruitBasket("Fruit Basket 1", "Wood", listOfFruits);

        FruitBasket fruitBasket = null;

        try {
            fruitBasket = (FruitBasket)basket.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // papaya cost = 20
        System.out.println(fruitBasket.listOfFruits.get(0).getFruitName() + " = " +fruitBasket.listOfFruits.get(0).instanceCost);
        // papaya cost changed to 30, using deep cloning
        fruitBasket.listOfFruits.get(0).instanceCost=30;
        // papaya cost = 30
        System.out.println(fruitBasket.listOfFruits.get(0).getFruitName() + " = " +fruitBasket.listOfFruits.get(0).instanceCost);
    }
}