import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fiz,tur,kim,muz,i=0;
        double av=0,avarage;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz. : ");
        mat = input.nextInt();
        if(mat>=0 && mat<=100){
            av+=mat;
            i++;
        }
        System.out.println("Fizik notunuz. : ");
        fiz = input.nextInt();
        if(fiz>=0 && fiz<=100){
            av+=fiz;
            i++;
        }
        System.out.println("Türkçe notunuz. : ");
        tur = input.nextInt();
        if(tur>=0 && tur<=100){
            av+=tur;
            i++;
        }
        System.out.println("Kimya notunuz. : ");
        kim = input.nextInt();
        if(kim>=0 && kim<=100){
            av+=kim;
            i++;
        }
        System.out.println("Müzik notunuz. : ");
        muz = input.nextInt();
        if(muz>=0 && muz<=100){
            av+=muz;
            i++;
        }

        avarage = av/i;
        if (avarage <= 55){
        System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere");
        }
        else{
            System.out.println("Tebrikle,sınıfı geçtiniz");
        }
        System.out.println("Ortalamanız: "+ avarage);
    }
}