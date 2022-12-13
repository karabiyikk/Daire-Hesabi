import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
        int r;
        double alan, cevre, a, pi = 3.14, dilimAlan, dilimCevre;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapı : ");
        r = input.nextInt();
        System.out.print("Daire diliminin açısını girin : ");
        a = input.nextInt();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        dilimAlan = (pi * r * r * a) / 360;
        dilimCevre = 2 * r + (pi * r * r )/360;
        System.out.println("Yarıçapı girilen dairenin çevresi " + cevre + "ve alanı " + alan);
        System.out.println("Açısı girilen daire diliminin alanı " + dilimAlan);
        System.out.println("Açısı girilen daire diliminin çevresi " + dilimCevre);
    }
}
