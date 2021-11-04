public abstract class Animal {
    public AnimalFeeding feed;
   
    public Animal(AnimalFeeding f){
        this.feed=f;
       
    }
    abstract public void Nourrir();
    public AnimalFeeding getFeed(){
        return this.feed;
    }
}
