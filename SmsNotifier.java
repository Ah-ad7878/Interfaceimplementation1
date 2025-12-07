package pk.org.cas.InterfaceImplementation;

import java.util.Scanner;

public class SmsNotifier implements Notifier{

    private long number;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public void send(String message) {
        System.out.print("Enter the no on which you send a message: ");
        setNumber(new Scanner(System.in).nextLong());
        System.out.println(message);
    }
}
