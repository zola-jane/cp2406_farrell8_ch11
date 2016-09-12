/*
 * Created by Zola on 12/09/2016.
 */
public class UseBook
{
    public static void main(String[] args)
    {
        Fiction fic1 = new Fiction("Harry Potter");
        NonFiction nonfic1 = new NonFiction("Nana's Cottage");
        display(fic1);
        display(nonfic1);
    }

    public static void display(Book book)
    {
        System.out.println("Book title: " + book.getTitle());
        System.out.println("Price: $" + book.getPrice());
    }
}
