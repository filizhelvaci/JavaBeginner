import java.util.Scanner;

public class KonsoldanVeriAlma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =new Scanner(System.in);  
        int a,b;
        
        System.out.println("A sayısını giriniz:");
        a=input.nextInt();
        System.out.println("B sayısını giriniz");
        b=input.nextInt();
        System.out.println(a+b);
	}

}
