// TODO: we need to add the missing classes!

// OK, I will add ‘Adder‘ and s35945 will add ‘Subtractor‘.

class Subtractor{
    public int subtract(int a, int b){
        return a-b;
    }
}

public class Main {
    static void main() {
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));

        Subtractor subtractor = new Subtractor();

        System.out.println(subtractor.subtract(6, 3));
    }
}
