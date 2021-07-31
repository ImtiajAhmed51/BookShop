public class Start{
  public static void main(String[] args) {
    BookShop a= new BookShop();
    a.setName("Imtiaj Ahmed");

    Book b1 = new StoryBook();
    b1.setIsbn("101-001");
    b1.setBookTitle("The 4-Hour Work Week");
    b1.setAuthorName("Tim Ferriss");
    b1.setPrice(200.00);
    b1.setAvailableQuantity(15);
    b1.addQuantity(-3);
    b1.sellQuantity(60);
    b1.setCategory("1st");
    a.insertBook(b1);

    Book b2 = new StoryBook();
    b2.setIsbn("101-002");
    b2.setBookTitle("The Little Prince");
    b2.setAuthorName("Antoine de Saint-Exupéry");
    b2.setPrice(450);
    b2.setAvailableQuantity(20);
    b2.addQuantity(15);
    b2.sellQuantity(5);
    b2.setCategory("2nd");
    a.insertBook(b2);

    Book b3 = new StoryBook();
    b3.setIsbn("101-003");
    b3.setBookTitle("Dream of the Red Chamber");
    b3.setAuthorName("Cao Xueqin");
    b3.setPrice(625.0);
    b3.setAvailableQuantity(11);
    b3.addQuantity(19);
    b3.sellQuantity(10);
    b3.setCategory("3rd");
    a.insertBook(b3);

    a.insertBook(new StoryBook("101-004","The Hobbit","J. R. R. Tolkien",130.00,90,"4th"));
    a.insertBook(new StoryBook("101-005","Harry Potter and the Philosopher's Stone","J. K. Rowling",450.00,50,"5th"));

    Book t1 = new TextBook();
    t1.setIsbn("101-006");
    t1.setBookTitle("THE MIRACLE MORNING CAN CHANGE EVERYTHING");
    t1.setAuthorName("Hal Elrod");
    t1.setPrice(700.0);
    t1.setAvailableQuantity(120);
    t1.addQuantity(27);
    t1.sellQuantity(8);
    t1.setStandard(1);
    a.insertBook(t1);

    TextBook t2 = new TextBook();
    t2.setIsbn("101-007");
    t2.setBookTitle("The Magic of Thinking Big");
    t2.setAuthorName("David Schwartz");
    t2.setPrice(750.0);
    t2.setAvailableQuantity(66);
    t2.addQuantity(34);
    t2.sellQuantity(40);
    t2.setStandard(2);
    a.insertBook(t2);

    a.insertBook(new TextBook("101-008","Man’s Search for Meaning", "Viktor Frankel", 800.00, 15, 3));
    a.insertBook(new TextBook("101-009","The One Minute Manager", "Kenneth Blanchard", 430.00, 36, 4));
    a.insertBook(new TextBook("101-010","The Lean Start-Up", "Eric Ries", 770.00, 22, 5));
  
    a.removeBook(b1);
    a.removeBook(b1);
    a.removeBook(new TextBook("101-009","The One Minute Manager", "Kenneth Blanchard", 430.00, 36, 4));
    a.removeBook(new TextBook("101-009","The One Minute Manager", "Kenneth Blanchard", 430.00, 36, 4));

    a.searchBook("101-004");
    a.searchBook("101-010");
    a.searchBook("101-011");


    a.showAllBooks();
   
    
}
}