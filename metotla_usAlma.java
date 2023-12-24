
public class metotla_usAlma {

	static int us(int a,int b)
	{
		int result=1;
		for (int i=0;i<b;i++)
		{
			result*=a;
			
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int r=us(3,3);
      System.out.println("sonuç:"+r);
	}

}
