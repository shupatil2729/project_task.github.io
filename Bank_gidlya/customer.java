package Bank_gidlya;

public class customer {
    String name;
    String accno;
    double bankBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
    public customer(String name, String accno, double bankBalance) {
        this.name = name;
        this.accno = accno;
        this.bankBalance = bankBalance;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", accno=" + accno +
                ", bankBalance=" + bankBalance +
                '}';
    }
}
