package homework.two.dijkstra;

public class Main {

	public static void main(String[] args) {
		String input = "( ( ( 2 + 3 ) * ( 4 - 5 ) ) / 2 )";
		Dijkstra calc = new Dijkstra();
		
		calc.evaluate(input);
	}

}
