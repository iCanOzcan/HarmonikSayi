import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        double toplam=0;
        System.out.print("N sayısını giriniz:");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            toplam=toplam+(1.0/i);
        }
        System.out.println("Sayının harmonik serisi:"+toplam);
    }
}
