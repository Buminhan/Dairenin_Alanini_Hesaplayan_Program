import java.util.Scanner;
public class Cember {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double r,a;
        System.out.println("Lütfen dairenin yarı çapını giriniz.");
        r = inp.nextDouble();
        System.out.println("Dairenin çevresi :"+2*3.14*r);
        System.out.println("Dairenin alanı :"+3.14*r*r);
        System.out.println("Lütfen daire diliminin açısını giriniz.");
        a = inp.nextDouble();
        System.out.println("Daire diliminin alanı: "+(3.14*r*r*a)/360);
    }
}
