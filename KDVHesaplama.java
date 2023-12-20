import java.util.Scanner;

public class KDVHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double tutar,kdvlifiyat,kdv=0.18;
        Scanner input=new Scanner(System.in);
        System.out.println("kdv'si hesaplanacak ürünün maliyetini giriniz");
        tutar=input.nextDouble();
        kdvlifiyat=tutar+(tutar*kdv);
        System.out.println("kdv li tutar fiyatı :"+ kdvlifiyat);
	}
}
