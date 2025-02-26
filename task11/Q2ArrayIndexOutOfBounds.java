package Task11;

public class Q2ArrayIndexOutOfBounds {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 3 };

		try 
		{
			int lastnumber = numbers[3];
			System.out.println("arrayindexoutofboundexception" + lastnumber);
		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handling array index out of bound exception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}