
public class Main {

    public static int l(int d1,int d2,int d3) {
        if (d1 > d2 && d1 > d3)
            return 1;

        else if (d2 > d1 && d2 > d3)
            return 2;

        else
            return 3;
    }


        public static Object f(String d1,String d2,String d3) {
            if (d1 == d2 || d3 == d2 || d1 == d3) {
                // System.out.println("Is dogs with the same name ");
                return "Is dogs with the same name";
            } else {
                //  System.out.println("Is not dogs with the same name ");
                return "Is not dogs with the same name";
            }

        }


        public static void main(String[] args) {
            Dogs dog1 = new Dogs("Archi", Breeds.COLLIE, 3);
            dog1.output();

            Dogs dog2 = new Dogs("Mia", Breeds.BORADOR, 2);
            dog2.output();

            Dogs dog3 = new Dogs("Mia", Breeds.POODLE, 6);
            dog3.output();

            Object s = f(dog1.getName(), dog2.getName(), dog3.getName());
            System.out.println(s);

            int l=l(dog1.getAge(),dog2.getAge(),dog3.getAge());
            if (l==1){
                System.out.println("Name:"+ dog1.getName() +"      " +"      "+"Breed: "+dog1.getBreed());
            }
            else if(l==2){
                System.out.println("Name:"+ dog2.getName() +"      " +"      "+"Breed: "+dog2.getBreed());
            }
            else if(l==3) {
                System.out.println("Name:"+ dog3.getName() +"      " +"      "+"Breed: "+dog3.getBreed());
            }

        }

    }
