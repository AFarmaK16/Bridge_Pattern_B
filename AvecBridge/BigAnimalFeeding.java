public class BigAnimalFeeding implements AnimalFeeding {

    public void feed(int NbJours,int quantite,String TypeAliment,int poids){
        System.out.println("\t\tVotre animal se nourrit "+NbJours+" fois par jour avec  "+quantite+" kcal de "+TypeAliment);

        if(poids<=4 && quantite<=200){
                System.out.println("\t\tEquilibre alimentation: faible");             
        }
        else if(poids>=5 && quantite>=250){
            System.out.println("\t\tL'alimentation de votre animal est bien equilibre");             

        }
        else{
            System.out.println("\t\tEquilibre alimentation: moyen");
        }

    }
}