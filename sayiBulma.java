import java.util.Scanner;

public class sayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi;
		Scanner scan=new Scanner(System.in);
		while(true){
		 	System.out.println("Lütfen sayıyı giriniz");
		 	sayi=scan.nextInt();
		 	if (sayi==0) {
		 		break;
		 	}
		} System.out.println("Döngüden çıktınız. Hadi hayırlı olsun");
		
		for(int i=0;i<=10;i++) {
			if(i==4 || i==6 ) {
				System.out.println("bu sayıyı atlıyorm" +i);
				continue;}
			System.out.println("sayi:" + i);
		}
	}

}
