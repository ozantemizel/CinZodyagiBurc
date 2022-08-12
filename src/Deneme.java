import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        /*
            Çin Zodyağı nedir?

            4000 bin yıldır kullanılan bir astroloji çeşididir.
            Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
            Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır
            ve yıldızlarla pek bir ilgisi yoktur.

            Çin Zodyağı nasıl hesaplanır?
            Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
         */
        int kalan;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz seneyi yazınız.");
        int year = input.nextInt();
        kalan = year%12;
        System.out.println(kalan);
        String burc=" ";
        switch (kalan){
            case 0:
                burc="Maymun";
                break;
            case 1:
                burc="Horoz";
                break;
            case 2:
                burc="Köpek";
                break;
            case 3:
                burc="Domuz";
                break;
            case 4:
                burc="Fare";
                break;
            case 5:
                burc="Öküz";
                break;
            case 6:
                burc="Kaplan";
                break;
            case 7:
                burc="Tavşan";
                break;
            case 8:
                burc="Ejderha";
                break;
            case 9:
                burc="Yılan";
                break;
            case 10:
                burc="At";
                break;
            case 11:
                burc="Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz: "+burc);
    }
}
