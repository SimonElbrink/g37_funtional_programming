package se.lexicon;

/**
 * This Interface is an Functional Interface
 * and can do pretty much what ever is possible with two Strings.
 * You have to decide for yourself what.
 * Only the imagination can set the boundaries.
 * ... and maybe some java rules as well.
 */
@FunctionalInterface
public interface DoStringStuff {


    //Creating one abstract method, Can't have more to be functional.
    String operate(String str1, String str2);

    //Cant have two abstract methods in an functional Interface.
    //void foo();

    //It's okay to have static methods like this. if you wish.
    static void print(String s1, String s2, DoStringStuff doStringStuff){
        Printer printer = (s -> System.out.println(s));

        printer.print(doStringStuff.operate(s1,s2));
    }


}
