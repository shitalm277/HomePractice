public class MultiBabyDog extends Multidog{
    public void weep(){
    System.out.println("weeping");
    }
    public static void main(String[]args){
    MultiBabyDog multibabydog = new MultiBabyDog();
    multibabydog.eat();
    multibabydog.bark();
    multibabydog.weep();
    }
}
//MultilevelAnimal is GRANDPARENT
//Multidog is PARENT
//MultiBabyDog is GRANDCHILD
