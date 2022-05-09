package main;

public class Fruit extends Food {

	private boolean hasPeel;

	public Fruit(String _name, int _kcal, boolean _hasPeel) {
		super(_name, _kcal);
		this.hasPeel=_hasPeel;
		this.edible= !hasPeel;
		// TODO: complete constructor
	}

	public int prepare(int weight) {
		// TODO: to make the fruit edible,
		// peel it if necessary and reduce the weight
		
		return (int) (this.hasPeel ? weight*0.9 : weight) ;
	}

}
