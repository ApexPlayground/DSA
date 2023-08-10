package Collections;

public class Implementation implements Contract{

    @Override
    public void term1(){
        System.out.println("implemented ");

    }

    @Override
    public void term2() {
        System.out.println("term 2 implemented ");
    }

    @Override
    public void newTerm() {
        System.out.println("inherited interface method ");
    }
}
