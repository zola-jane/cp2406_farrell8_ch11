/*
 * Created by Zola on 12/09/2016.
 */
public abstract class PhoneCall
{
    String phoneNumber;
    double callPrice;
    public PhoneCall(String number)
    {
        phoneNumber = number;
        callPrice = 0.0;
    }
    public void setCallPrice(double price)
    {
        callPrice = price;
    }
    public abstract String getPhoneNumber();
    public abstract double getCallPrice();
    public abstract void getCallInfo();

}
