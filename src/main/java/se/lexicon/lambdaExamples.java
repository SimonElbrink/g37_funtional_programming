package se.lexicon;

public class lambdaExamples {
    public static void main(String[] args) {
        DoStringStuff concat2 = (str1, str2) -> str1 + str2;

        System.out.println(concat2.operate("Simon", " Elbrink"));


//        Printer printer = (s1) -> System.out.println(s1);
        Printer printer = stringToPrint -> System.out.println(stringToPrint);
        printer.print("Simon");

        Calculator calculator = (n1,n2,op) -> {
            switch (op){
                case "+": return n1 + n2;
                case "-": return n1 - n2;
                case "/": return n1 / n2;
                case "*": return n1 * n2;
                default: return 0;
            }
        };

        System.out.println(calculator.calculate(10,20,"+"));
        System.out.println(calculator.calculate(90,80,"-"));
        System.out.println(calculator.calculate(90,80,"*"));

        doStringStuff("Simon", " Elbrink", concat2 ,printer);


    }

    public static void doStringStuff (String s1, String s2, DoStringStuff operation, Printer printer){
        printer.print(operation.operate(s1,s2));
    }
}
