
public class Factorial {

	public static int changeFactorial(int sNo)
	{
		int sResult = 1;
		int x = sNo;
		for (int i = 1; i <= x ; i++)
		{
			sResult = sResult * sNo;
			sNo = sNo-1;
		}
		System.out.println(sResult);
		return sResult;
	}
	
	public static void main(String[] args) {
		funFactorial(4);
	}
}
