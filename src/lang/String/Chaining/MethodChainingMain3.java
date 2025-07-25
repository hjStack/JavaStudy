package lang.String.Chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {

        ValueAdder valueAdder = new ValueAdder();

        ValueAdder adder1=valueAdder.add(1);
        ValueAdder adder2=valueAdder.add(2);
        ValueAdder adder3=valueAdder.add(3);

        int result= valueAdder.getValue();
        System.out.println("Result = " + result);


    }
}
