import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create variables
        double mat,fizik,kimya,turkce,tarih,muzik;
        // Take user's input
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notu: ");
        mat = inp.nextDouble();
        System.out.println("Fizik Notu: ");
        fizik = inp.nextDouble();
        System.out.println("Kimya Notu: ");
        kimya = inp.nextDouble();
        System.out.println("Türkçe Notu: ");
        turkce = inp.nextDouble();
        System.out.println("Tarih Notu: ");
        tarih = inp.nextDouble();
        System.out.println("Müzik Notu: ");
        muzik = inp.nextDouble();

        // Create Output
        double toplam = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Not Ortalaması: " + toplam);

        boolean gectiMi = toplam >= 50;
        String sonuc = gectiMi ? "Başarılı" : "Başarısız";
        System.out.println(sonuc);
    }
}