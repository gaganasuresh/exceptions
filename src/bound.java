public class bound {
    public static void main(String args[]){
        try{
            String a= " this is like chipping";
            char c= a.charAt(22);
            System.out.println(c);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(" string is out of bound exception");
        }
    }
}
