import java.util.Scanner;

public class stringTersCevirme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("Ters çevrilmesini istediğinz ifadeyi girin");
     String cevir=scan.nextLine();
     String ters="";
      for (int i=cevir.length()-1;i>=0;i--)
      {
    	ters=ters+cevir.charAt(i);
    	
      }
      System.out.println(ters);
      if(cevir.equals(ters))
      {
    	  System.out.println("bu ifade polindromiktir.");
      }else
      {
    	  System.out.println("bu ifade polindromik değildir");
      }
     
	}

}
