package se.lexicon;

@Deprecated
public class StringOperator implements DoStringStuff{

    //concat two strings.
    @Override
    public String operate(String str1, String str2) {
        return str1 + str2;
    }
}
