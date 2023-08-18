package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankOperations {
    static double balance = 0;
    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        balance -= amount;
    }

    double processOperation(String message){
        String[] deposit = {"invest","deposit","transfer","put"};
        String[] withdraw = {"withdraw","put"};
        if(Arrays.stream(deposit).anyMatch(message::contains)){
             deposit(Integer.parseInt(message.replaceAll("[^0-9]", "")));
             return balance;
        }
        if(Arrays.stream(withdraw).anyMatch(message::contains)){
            withdraw(Integer.parseInt(message.replaceAll("[^0-9]", "")));
            return balance;
        }
        return balance;
    }
}

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        List<String> inputs = new ArrayList<String>();
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0; i < n; i++){
            inputs.add(bf.readLine());
        }
        BankOperations opt = new BankOperations();
        inputs.forEach(line -> {
            pw.println((int)opt.processOperation(line));
        });
        pw.flush();
        pw.close();
    }


}
