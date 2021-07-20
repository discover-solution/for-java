package assignments.assignment_01.deep_clonning;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FruitBasket implements Serializable, Cloneable{
    private static final long serialVersionUID = 484285894522377684L;
    private final String basketName; // "fruitName.concat("_basket")
    private final String basketType; // "water_proof/no_water_proof"
    List<Fruit> listOfFruits;

    public FruitBasket(String basketName, String basketType, List<Fruit> listOfFruits){
        this.basketName = basketName;
        this.basketType = basketType; 
        this.listOfFruits = new ArrayList<>();
        this.listOfFruits.addAll(listOfFruits);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        FruitBasket fruitBasket = (FruitBasket)super.clone();
        
        List<Fruit> clonnedList = new ArrayList<>();
        fruitBasket.listOfFruits.forEach(fruit->{
            clonnedList.add(fruit);
        });

        return fruitBasket;
    }

    public String getBasketName() {
        return basketName;
    }

    public String getBasketType() {
        return basketType;
    }

    public List<Fruit> getListOfFruits() {
        return this.listOfFruits;
    }    
}

class Fruit implements Serializable, Cloneable{
    private static final long serialVersionUID = 5702866093760700433L;

    private final String fruitName; // "papaya, mango, watermelon"
    private final String nutritionType; // "Vitamin-B12, Vitamin A"
    int instanceCost; // "Fruit cost"

    public Fruit(String fruitName, String nutritionType, int initializerCost){
        this.fruitName = fruitName;
        this.nutritionType = nutritionType;
        this.instanceCost = compare(initializerCost);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getNutritionType() {
        return nutritionType;
    }

    public int getCost() {
        return this.instanceCost;
    }

    private int compare(int initializerCost){
        return instanceCost != initializerCost ? Integer.valueOf(initializerCost) : Integer.valueOf(instanceCost);
    }
}