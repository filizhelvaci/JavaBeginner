import java.util.Scanner;

public class etkinlikOner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Bugün hava sıcaklığı nedir?");
		double havadrm=scan.nextDouble();
		if (havadrm>=5 && havadrm<30) {
			System.out.println("Bugün sinemaya gidebilirsiniz");
		}else if (havadrm<5) {
			System.out.println("bugün kayağa gitmenizi öneririm");
		}else {
			System.out.println("bugün yüzmek için harika bir gün");
		}

	}

}
