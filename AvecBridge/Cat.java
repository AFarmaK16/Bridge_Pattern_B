import java.util.Scanner;
public class Cat extends Animal {
 


    public Cat(AnimalFeeding f){
        super(f);
        // this.Nbjours=nbj;
        // this.qte=q;
        // this.typeAli=typeA;
        // this.feed=af;
        
    }
    public void Nourrir(){
        Scanner sc =new Scanner(System.in);
        
        System.out.print("\tFrequence par jour:\t");
        int fr= sc.nextInt();
        System.out.print("\tQuantite en Kcal:\t");
        int q= sc.nextInt();
        System.out.print("\tType d'aliment:\t");
        String typeA= sc.next();
        System.out.print("\tPoids:\t");
        int poids= sc.nextInt();
        System.out.println("\tMesure alimentation");
        getFeed().feed(fr, q, typeA,poids);
        System.out.println("\tFin Alimentation");
        System.out.println("----------------------------");
    }

}
