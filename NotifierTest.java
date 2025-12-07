package pk.org.cas.InterfaceImplementation;

public class NotifierTest {
    public static void main(String[] args) {
        Notifier mail = new GmailNotifier();
        mail.send("my name is Ahmad. My father name is Salahuddin and i am the student of software engineering in iub and get eperience in Android and flutter development ");
        Notifier sms = new SmsNotifier();
        sms.send("This message received you from Allied bank! please don't send any one \n your code = 13467");
    }

}
