package task10;

public class Q3CircleClass {

	float radius;
	float result;

	// default constrctor
	public Q3CircleClass()
	{

	}
	
	
	// using the parametrisied constrctor
	public Q3CircleClass(float radius)
	{
		this.radius = radius;
	}

	public void circumferenceofCircle() 
	{
		result = 2 * (3.14f) * radius;
	}

	public static void main(String[] args) 
	{
		Q3CircleClass cc = new Q3CircleClass(6);
		cc.circumferenceofCircle();
		System.out.println("circumference of the Circle is " + cc.result);
	}

}
