public class Operators {
        public static void main(String[]args){
            int a = 20;
            int b = 10;
            int c = 20;
            System.out.println("int a = 20");
            System.out.println("int b = 10");
            System.out.println("Addition = " + (a+b));//addition
            System.out.println("Substraction = " + (a-b));//substraction
            System.out.println("Multiplication = " + (a*b));//multiplication
            System.out.println("Division = " + (a/b));//Division
            System.out.println("Modulus = (the remainder is) " + (a%b));//modulus
            System.out.println("Increment by 1(but it will take here as 20 only as 'a' is 20 and'++'is coming after) = " + (a++));//increment
            System.out.println("Increment 20+1 = " + (a++));//increment
            System.out.println("Increment = " + (++a));//increment by 2 is confusion.logic not cleared
            System.out.println("Increment = (23+1) " + (++a));//increment by 1
            System.out.println("Decrement by 1(but it will take here as 10 only as 'b' is 10 and'--'is coming after) =" + (b--));//decrement
            System.out.println("Decrement (10-1) = " + (b--));//decrement by 1
            System.out.println("Decrement = " + (--b)); //Why decreased by value 2 not cleared
            System.out.println("Decrement (1-7) = " + (--b));//decreased by 1 value
            System.out.println("Is A is equal to B? if no, then False : " + (a == b));
            System.out.println("Is A is equal to C? if yes, then True : " + (a == c)); //IT IS COMING AS FALSE. WHY?
            System.out.println("Is A is not equal to B? if yes,then True : " + (a!=b));
            System.out.println("Is A is greater than B? if yes, then True : " + (a>b));
            System.out.println("Is A is less than B? if no, then False : " + (a<b));
            System.out.println("Is A is greater than or equal to B, then True : " + (a>=b));
            System.out.println("Is A is less than or equal to B, then False : " + (a<=b));
        }
    }
