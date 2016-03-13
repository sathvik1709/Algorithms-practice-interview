package javaconcepts.AbstractExample;

/**
 * Created by Sathvik on 10/02/16.
 */
public class AbsSubClass extends AbsSuperClass {

    public AbsSubClass(int sum) {
        super(sum);
        System.out.println("AbsSubClass constructor");
    }

    @Override
    public void absSuperClassNonAbstractMethod() {
        //super.absSuperClassNonAbstractMethod();
        System.out.println("absSuperClassNonAbstractMethod:  subclass");
    }

    @Override
    public void absSuperClassMethod() {
        System.out.println("absSuperClassMethod overriden");
    }
}
