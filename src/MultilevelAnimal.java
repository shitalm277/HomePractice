public class MultilevelAnimal {
    public void eat (){
    System.out.println("eating");
    }
    public static void main(String[]args){
    MultilevelAnimal multilevelanimal = new MultilevelAnimal();
    multilevelanimal.eat();
    }
}
//MultilevelAnimal is GRANDPARENT
//Multidog is PARENT
//MultiBabyDog is GRANDCHILD