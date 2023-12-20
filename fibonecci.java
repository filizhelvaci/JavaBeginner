import java.util.Scanner;

public class fibonecci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1,1,2,3,5,8,13..
		Scanner scan=new Scanner(System.in);
		System.out.println("Kaça kadar fibonacci sayılarını bulalım");
		int sayi=scan.nextInt();
		int a=0,b=1,ttl;
        for (int i=1;i<=sayi;i++)
        {
        	ttl=a+b;
        	System.out.print(ttl+",");
        	a=b;
        	b=ttl;
        }
	}

}
