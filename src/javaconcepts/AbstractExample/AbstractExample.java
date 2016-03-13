package javaconcepts.AbstractExample;

/**
 * Created by Sathvik on 10/02/16.
 */
public class AbstractExample {

    public static void main(String[] args){

        AbsSubClass absSubClass = new AbsSubClass(20);
        absSubClass.absSuperClassMethod();
        System.out.println(absSubClass.sum);
        absSubClass.absSuperClassNonAbstractMethod();


    }
}
