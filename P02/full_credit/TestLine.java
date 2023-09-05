public class TestLine
{
	public static void main(String[] args)
	{
		Line l1 = new Line(9.696, 8.593, 9.769, 3.956, Color.PURPLE);
		Line l2 = new Line(5.756, 0.324, 4.006, 8.976, Color.ORANGE);
		Line l3 = new Line(5.245, 7.543, 7.456, 3.235, Color.INDIGO);
		Line l4 = new Line(2.345, 6.432, 9.674, 1.567, Color.MAROON);
		
		System.out.println(l1.toString() + " has length "+ l1.length());
		System.out.println(l2.toString() + " has length "+ l2.length());
		System.out.println(l3.toString() + " has length "+ l3.length());
		System.out.println(l4.toString() + " has length "+ l4.length());
	}
}
