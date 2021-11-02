public abstract class Animal {
    public AnimalFeeding feed;
    // public int poids;
    // public int taille;
    // public Animal(AnimalFeeding f){
    //     this.feed = f;
    // }
    public Animal(AnimalFeeding f){
        this.feed=f;
        // this.poids=p;
    }
    abstract public void Nourrir();
    public AnimalFeeding getFeed(){
        return this.feed;
    }
}
