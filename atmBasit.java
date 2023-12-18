import java.util.Scanner;

public class atmBasit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ad_soyad="filizh";
		String sifre="123456";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("adsoyad giriniz:");
		String kisi=scan.nextLine();
		System.out.println("lütfen parolayı giriniz");
		String parola=scan.nextLine();
		Boolean onay=false;
		int bakiye=5000;
		int miktar=0;
		
		if(kisi.equals(ad_soyad) && parola.equals(sifre))
		  { 
			onay=true; 
		  }else
		  {
			  System.out.println("Ad soyad veya parola geçersiz");
		  }
		
		while(onay)
		{
			System.out.println("Yapmak istediğiniz işlemi seçiniz");
			System.out.println("---------------------------------------------");
			System.out.println("(1) Para Çekme ");
			System.out.println("(2) Para Yatırma ");
			System.out.println("(3) Para Transferi");
			System.out.println("(4) Bakiye Sorgulama");
			System.out.println("(5) Çıkış");
			
			int input=scan.nextInt();
			
			if(input==1)
			{
				System.out.println("Çekmek istediğiniz miktarı giriniz:");
				miktar=scan.nextInt();
				
				if(miktar>bakiye)
				{
					System.out.println("Yeterli bakiye mevcut değil");
				}else 
				{
					bakiye-=miktar;
					System.out.println("Hesabınızdan "+miktar+"tl para çektiniz. Kalan bakiyeniz: "+bakiye+" dir");
				}
				
			}else if (input==2)
			{
				System.out.println("Yatırmak istediğiniz para miktarını giriniz:");
				miktar=scan.nextInt();
				if(miktar<0)
				{
					System.out.println("Geçersiz işlem");
				}else 
				{
					bakiye+=miktar;
				}
			}else if(input==3)
			{
				
				System.out.println("Göndermek istediğiniz miktarı giriniz:");
				miktar=scan.nextInt();
				
				if(miktar<1 || bakiye<miktar)
				{
				 System.out.println("Geçersiz bir işlem yaptınız.");
				}else {
				 bakiye-=miktar;
				 System.out.println("Hesabınızdan "+ miktar +" para hesaba göderilmiştir.Hesabınızda kalan miktar: "+bakiye ); 
				}
			}else if(input==4)
			{
				System.out.println("Hesabınızda kalan miktar: "+ bakiye);
				
			}else {
				System.out.println("Çıkış yapıyorsunuz. İyi günler dileriz");
			    break;
			}
			
			
		}
		{
			
		}

	}

}
