package Test4;

public class MainApp1 {
    public static void main(String[] args) {


        PermanaentEmployee p1 = new PermanaentEmployee();
        p1.basicinfo(100,25000.00 );
        p1.getDesignation( "HR");

        ClientSideEmp c1 = new ClientSideEmp();
        c1.basicinfo(102,20000.00 );
        c1.getContactDetails(30);


    }
}
