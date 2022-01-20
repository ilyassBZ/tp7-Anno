package ma.education.tp6.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		
		//Class c = Calculatrice.class;
		Class c = CalculatriceMath.class;
		Programmer programmer = (Programmer)
		//c.getDeclaredAnnotation(Programmer.class);
		c.getAnnotation(Programmer.class);
		System.out.println(programmer.id()+" : "+programmer.name());

	}

}
