public class ParentInherit {
    int z;
    public void addition (int x, int y){
        z = x+y;
        System.out.println("The sum of given numbers : " +z);
    }
    public void substraction(int x, int y){
        z = x-y;
        System.out.println("The differnce between the given numbers :" +z);
    }

    public static void main(String[] args) {
        ChildInherit childInherit = new ChildInherit();
        childInherit.multiplication(3,5);
        childInherit.addition(4,5);
    }

}