package BuildACar.main;

public class Car {

    public Body body;
    public Chassis chassis;

    public Car(int bodyLength, int numberOfDoors) throws Exception {

        if (bodyLength < 7) throw new Exception("Length is too small");
        if (numberOfDoors < 1) throw new Exception("Number of doors is too small");
        if (numberOfDoors > (bodyLength - 3) / 2) throw new Exception("Number of doors is too big");

        this.body = new Body(bodyLength, numberOfDoors);
        this.chassis = new Chassis(bodyLength);
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public class Body {
        public String component;
        public int length;

        public Body(int length, int numberOfDoors) throws Exception {

            this.length = length;
            component = buildFirstLayer(length - 2) + "\n" + buildSecondLayer(length - 1,numberOfDoors) + "\n";

        }

        private String buildFirstLayer(int length) {
            StringBuilder result = new StringBuilder();
            result.append(" ");

            for (int i = 1; i < length; i++) {
                result.append("_");
            }

            return result.toString();
        }

        private String buildSecondLayer(int length, int numberOfDoors) {
            StringBuilder result = new StringBuilder();
            String door = "[]";

            result.append("|");

            for (int i = 1; i < length - 1; i++) {
                result.append(" ");
            }

            result.append("\\");

            int leftIndex = 1;
            int rightIndex = result.length()-3;

            for(int i = 1;i<=numberOfDoors;i++){
                //right side
                if(i%2==1){
                    result.replace(rightIndex,rightIndex+2,door);
                    rightIndex-=2;
                } else {
                //left side
                    result.replace(leftIndex,leftIndex+2,door);
                    leftIndex+=2;
                }
            }


            return result.toString();
        }
    }

    public class Chassis {
        public String component;
        public int length;

        public Chassis(int length) {
            this.length = length;
            component = buildThirdLayer(length);
        }

        private String buildThirdLayer(int length) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < length-1; i++) {
                result.append("-");
            }

            result.append("'");

            if (length < 12) {

                result.replace(1, 2, "o");
                result.replace(result.length() - 3, result.length() - 2, "o");


            } else {

                int leftIndex = 1;
                int rightIndex = length-3;

                //determine number of wheels

                int numberOfWheels = 2 + ((length - 10) / 2);

                for (; numberOfWheels > 0; numberOfWheels--) {
                    //start of car
                    if (numberOfWheels % 2 == 1) {
                        result.replace(leftIndex,leftIndex+1,"o");
                        leftIndex+=2;
                    } else
                    //end of car
                         {
                        result.replace(rightIndex,rightIndex+1,"o");
                        rightIndex-=2;
                    }




                }


            }

            return result.toString();
        }


    }

}

