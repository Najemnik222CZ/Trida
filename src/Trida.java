import java.util.*;

public class Trida {
	private String nazev;
	
	public void setNazev(String nazev) throws NazevException {
		if(nazev==null||nazev.length()==0||nazev.length()==1||nazev.length()==2)
		{
			throw new NazevException();
		}
		this.nazev = nazev;
	}
	private ArrayList<Student> students;
	public Trida(String nazev) throws NazevException {
		this.setNazev(nazev);
		students=new ArrayList<Student>();
	}

	public void addStudent(Student s) {
		students.add(s);
	}
	public double prumerTridy() {
		double sum=0;
		for(Student s: students)
		{
			sum +=s.getPrumer();
		}
		return sum/students.size();
	}
	public double minPrumer() {
		double minprum=999;
		for(Student s: students)
		{
			if(s.getPrumer()<minprum) {
				minprum=s.getPrumer();
			}
		}
		return minprum;
	}
	public double maxPrumer() {
		double maxprum=0;
		for(Student s: students)
		{
			if(s.getPrumer()>maxprum) {
				maxprum=s.getPrumer();
			}
		}
		return maxprum;
	}
	@Override
	public String toString() {
		return nazev+" --> "+ students;
	}
}
