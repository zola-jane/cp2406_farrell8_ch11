/*
 * Created by Zola on 12/09/2016.
 */
public class Fiction extends Book
{
    public Fiction(String bookName)
    {
        super(bookName);
        setPrice();
    }

    public void setPrice()
    {
        super.price = 24.99;
    }
}
