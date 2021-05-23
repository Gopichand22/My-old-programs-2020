import java.math.BigDecimal;

public class SimpleI {

	BigDecimal pri;

	BigDecimal inter;

	public SimpleI(String pri, String inter) {
		this.pri = new BigDecimal(pri);
		this.inter = new BigDecimal(inter).divide(new BigDecimal(100));

	}

	public BigDecimal totalValue(int noOfYears) {
		BigDecimal total = pri.add(pri.multiply(inter).multiply(new BigDecimal(noOfYears)));
		return total;
	}

}
