
public class palidrom {
	
	static boolean isPalidrom(int x)
	{
		int sayi=x;
		int kalan,terssayi=0;
		while(sayi>0)
		{
			kalan=sayi%10;
			terssayi=(terssayi*10)+kalan;
			sayi=sayi/10;
		}
		if(x==terssayi)
		{
			return true;
		}
		else 
		{	
		 return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       boolean snc=isPalidrom(12345); 
       System.out.println("sayı palidrommu?"+snc);
	}

}
