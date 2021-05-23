
public class Recur {

	static int fun(int d) {
		if (d > 0) {
			return (fun(d - 1) + d);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(fun(5));
	}
}

