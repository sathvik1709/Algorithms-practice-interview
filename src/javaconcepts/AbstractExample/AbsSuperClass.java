package javaconcepts.AbstractExample;

/**
 * Created by Sathvik on 10/02/16.
 */
abstract public class AbsSuperClass {

    int sum;

    public AbsSuperClass(int sum) {
        this.sum = sum;
        System.out.println("AbsSuperClass constructor");
    }

    abstract public void absSuperClassMethod();

    public void absSuperClassNonAbstractMethod(){
        System.out.println("absSuperClassNonAbstractMethod:  sum:" + sum);
    }

}
