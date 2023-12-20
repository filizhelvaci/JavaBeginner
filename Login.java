import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String k_adi,parola;
		System.out.print("Kullanıcı adınızı giriniz:");
		k_adi=scan.nextLine();
		System.out.print("Parolanızı giriniz:");
		parola=scan.nextLine();
		System.out.println(k_adi  +" "+ parola);
		
		if (k_adi.equals("flz")&& parola.equals("1111")) {
			 System.out.println("Hoşgeldiniz sevgili kullanıcı..");
		}else {
			System.out.println("Yanlış kullanıcı adı veya parola girdiniz.");
		}
		

	}

}
