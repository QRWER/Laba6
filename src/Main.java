import functions.*;
import functions.basic.*;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        try {
            Exp exp = new Exp();
            System.out.println(Functions.integrate(exp, 0, 1, 0.0000001));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}