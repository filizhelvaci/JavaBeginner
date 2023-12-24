import java.util.Scanner;

public class yildizliKuleler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sayi;
		System.out.println("Yıldız kule için kaç katlı olmasını istediğniz sayıyı girin.");
		sayi=scan.nextInt();
		for(int i=0;i<=sayi;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		

	}

}
