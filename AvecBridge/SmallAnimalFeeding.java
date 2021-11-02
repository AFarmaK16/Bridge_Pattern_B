public class SmallAnimalFeeding implements AnimalFeeding {
    public void feed(int NbJours,int quantite,String TypeAliment,int poids){
        System.out.println("\t\tNourrir un petit "+NbJours+" fois par jour avec  "+quantite+" kcal de "+TypeAliment);
    
        if(poids<=2 && quantite<=80){
                System.out.println("\t\tEquilibre alimentation: faible");             
        }
        else if(poids>=3 && quantite>=100){
            System.out.println("\t\tL'alimentation de votre animal est bien equilibre");             

        }
        else{
            System.out.println("\t\tEquilibre alimentation: moyen");
        }

    }
}
