package JAVA101;
import java.util.Arrays;
public class arrays_ornek5 {
    public static void main(String[] args) {
        int dizi[]= {10, 20, 20, 10, 10, 20, 5, 20,8};
        System.out.print("Dizi:");
        
        for(int i=0;i<dizi.length;i++)
        {
            System.out.print(" "+dizi[i]);

        }
        Arrays.sort(dizi);

        int simdikiSayi=dizi[0];
        int adet=1;

        System.out.println();

        for(int i=1;i<dizi.length;i++)
        {
            if(simdikiSayi==dizi[i])
            {
                adet++;

            }
            else
            {
                System.out.println(simdikiSayi + " sayısı " + adet + " kez tekrar edilmiştir.");
                simdikiSayi = dizi[i];
                adet = 1;
            }
        }
        System.out.println(simdikiSayi + " sayısı " + adet + " kez tekrar edilmiştir.");
    }
}