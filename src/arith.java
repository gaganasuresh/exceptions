public class arith {
    public static void main(String args[]){
        int num;
        try {
            num = 4/0;
            System.out.println("Rest of the code to be tried in block");
        }
        catch (ArithmeticException e){
            System.out.println(" Artihmetic expression  "+e.getMessage());

        }
    }

}
