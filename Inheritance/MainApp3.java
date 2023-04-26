package Inheritance;

public class MainApp3 {
    public static void main(String[] args) {
        permanentEmployee P1=new permanentEmployee();
        P1.basicInfo(101,25000);
        P1.getDesiganation("HR");

        System.out.println("=====");
        ClientSideEmployee C1=new ClientSideEmployee();
        C1.basicInfo(102,30000);
        C1.getContractDetails(15);
        

    }
}
