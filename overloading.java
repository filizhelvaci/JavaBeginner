
public class overloading {

	static int add(int a,int b)
	{
		return(a+b);
	}
	static int add(int a,int b,int c)
	{
		return(a+b+c);
	}
	
	static double add(int a,int b,double c)
	{
		return(a+b+c);
	}
	static double add(int a,double b,int c)
	{
		return(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int s1=add(1,2);
        System.out.println("s1:"+s1);
        int s2=add(4,5,6);
        System.out.println("s2:"+s2);
        double s3=add(1,2,2.5);
        System.out.println("s3:"+s3);
        double s4=add(5,8.5,5);
        System.out.println("s4:"+s4);
	}

}
