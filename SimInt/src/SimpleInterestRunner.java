import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		SimpleI si = new SimpleI("2000.00", "7.5");
		BigDecimal total = si.totalValue(5);
		System.out.println(total);

	}

}