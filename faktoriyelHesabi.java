import java.util.Scanner;

public class faktoriyelHesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Faktöriyelinin bulunmasını istediğiniz sayıyı girin:");
        int sayi=scan.nextInt();
        float fak=1;
        if(sayi>0) {
        	for(int i=1;i<=sayi;i++) {
        		fak=fak*i;
        		System.out.println("faktoriyel değeri şu an: "+fak);
        	}
        	System.out.println("faktoriyel değeri sonucu:"+fak);
        }else {System.out.println("Girilen değer faktöriyel için uygun değil");}
        		
	}

}
