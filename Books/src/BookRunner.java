
public class BookRunner {

	public static void main(String[] args) {
		Books artOfcomputerPro = new Books();
		Books effectiveJava = new Books();
		Books cleanCode = new Books();

		artOfcomputerPro.setCopies(434);
		effectiveJava.setCopies(467);
		cleanCode.setCopies(213);

		artOfcomputerPro.addCopies(20);
		System.out.println(artOfcomputerPro.getNoOfCopies());
	}

}
