public class TestBridge {
    public static void main(String[] args) {
        Animal BigCat = new Cat(new BigAnimalFeeding());
        System.out.println("------------Alimentation du chat adulte----------");
        BigCat.Nourrir();
        System.out.println("\n");
        Animal SmallCat = new Cat(new SmallAnimalFeeding());
        System.out.println("------------Alimentation du petit chat----------");
        SmallCat.Nourrir();
        System.out.println("\n");
        System.out.println("------------Alimentation du  chien adulte----------");
        Animal BigDog = new Dog(new BigAnimalFeeding());
        BigDog.Nourrir();
        System.out.println("\n");
        System.out.println("------------Alimentation du petit chien----------");
        Animal SmallDog = new Dog(new SmallAnimalFeeding());
        SmallDog.Nourrir();
        
    }
}
