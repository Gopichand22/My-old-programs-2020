
public abstract class AbstRecipe {
	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}

	protected abstract void getReady();

	protected abstract void cleanUp();

	protected abstract void doTheDish();


}
