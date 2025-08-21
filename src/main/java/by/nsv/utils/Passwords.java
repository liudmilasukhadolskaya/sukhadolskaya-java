package by.nsv.utils;

public class Passwords {
    public static String generatePsw(int numberOfSymbols) {
        String password = "";
        for (int i=1;i <= numberOfSymbols;
        i++){
            password += (int)Math.random() * 10;
        }
        return password;
    }
}
