package abstraction;

public class ledbulb {
    private boolean status=true;
    public void operateBulb(){
        if(status)
        {
            status = false;
            System.out.println("BULB IS OFF");
        }
        else
        {
            status=true;
            System.out.println("BULB IS ON");
        }
    }
}
