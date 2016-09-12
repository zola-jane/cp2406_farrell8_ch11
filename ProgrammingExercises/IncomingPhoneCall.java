/**
 * Created by Zola on 12/09/2016.
 */
public class IncomingPhoneCall extends PhoneCall
{
    public final double RATE = 0.02;
    public IncomingPhoneCall(String number)
    {
        super(number);
        callPrice = RATE;
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
        System.out.println("Incoming call from " + getPhoneNumber() +
            " call rate is $" + RATE + " total price for call is $" +  getCallPrice());
    }
}
