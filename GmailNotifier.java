package pk.org.cas.InterfaceImplementation;

import java.util.Scanner;

public class GmailNotifier implements Notifier{

    private String Gmail;

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    @Override
    public void send(String message) {
        System.out.print("Enter Gmail on which you send a message: ");
        setGmail(new Scanner(System.in).nextLine());
        System.out.println(message);
    }
}
