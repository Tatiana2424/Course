import java.util.Scanner;

public class Main {


    enum HTTP_Error {
        Bad_Request(400), Unauthorized(401), Payment_Required(402), Forbidden(403) ;

        private final int numb;

        HTTP_Error(int numb){
            this.numb=numb;
        }

    }
    public  int checkRange(float x) {
        if (x >= -5 && x <= 5) {
            // System.out.println("number belong to the range [-5;5]");
            return 1;
        } else {
            // System.out.println("number not belong to the range [-5;5]");
            return 0;
        }
    }
    public  int Max(int x,int y,int z){
        if (x > y && x > z){
            //System.out.println("max number: "+x);
            return x;}
        else if (y > x && y > z){
            //System.out.println("max number: "+y);
            return y;}
        else {
            //System.out.println("max number: "+z);

            return z;
        }
    }
    public  int Min(int x, int y, int z){
        if (x < y && x < z){
            //System.out.println("max number: "+x);
            return x;}
        else if (y < x && y < z){
            //System.out.println("max number: "+y);
            return y;}
        else {
            //System.out.println("max number: "+z);

            return z;
        }
    }


    public  void main(String[] args) {

        System.out.print("f1: ");
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        int u=checkRange(f1);
        if(u==1){
             System.out.println("number belong to the range [-5;5]");

        } else {
              System.out.println("number not belong to the range [-5;5]");


        }
       // System.out.println(u);
        System.out.print("f2: ");
        float f2 = sc.nextFloat();
        int u2=checkRange(f2);
        if(u2==1){
            System.out.println("number belong to the range [-5;5]");

        } else {
            System.out.println("number not belong to the range [-5;5]");


        }
        //System.out.println(u2);
        System.out.print("f3: ");
        float f3 = sc.nextFloat();
        int u3=checkRange(f3);
        if(u3==1){
            System.out.println("number belong to the range [-5;5]");

        } else {
            System.out.println("number not belong to the range [-5;5]");


        }
       // System.out.println(u3);
///////////////////////////////////
        System.out.printf("\n");
        System.out.print("i1: ");
        int i1 = sc.nextInt();
        System.out.print("i2: ");
        int i2 = sc.nextInt();
        System.out.print("i3: ");
        int i3 = sc.nextInt();
        int max=Max(i1,i2,i3);
        System.out.println("max number: "+max);
        int min=Min(i1,i2,i3);
        System.out.println("min number: "+min);
//////////////////////////////////
        System.out.printf("\n");
        System.out.print("n1: ");
        int n1 = sc.nextInt();

        HTTP_Error hp1;
        hp1=HTTP_Error.Bad_Request;


        HTTP_Error hp2;
        hp2=HTTP_Error.Forbidden;


        HTTP_Error hp3;
        hp3=HTTP_Error.Unauthorized;


        HTTP_Error hp4;
        hp4=HTTP_Error.Payment_Required;

        if(n1== hp1.numb)
            System.out.println(hp1.numb+"    "+HTTP_Error.Bad_Request);
        else  if(n1== hp2.numb)
            System.out.println(hp2.numb+"    "+HTTP_Error.Forbidden);
        else  if(n1== hp3.numb)
            System.out.println(hp3.numb+"    "+HTTP_Error.Unauthorized);
        else if(n1== hp4.numb)
            System.out.println(hp4.numb+"    "+HTTP_Error.Payment_Required);
    }
    }




