package lectures.lecture_04.homework.deepclonning;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	private int id;
	private String basketType;
	private List<Fruit> listOfFruits;
	
	public Basket(int id, String basketType, List<Fruit> listOfFruits) {
		this.id = id;
		this.basketType = basketType;
		this.listOfFruits = new ArrayList<>();
		this.listOfFruits.addAll(listOfFruits);
	}
	
	
	
}