package ColouredTriangles.main;

import java.util.Arrays;
import java.util.List;

public class ColouredTriangles {

    private static final List<String> colours = Arrays.asList("R","G","B");

    public static char triangle(final String row) {

        if(row.length()==1) return row.charAt(0);

        StringBuilder sb = new StringBuilder(row);

        while (sb.length()>1){

            String replacement = null;

            StringBuilder newSb = new StringBuilder();

            for(int i = 0;i<sb.length()-1;i++){

            if(sb.charAt(i)==sb.charAt(i+1)){
                replacement = sb.substring(i,i+1);
            } else {
                replacement = findMissingColour(sb.substring(i,i+2));
            }

            newSb.append(replacement);
            }

            sb = newSb;


        }


        return sb.charAt(0);


    }

    public static String findMissingColour(String s){

        for(String c: colours){
            if(!s.contains(c)){
                return c;
            }
        }

        return "";
    }

}
