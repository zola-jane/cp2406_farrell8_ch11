/*
 * Created by Zola on 12/09/2016.
 */
public abstract class Book
{
    String title = new String();
    double price;
    public Book(String bookName)
    {
        title = bookName;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}
