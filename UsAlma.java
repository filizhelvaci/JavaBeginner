import java.util.Scanner;

public class UsAlma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("üssünü almak istediğiniz sayıyı giriniz?");
        int sayi=scan.nextInt();
        System.out.println("Girdiğiniz sayının kaç üssünü almak istiyorsunuz");
        int us=scan.nextInt();
        int syc=1;
        double snc=1;
        while(us>0)
        {
        
        	snc=snc*sayi;
        	System.out.println( syc+". değeri : "+snc);
        	us--;
        	syc++;
        }
        		
        		
	}

}
