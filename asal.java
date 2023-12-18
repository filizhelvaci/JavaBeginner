import java.util.Scanner;

public class asal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("hangi sayıya kadar asal sayılar bulunsun?");
        int sayi=scan.nextInt();
        boolean bl;
        int asal=2;
        for (int i=3;i<=sayi;i++) {
        	bl=true;
        	for(int j=2;j<i;j++)
        	{ 
        		
        		if(i%j==0)
        		{
        			bl=false;
        		
        			break;
        		};
        	
        	}
        	if(bl) {
        	  System.out.println("asal sayi:"+i+" dir");
        	  }
        }

	}

}
