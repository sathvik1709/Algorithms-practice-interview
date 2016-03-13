package javaconcepts.Inheritence;

/**
 * Created by Sathvik on 29/02/16.
 */
public class InheritSubClass extends InheritSuperClass {



    @Override
    public void method2Protected() {
        super.method2Protected();
    }

    @Override
    public void method1Public() {
        super.method1Public();
    }

    @Override
    public void method3Private() {
        super.method3Private();
    }

}
