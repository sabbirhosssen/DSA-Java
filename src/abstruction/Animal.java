package abstruction;
abstract class Man{
    abstract void eat();
}
class Cow extends Man{
    void eat(){
        System.out.println("Cow eat");
    }
}

public class Animal {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();

    }
}
