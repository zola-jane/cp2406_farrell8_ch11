/*
 * Created by Zola on 12/09/2016.
 */
public class NonFiction extends Book
{
    public NonFiction(String bookName)
    {
        super(bookName);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 37.99;
    }
}
