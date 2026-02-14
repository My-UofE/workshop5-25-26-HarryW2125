class Book{

    //attributes
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    //constructor with no quantity
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    //constructor with no defaults
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    //get and set methods
    public String getName(){
        return this.name;
    }

    public Author[] getAuthors(){
        return this.authors;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQty(){
        return this.qty;
    }

    //come back here
    public String getAuthorNames(){
        StringBuilder names = new StringBuilder();

        for (int i=0; i<this.authors.length; i++) {
            names.append(this.authors[i].getName());

            //if not last author
            if (i<this.authors.length -1) {
                names.append(",");
            }

        }
        return names.toString();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString(){
        return String.format("Book[name=%s,authors=%s,price=%.2f,quantity=%d]",this.name,this.getAuthorNames(),this.price,this.qty);
    }
}

