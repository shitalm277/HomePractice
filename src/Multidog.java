public class Multidog extends MultilevelAnimal {
    public void bark(){
    System.out.println("barking");
    }
    public static void main(String[]args){
    Multidog multidog = new Multidog();
    multidog.eat();
    multidog.bark();
    }
}
//MultilevelAnimal is GRANDPARENT
//Multidog is PARENT
//MultiBabyDog is GRANDCHILD
