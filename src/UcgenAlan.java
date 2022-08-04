import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int a,b,c,cevre;

        double alan;
        Scanner inp=new Scanner(System.in);
        System.out.print("1.Kenar:");
        a=inp.nextInt();
        System.out.print("2.Kenar:");
        b=inp.nextInt();
        System.out.print("3.kenar:");
        c=inp.nextInt();

        int u=(a+b+c)/2;
        cevre=2*u;
        alan=Math.sqrt( u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Çevresi:"+"\s"+cevre+"\n"+"Üçgenin Alanı :"+"\s"+alan);






    }
}
