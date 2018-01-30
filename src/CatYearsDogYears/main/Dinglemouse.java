package CatYearsDogYears.main;


public class Dinglemouse {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {

        int[] result = new int[2];

        int calculateCatYears = 0;
        int calculateDogYears = 0;

        int countCatYears = 0;

        int countDogYears = 0;

        while(calculateCatYears<catYears){
            if(catYears<15) break;
            if(countCatYears==1&&(catYears-15)<9) {
                break;
            }
            if((catYears-calculateCatYears)<4) break;

            countCatYears++;
            if(countCatYears==1) calculateCatYears+=15;
            if(countCatYears==2) calculateCatYears+=9;
            if(countCatYears>2) calculateCatYears+=4;
        }

        while(calculateDogYears<dogYears){
            if(dogYears<15) break;
            if(countDogYears==1&&(dogYears-15)<9) {
                break;
            }
            if((dogYears-calculateDogYears)<5) break;

            countDogYears++;
            if(countDogYears==1) calculateDogYears+=15;
            if(countDogYears==2) calculateDogYears+=9;
            if(countDogYears>2) calculateDogYears+=5;
        }


        result[0] = countCatYears;
        result[1] = countDogYears;

        return result;
    }

}
