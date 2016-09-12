/*
 * Created by Zola on 12/09/2016.
 */
public class OutgoingPhoneCall extends PhoneCall
{
    public final double RATE = 0.04;
    private int callTime;
    public OutgoingPhoneCall(String number, int mins)
    {
        super(number);
        callTime = mins;
        callPrice = callTime * RATE;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public double getCallPrice()
    {
        return callPrice;
    }
    public void getCallInfo()
    {
        System.out.println("Outgoing phone call from " + getPhoneNumber() + " at "
                + RATE + " per minute for " + callTime + " minutes has a total of $"
                + getCallPrice());
    }
}
