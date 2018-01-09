package StringCalculatorKata.main;

public class StringCalculator {


    public int add(String s) throws Exception {
        if (s == null || s.length() == 0) {
            return 0;
        }

        //custom delimiter

        String delimiter = ",|\n";


            if (s.startsWith("//")) {

                delimiter = s.substring(2, 3) + "|\n";
                s = s.substring(4);
            }

            String[] arguments = s.split(delimiter);
            String errorMessage="";
            int result = 0;
            for (String argument : arguments) {
                if(Integer.parseInt(argument)<0){
                    errorMessage = errorMessage + argument + " ";
                    }
                result += Integer.parseInt(argument);
            }

            if(errorMessage.length()>0) throw new Exception(errorMessage);

            return result;

    }


}
