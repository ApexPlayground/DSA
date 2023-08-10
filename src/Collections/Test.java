package Collections;

public class Test {
    public static void main(String[] args) {
        Contract test = new Implementation();
        printContracts(test);

        Contract test2 = new Implementation();
        printContracts(test2);
    }

    public static void printContracts(Contract test1){
    test1.term1();
    test1.term2();
    test1.newTerm();
    }

}
