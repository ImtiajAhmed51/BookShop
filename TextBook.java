public class TextBook extends Book{
    private int standard;

    TextBook() {

    }
    TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }
    @Override
    public void setStandard(int standard) {
        this.standard = standard;
    }
    @Override
    public int getStandard() {
        return this.standard;
        }
    
        @Override
        void showDetails() {
            System.out.println(".....Text Book.....");
            System.out.println("Book Standard : " + this.getStandard());
            System.out.println("ISBN : " + this.getIsbn());
            System.out.println("Book Title : " + this.getBookTitle());
            System.out.println("Book Author : " + this.getAuthorName());
            System.out.println("Book Price : " + this.getPrice());
            System.out.println("Book Avaiable Quantity : " + this.getAvailableQuantity());
            System.out.println("\n");
            System.out.println("\n");
    
        }

}
