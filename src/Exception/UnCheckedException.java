package Exception;

public class UnCheckedException {
    public static void main(String[] args) {
        int a[] = new int[5];

        try{
            System.out.println(a[7]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Arithmetic Exception: "+e.getMessage());
        }
    }
}
