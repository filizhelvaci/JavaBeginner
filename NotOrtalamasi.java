import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int quiz,vize,fnl; 
		Scanner input=new Scanner(System.in);
		System.out.println("Lütfen Quiz notunu giriniz:");
		quiz=input.nextInt();
		System.out.println("Lütfen Vize notunu giriniz:");
		vize=input.nextInt();
		System.out.println("Lütfen final notunu giriniz:");
		fnl=input.nextInt();
		double ort=quiz*0.25 + vize*0.35 + fnl*0.4;
		System.out.println("not ortalamanız: " + ort);
        String sonuc= ( ort>=50) ? "Geçtiniz" :"Kaldınız";
        System.out.println(sonuc);
		    
			
		
		
         
	}

}
