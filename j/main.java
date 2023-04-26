package j;

import java.util.Scanner;

class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Hotel h=new Hotel();

        boolean flag=true;
        while(flag) {
            System.out.println("PRESS 1 TO DISPLAY MENU \n PRESS 2 TO VIEW BILL \n PRESS 3 TO CANCLE ORDER \n PRESS 4 TO EXIT");
            int ch=sc.nextInt();
            switch(ch){
                case 1 :
                    System.out.println("Press 1 if u have acc \n Press 2 if ur new user");
                    int ch1=sc.nextInt();
                    if(ch1==1) {
                        h.existing();
                    }else {

                        h.newUser();
                    }
                    break;



            }

        }

    }

}
