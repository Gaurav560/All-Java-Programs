
public class Launch37ControlFlowInNestedTryCatchFinallyCase13 {

	//exception is raised at st 10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Statement1");
			System.out.println("Statement 2");
			System.out.println("Statement3");
			try 
			{
				System.out.println("Statement 4");
				System.out.println(11/0);
				System.out.println("Statement 6");
			} 
			
			catch (ArithmeticException e) 
			{
				System.out.println("Statement 7");
			}
			
			finally 
			
			{
				System.out.println("Statement 8");
			}
			System.out.println(12/0);
		} 
		
		catch (NullPointerException e) 
		{
			System.out.println(23/0);
		}
		finally
		{
			System.out.println("Statement 11");
		}
		System.out.println("Statement 12");


	}

}
