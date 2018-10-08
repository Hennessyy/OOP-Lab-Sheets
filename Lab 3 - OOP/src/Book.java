public class Book {

    private String title;
    private String ISBN;
    private int numPages;
    private double price;



    //mutator methods

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //accessor methods

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumPages() {
        return numPages;
    }

    public double getPrice() {
        return price;
    }

    //toString method

    public String toString(){return "Book Title: "+title+"\nISBN: "+ISBN+"\nNumber of Pages: "+numPages+
    "\nPrice: "+price;}


    //no arguement constructor

    public Book(){

        this.title="None specified";
        this.price=0.0f;
        this.ISBN="None specified";
        this.numPages=0;

    }


    //4 arguement constructor

    public Book(String title,String ISBN,int numPages,double price){

        setTitle(title);
        setISBN(ISBN);
        setNumPages(numPages);
        setPrice(price);

    }



}
