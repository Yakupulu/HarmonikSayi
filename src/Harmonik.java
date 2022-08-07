import  java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int a;
        double h,total=0;

        Scanner inp=new Scanner(System.in);
        System.out.print("Harmonik sayiyi giriniz:");
        a= inp.nextInt();

        for (int i=1;i<=a;i++){
            h=1.0/i;
            total+=h;
        }
        System.out.println("Harmonik sonuc: "+total);
    }
}
