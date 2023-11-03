import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Album newAlbum = new Album();
        Quote ryanQuote = new Quote (new Author("Ryan", "Hampton"), "This is Ryan's quote." );
        Quote jessQuote = new Quote(new Author("Jess", "Ruglier"), "This is Jess's quote.");
        Quote luisQuote = new Quote(new Author("Luis", "Peyliur"), "This is Luis's quote.");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(ryanQuote);
        quotes.add(jessQuote);
        quotes.add(luisQuote);

        for (Quote quote: quotes) {

            System.out.println(quote);
        }
    }
}
