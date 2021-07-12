package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    //Field impl Of DoStringStuff as an Anonymous Inner Class.
   public static DoStringStuff getBiggestString = new DoStringStuff() {
        @Override
        public String operate(String str1, String str2) {

//            if (str1.length() >= str2.length()){
//                return str1;
//            }else {
//                return str2;
//            }

            return str1.length() >= str2.length() ? str1 : str2;
        }
    };


    public static void main(String[] args) {

        //Calls implemented class StringOperator
        StringOperator concatStrings = new StringOperator();
        String ConcatenatedName = concatStrings.operate("Simon"," Elbrink");



        //Local Anonymous Inner Class
        // implements DoStringStuff Interface on the fly.
        DoStringStuff concat = new DoStringStuff() {
            // Method impl
            @Override
            public String operate(String str1, String str2) {
                return str1 + str2;
            }
        };

        System.out.println("concat.operate(\"Simon\",\" Elbrink\") = " + concat.operate("Simon"," Elbrink"));


        String biggestString = getBiggestString.operate("Simon", "Erik");
        System.out.println("biggestString = " + biggestString);


        //2 String, 1 what to do? (Behavior)
        String biggest = doStringStuff("ABC", "ABCD", getBiggestString);
        String concatname = doStringStuff("Karl", " Karlsson", concat);


        String reversed = doStringStuff("Ove", " Sundberg", new DoStringStuff() {

            public String operate(String str1, String str2) {

                StringBuilder sb = new StringBuilder();
                sb.append(str1 + " " + str2);
                sb.reverse();
                return sb.toString();
            }
        });


        System.out.println("biggest = " + biggest);
        System.out.println("concatname = " + concatname);
        System.out.println("reversed = " + reversed);


    }

    public static String doStringStuff (String s1, String s2, DoStringStuff operation){
        return operation.operate(s1,s2);
    }



}
