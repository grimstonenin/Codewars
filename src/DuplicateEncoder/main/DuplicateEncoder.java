package DuplicateEncoder.main;

import java.util.HashMap;
import java.util.Map;


public class DuplicateEncoder {

    public static String encode(String s){
        if(s==null||s.length()==0) return "";

        String checkMe = s.toLowerCase();

        Map<String,String> translator = new HashMap<>();

        StringBuilder result = new StringBuilder();


        for(int i =0; i<checkMe.length();i++){

           if(translator.containsKey(checkMe.substring(i,i+1))){
               translator.put(checkMe.substring(i,i+1),")");
           } else {
               translator.put(checkMe.substring(i,i+1),"(");
           }

        }

        for(int i = 0;i<checkMe.length();i++){
            result.append(translator.get(checkMe.substring(i,i+1)));
        }


        return result.toString();
    }

}
