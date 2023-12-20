
public class oprtrlr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a= 10;
        int b=5;
        int toplam= a+b;
        int carpma=a*b;
        int cikarma= a-b;
        int bolme= a/b;
        
        System.out.println("Toplam:" + toplam);
        System.out.println("Çıkarma:" + cikarma);
        System.out.println("Çarpım:" + carpma);
        System.out.println("Bölme:" + bolme);
        System.out.println("Mod" + a%b);
        toplam++;
        System.out.println(toplam);
        int sonuc= ++a + ++b;
        System.out.println("sonuc="+ sonuc + " a: "+ a + " b= "+b);
	}


}
