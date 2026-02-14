import java.util.ArrayList;

class BookShopApp{
    public static void main(String[] args){

        //creates stocklist
        ArrayList<Book> stocklist = new ArrayList<Book>();

        //creates book1
        Author[] authors1 = {new Author("Robert Nisbet","",'u')};
        Book book1 = new Book("Data Mining Handbook", authors1,27.95,10);
        stocklist.add(book1);

        //creates book2
        Author[] authors2 = {new Author("Roger Hutty","",'u')};
        Book book2 = new Book("Mastering COBOL", authors2,4.95,10);
        stocklist.add(book2);

        //creates book3
        Author[] authors3 = {new Author("Paul Murrill","",'u')};
        Book book3 = new Book("Intro to COBOL", authors3,7.35,4);
        stocklist.add(book3);

        //creates book4
        Author[] authors4 = {new Author("Andy Oram","",'u')};
        Book book4 = new Book("Making Software", authors4,35.00,5);
        stocklist.add(book4);

        //creates book5
        Author[] authors5 = {new Author("James Nino","",'u'), new Author("Frederick Hosch","",'u')};
        Book book5 = new Book("OO Design Using Java", authors5,30.00,6);
        stocklist.add(book5);

         //creates book6
        Author[] authors6 = {new Author("David Barnes","",'u'), new Author("Micheal Kolling","",'u')};
        Book book6 = new Book("Objects First with Java", authors6,29.50,4);
        stocklist.add(book6);

        for (Book b : stocklist) {
            System.out.println(b);
            }

        for (Book b : stocklist) {
            String nameOutput = String.format("%-23s",b.getName());
            String authorOutput = String.format("%-28s",b.getAuthorNames());
            String priceOutput = String.format("%-6.2f",b.getPrice());
            String qtyOutput = String.format("%03d",b.getQty());
            System.out.println("| " + nameOutput + " | " + authorOutput + " | " + priceOutput + " | " + qtyOutput + " |");

        }

        String searchFor = "making software";
        System.out.println("Search for term(s) '" + searchFor + "' in title...");
        for (Book b : stocklist) {
            if (b.getName().toLowerCase().equals(searchFor)) {
                b.setQty(b.getQty()-1);
                break;
            }
        }

         for (Book b : stocklist) {
            String nameOutput = String.format("%-23s",b.getName());
            String authorOutput = String.format("%-28s",b.getAuthorNames());
            String priceOutput = String.format("%-6.2f",b.getPrice());
            String qtyOutput = String.format("%03d",b.getQty());
            System.out.println("| " + nameOutput + " | " + authorOutput + " | " + priceOutput + " | " + qtyOutput + " |");

        }

        String removeAll = "cobol";
        System.out.println("Removing all books with term '" + removeAll + "' in title...");
         for (Book b : stocklist) {
            if (b.getName().toLowerCase().contains(removeAll)== true) {
                stocklist.remove(b);
            }
        }

        for (Book b : stocklist) {
            String nameOutput = String.format("%-23s",b.getName());
            String authorOutput = String.format("%-28s",b.getAuthorNames());
            String priceOutput = String.format("%-6.2f",b.getPrice());
            String qtyOutput = String.format("%03d",b.getQty());
            System.out.println("| " + nameOutput + " | " + authorOutput + " | " + priceOutput + " | " + qtyOutput + " |");

        }

    }
}