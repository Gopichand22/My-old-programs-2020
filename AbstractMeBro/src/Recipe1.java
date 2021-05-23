
public class Recipe1 extends AbstRecipe {

	@Override
	protected
	void getReady() {
		System.out.println("Get the raw materials");

	}

	@Override
	protected
	void doTheDish() {
		System.out.println("Prepare the dish");
		System.out.println("place in things");
	}

	@Override
	protected
	void cleanUp() {
		System.out.println("Clean the things and make it look clean");
	}

}
