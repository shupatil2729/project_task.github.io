package J2EE_task;

public class customer {
   private int phNO;
   private String name;
   private   String add;
   private int pincode;
   private String password;
   private   String cPassword;

    public customer(int phNO, String name, String add, int pincode, String password, String cPassword) {
        super();
        this.phNO = phNO;
        this.name = name;
        this.add = add;
        this.pincode = pincode;
        this.password = password;
        this.cPassword = cPassword;
    }

    public long getPhNO() {
        return phNO;
    }

    public void setPhNO(int phNO) {
        this.phNO = phNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }
}
