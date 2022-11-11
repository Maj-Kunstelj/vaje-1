import java.util.Scanner;

class Naloga3 {
    public static void main(String[] args) {
        int zmnozek = 1;
        double vsota = 0;

        for(int i = 0; i <= 9; i++) {
            System.out.print("Vnesite število: ");
            Scanner sa = new Scanner(System.in);
            int stevilo = sa.nextInt();
            zmnozek = zmnozek * stevilo;
            vsota = vsota + stevilo;
        }
        
        System.out.println("Zmnožek: " + zmnozek);
        System.out.println("Povprečje:" + (vsota / 10));

    }
}

import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Vpisite 1. stevilo: ");
        double a1 = scan.nextDouble();

        Scanner scan9 = new Scanner(System.in);
        System.out.print("Vpisite 2. stevilo: ");
        double a2 = scan9.nextDouble();

        Scanner scan8 = new Scanner(System.in);
        System.out.print("Vpisite 3. stevilo: ");
        double a3 = scan8.nextDouble();

        Scanner scan7 = new Scanner(System.in);
        System.out.print("Vpisite 4. stevilo: ");
        double a4 = scan7.nextDouble();

        Scanner scan6 = new Scanner(System.in);
        System.out.print("Vpisite 5. stevilo: ");
        double a5 = scan6.nextDouble();

        Scanner scan5 = new Scanner(System.in);
        System.out.print("Vpisite 6. stevilo: ");
        double a6 = scan5.nextDouble();
        
        Scanner scan4 = new Scanner(System.in);
        System.out.print("Vpisite 7. stevilo: ");
        double a7 = scan4.nextDouble();
        
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Vpisite 8. stevilo: ");
        double a8 = scan3.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Vpisite 9. stevilo: ");
        double a9 = scan2.nextDouble();

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Vpisite 10. stevilo: ");
        double a10 = scan1.nextDouble();

        double f = a1 * a2 * a3 * a4 * a5 * a6 * a7 * a8 * a9 * a10;
        double k = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
        double i = k / 10;

        System.out.println("--------------");
        System.out.println("Zmnozek stevil: " + f);
        System.out.println("Povprecje stevil: " + i);
    }
}
