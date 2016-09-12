/*
 * Created by Zola on 12/09/2016.
 */
public class DemoPhoneCalls
{
    public static void main(String[] args)
    {
        IncomingPhoneCall incoming1 = new IncomingPhoneCall("0432206055");
        OutgoingPhoneCall outgoing1 = new OutgoingPhoneCall("0400236988", 10);
        incoming1.getCallInfo();
        outgoing1.getCallInfo();
    }
}
