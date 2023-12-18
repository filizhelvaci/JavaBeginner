import java.util.Scanner;

public class ciftSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
		
		for(int i=1;i<100;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		*/
		int sayi,toplam;
		toplam=1;
		Scanner scan=new Scanner(System.in);
		/*
		do {
		System.out.println("Lütfen bir sayı giriniz");
        sayi=scan.nextInt();
            if(sayi%2!=0) {
            	toplam=toplam+sayi;
            	System.out.println("Toplam sayi:"+ toplam);
            	           } 
		}while(sayi>0);
		System.out.println("Döngüden çıktınız.Girdiğiniz tek sayıların toplamı:"+toplam);*/
		
		System.out.println("Lütfen bir sayı giriniz");
		sayi=scan.nextInt();
		for(int i=0;i<sayi;i++)
		{
			toplam=toplam*2;
			System.out.println("2 nin "+(i+1)+" kuvveti = "+ toplam);
			
		}
		
		
	}

}
