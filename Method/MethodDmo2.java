package Method;

import javax.security.auth.login.AccountException;

public class MethodDmo2 {
    //internal method
    public static void main(String[] args) {
        System.out.println("main method");
        createAccount();
        createProfile();

    }
    //External method
    static void createAccount( ){
        System.out.println("Account create ");


    }
    static void createProfile(){
        System.out.println("profile create");
    }
}
