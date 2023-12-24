import java.util.Scanner;

public class ucakBileti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yas,mesafe,gdsskl;
		double fiyat;	
		Scanner scan=new Scanner(System.in);
		System.out.println("Gitmek istediğiniz mesafe km ni giriniz:");
		mesafe=scan.nextInt();
		System.out.println("Biletinizi gidiş dönüş mü almak istesiniz? (Evet ise->1 / Hayır ise->2)");
		gdsskl=scan.nextInt();
		System.out.println("Yaşınızı giriniz: ");
		yas=scan.nextInt();
		fiyat=mesafe*0.10;
		if (gdsskl==1) {
			fiyat=fiyat*2;
			System.out.println("İlk döngüden ilk satır"+fiyat);
			fiyat-=fiyat*0.2;
			System.out.println("İlk döngüden girer"+fiyat);
			if (yas<=12) {
				fiyat-=fiyat*0.5;
				System.out.println("birinci koşul çalıştı");}
			else if(yas>=12 && yas<=24){
				fiyat-=fiyat*0.1;
				System.out.println("ikinci koşul çalıştı");}
			else if(yas>=65) {
				fiyat-=fiyat*0.3;
				System.out.println("üçüncü koşul çalıştı");}
			else fiyat=fiyat+0;
		}else if(gdsskl==2) {
		 	if (yas<=12) {
				fiyat-=fiyat*0.5;
				System.out.println("birinci koşul çalıştı");}
			else if(yas>=12 && yas<=24){
				fiyat-=fiyat*0.1;
				System.out.println("ikinci koşul çalıştı");}
			else if(yas>=65) { 
				fiyat-=fiyat*0.3;
				System.out.println("2.üçüncü koşul çalıştı");}
			else fiyat=fiyat+0;
		}else System.out.println("Yanlış bir tercih yaptınız.");
		
		
		System.out.println("Bilet ücretiniz: " +fiyat +"$ dır.Devam etmek istiyor musunuz?");

	}

}
