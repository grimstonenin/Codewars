package InterlacedSpiralCipher.main;

public class InterlacedSpiralCipher {

    public String encode(String clearString) {

        StringBuilder result = new StringBuilder();

        String preparedString = prepareString(clearString);

        int length = determineCipherMatrix(preparedString.length());

        Character[][] cipher = new Character[length][length];

        int count = 1;

            //cipher logic

            //increment matrix edge
             for (int i = 0; i <= length - 2; i++) {

                //rotate corners
                for (int j = i; j < length - 1-i; j++) {

                    //top left

                    cipher[i][j] = preparedString.charAt(count-1);

                    //top right
                    if((count%(4*(length - 1-i))==0)||(count>preparedString.length()-1))break;
                    cipher[j][length - 1-i] = preparedString.charAt(count++);

                    //bottom right
                    if((count%(4*(length - 1-i))==0)||(count>preparedString.length()-1)) break;
                    cipher[length - 1-i][cipher[length - 1-i].length-1-j] = preparedString.charAt(count++);

                    //bottom left
                    if((count%(4*(length - 1-i))==0)||(count>preparedString.length()-1)) break;
                    cipher[length - 1 - j][i] = preparedString.charAt(count++);

                    count++;
                    if((count%(4*(length - 1-i))==0)) break;
                }

                if(length%2==1&&i==length-3) cipher[i][i] = preparedString.charAt(count-1);

            }



        for (int i = 0; i < cipher.length; i++) {
            for (int j = 0; j < cipher[i].length; j++) {
                if (cipher[i][j] == null) {
                    result.append('_');
                } else {
                    result.append(cipher[i][j]);
                }
            }
        }
        return result.toString().trim();
    }

    public String decode(String encoded){

        StringBuilder decodedString = new StringBuilder();

        int length = determineCipherMatrix(encoded.length());

        Character[][] cipher = new Character[length][length];

        //create and populate the cipher matrix

        int count = 0;

        for(int i = 0; i<length; i++){
            for(int j=0;j<length; j++){
                cipher[i][j] = encoded.charAt(count);
                count++;
            }
        }

        //decrypt logic



        for(int i = length-2; i>=0; i--){
            for(int j=0;j<length; j--){

                //bottom left

                //bottom right

                //top right

                //top left

            }
        }

        return decodedString.reverse().toString().trim();
    }

    public int determineCipherMatrix(int i) {
        int x = 1;

        while (Math.pow(x, 2) < i) {
            x++;
        }
        return x;
    }

    public String prepareString(String s){
        StringBuilder prepared = new StringBuilder(s);
        int length = determineCipherMatrix(s.length());

       while(prepared.length()<Math.pow(length,2)){
           prepared.append(" ");
       }
        return prepared.toString();
    }
}
