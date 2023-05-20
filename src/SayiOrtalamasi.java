import java.util.Scanner;
public class SayiOrtalamasi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int sayi , toplam =0, adet =0;

        System.out.print("Sayı giriniz :");
        sayi = input.nextInt();

        for (int i= 0; i <= sayi; i++){
            if (i % 3==0 && i % 4 ==0){
                toplam+=i;
                adet++;

            }
        }

        if (adet > 0){
            double ortalama =(double) toplam / adet;
            System.out.print("Ortalama: "+ ortalama);
        }else {
            System.out.println("Girilen aralıkta 3 ve 4 e bölünenen sayı bulunamadı");
        }

            }

    }
