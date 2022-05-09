package main;

public class Vegetable extends Food{
	
	private int cooked;
	private int cookingMinutes;

	public Vegetable(String _name, int _kcal, int _cookingMinutes) {
		super(_name, _kcal);
		this.cookingMinutes=_cookingMinutes;
		this.edible=(cookingMinutes==cooked);
		// TODO Auto-generated constructor stub
	}
	
	public void cookIt() {
		cooked++;
		edible= (cookingMinutes==cooked);
	}

	@Override
	public int prepare(int weight) {
		if (!edible) {
			cookIt();
		}
		// TODO Auto-generated method stub
		return weight;
	}

}
