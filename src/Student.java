
public class Student {
	private String FirstName;
	private String LastName;
	private double prumer;

	public void setPrumer(double prumer) throws PrumerException {
		if (prumer < 1 || prumer > 5) {
			throw new PrumerException();
		}
		this.prumer = prumer;
	}

	public void setFirstName(String name) throws JmenoException {
		if (name == null || name.length() == 0 || name.length() == 1 || name.length() == 2) {
			throw new JmenoException();
		}
		this.FirstName = name;
	}

	public void setLastName(String name) throws JmenoException {
		if (name == null || name.length() == 0 || name.length() == 1 || name.length() == 2) {
			throw new JmenoException();
		}
		this.LastName = name;
	}

	public double getPrumer() {
		return prumer;
	}

	public Student(String firstName, String lastName, double prumer) throws PrumerException, JmenoException {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPrumer(prumer);
	}

	@Override
	public String toString() {
		return FirstName + " " + LastName + " " + prumer;
	}
}
