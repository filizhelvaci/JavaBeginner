import java.util.Scanner;

public class buyukOlaniBul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner grs=new Scanner(System.in);
		System.out.println("Lütfen birinci sayıyı giriniz:");
		a=grs.nextInt();
		System.out.println("ikinci sayıyı giriniz:");
		b=grs.nextInt();
		System.out.println("üçüncü sayıyı giriniz:");
		c=grs.nextInt();
		
		if (a>b) {
			if (a>c) {System.out.println("En büyük sayı a dır:" +a);
			}else if (a==c) {System.out.println("en büyük sayı 2 tanedir:a= "+a+" ve c="+c );}
		}else if(b>a) {
			if (b>c) {System.out.println("En büyük sayı b dir:"+b);
			}else if(b==c) {System.out.println("En büyük sayı 2 tanedir b ="+b+" ve c="+c);}
		}else if(c>a && c>b) {System.out.println("En büyük sayı c dir."+c);}
		else System.out.println("bütün sayılar birbirlerine eşittir.");			
	
	}
	}
			


