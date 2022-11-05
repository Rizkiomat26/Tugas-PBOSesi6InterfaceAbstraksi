import java.util.Scanner;
public class Main {
      static int lebar;
      static int panjang;
      static int volume;
      static int tinggi;
      private static Scanner v;
     
public static void main(String[] args){  
           
      v = new Scanner(System.in);
      System.out.println("Masukan Panjang Limas :");
      panjang=v.nextInt();
           
      System.out.println("Masukan Lebar Limas :");
      lebar=v.nextInt();
           
      System.out.println("Masukan Tinggi Limas :");
      tinggi=v.nextInt();
           
      // rumus Volume Limas = 1/3 x (1/2 x panjang x lebar) x tinggi
      volume = (((panjang*lebar)*1/2)*tinggi)*1/3;   
      System.out.println("\nHasil dari volume limas = " +volume);
           
}
}