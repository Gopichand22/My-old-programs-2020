import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsCollRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Gopichand"),
				new Student(245, "Prasad"), new Student(2, "san"),
				new Student(3, "Saranya"));
		Iterator<Student> itera = students.iterator();
		while (itera.hasNext()) {
			System.out.println(itera.next());
		}

		List<Student> studentAl = new ArrayList<>(students);

		System.out.println("Before Sorting : " + students);

	System.out.println("sorted list : " + studentAl);

	}
}
