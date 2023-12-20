
public class fibo_recur {
 
	static int fibo(int x)
	{
		if(x==0 || x==1)
		{
			return 1;
		}
		return fibo(x-1)+fibo(x-2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(7));

	}

}
//1 1 2 3 5 8 13 21 34 55