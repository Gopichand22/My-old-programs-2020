
public class ArrayOfObjs {

	public static void main(String[] args) {

		Food food1 = new Food("pizza");
		Food food2 = new Food("Burger");
		Food food3 = new Food("KFC ckn");

		Food[] ref = { food1, food2, food3 };
		// ref[0] = food1;
		// ref[1] = food2;
		// ref[2] = food3;

		System.out.println(ref[0].name);
		System.out.println(ref[1].name);
		System.out.println(ref[2].name);

	}

}
