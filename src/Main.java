public class Main {

	public static void main(String[] args) throws JmenoException {
		// TODO Auto-generated method stub
		try {
			Trida t = new Trida("");
			t.addStudent(new Student("Ondra", "Houdek", 2.4));
			t.addStudent(new Student("Michal", "Novotny", 1.7));
			t.addStudent(new Student("Dalibor", "Andrlik", 3.2));
			double tridniPrumer = t.prumerTridy();
			double minPrumer = t.minPrumer();
			double maxPrumer = t.maxPrumer();
			System.out.println(t);
			System.out.println("Prumer tridy: " + tridniPrumer);
			System.out.println("Nejlepsi prumer: " + minPrumer);
			System.out.println("Nejhorsi prumer: " + maxPrumer);
		} catch (PrumerException e) {
			System.err.println(e);
		} catch (JmenoException e) {
			System.err.println(e);
		} catch (NazevException e) {
			System.err.println(e);
		}
	}

}
