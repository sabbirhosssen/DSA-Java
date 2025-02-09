package Exception;

public class MainClass {
    public static void main(String[] args) {
          int a[]= new int[5];
//
//        System.out.println("Hello World");
//
//        try {
//            System.out.println(a[5]);
//        } catch (Exception e) {
//            System.out.println(" "+e.getMessage());
//        }finally {
//            System.out.println("I will always print finally");
//        }
//        System.out.println("last ");

       try {
           getNumberFromArray(a);
       }catch (Exception e){
           System.out.println("Catch the exception "+e.getMessage());
       }


    }
     static int getNumberFromArray (int a[])  throws ArithmeticException {
        return a[8];
    }
}
