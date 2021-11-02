import java.util.Scanner;
public class Dog extends Animal {
 


    public Dog(AnimalFeeding f){
        super(f);
        
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
        System.out.println("\t Mesure Alimentation");
        getFeed().feed(fr, q, typeA,poids); 
        System.out.println("\tFin Alimentation");
        System.out.println("----------------------------");
    }

}
