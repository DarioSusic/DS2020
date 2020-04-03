package lab.two.dijkstra;

//import lab.two.stack.array.*;
import lab.two.stack.linkedlist.*;;

@SuppressWarnings("rawtypes")
public class Dijkstra extends Stack {
	public void evaluate(String stackOfStrings) {
		Stack<String> operands = new Stack<String>();
		Stack<Double> values = new Stack<Double>();
		String[] var;

		if (stackOfStrings.contains(" ")) {
			var = stackOfStrings.split(" ".toString());
		} else {
			var = stackOfStrings.trim().split("".toString());
		}

		for (String s : var) {
			if (s.equals("("))
				;
			else if (s.equals("+"))
				operands.push(s);
			else if (s.equals("-"))
				operands.push(s);
			else if (s.equals("*"))
				operands.push(s);
			else if (s.equals("/"))
				operands.push(s);
			else if (s.equals("sqrt"))
				operands.push(s);
			else if (s.equals(")")) {
				String o = operands.pop();
				double v = values.pop();
				if (o.equals("+"))
					v = values.pop() + v;
				else if (o.equals("-"))
					v = values.pop() - v;
				else if (o.equals("*"))
					v = values.pop() * v;
				else if (o.equals("/"))
					v = values.pop() / v;
				else if (o.equals("sqrt"))
					v = Math.sqrt(v);
				values.push(v);
			} else
				values.push(Double.valueOf(s));
		}
		System.out.println(values.pop());
	}
}
