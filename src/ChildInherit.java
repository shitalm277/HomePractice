public class ChildInherit extends ParentInherit{
    public void multiplication(int x, int y){
        z= x*y;
        System.out.println("The product of the given numbers: " +z);
    }

    public static void main(String[]args){

        ChildInherit childinherit = new ChildInherit();
        childinherit.addition(50,78);
        childinherit.substraction(50,90);
       childinherit.multiplication(20,30);
       childinherit.addition(34,56);
    }
}
