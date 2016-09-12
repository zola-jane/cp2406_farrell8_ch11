/*
 * Created by Zola on 12/09/2016.
 */
import javax.swing.*;
public class BookArray
{
    public static void main(String[] args)
    {
        Book[] bookList = new Book[10];
        int x;
        bookList[0] = new Fiction("Lord of the Rings");
        bookList[1] = new NonFiction("Astronomy 101");
        bookList[2] = new Fiction("The Life of Pi");
        bookList[3] = new Fiction("Jane Eyre");
        bookList[4] = new Fiction("Ten Thousand Leagues Under the Sea");
        bookList[5] = new Fiction("Moby Dick");
        bookList[6] = new NonFiction("Theory of Evolution");
        bookList[7] = new NonFiction("Mein Kampf");
        bookList[8] = new Fiction("Wee Free Men");
        bookList[9] = new Fiction("The Dark Half");

        for(x = 0; x < bookList.length; ++x)
            System.out.println("Book title: " + bookList[x].getTitle()
                    + "\nPrice: $" + bookList[x].getPrice());
    }
}
