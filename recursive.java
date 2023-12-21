
public class recursive {
	
	static int r(int x)
	{
		if(x==1)
		{
			return 1;
		}
		return x*r(x-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int s=r(8);
          System.out.println("sonuc: "+s);
	}

}
