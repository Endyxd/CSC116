/**
*  Example Book class
* @author Bita Akram
* @version 1.0
*/

public class Book {
    /**
    *  instance variable which holds title of the book
    */
    private String title;
    /**
    *  instance variable which holds author of the book
    */
    private String author;

    /**
    *  instance variable which holds availability status of the book
    */
    private boolean isAvailable;
    
    @Override
    public String toString(){
        return "This book is called: " + title + ", and the author is: " + author + ", and the availability is: " + isAvailable;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Book){
            Book b = (Book) o;
            if(b.title.equals(this.title) && (b.author.equals(this.author))){
                return true;
            }
        
        }else{
            return false;
        }
        return false;
    }
    
    

    /**
   * Constructor.  This initializes title and author variables
   * to a value provided by the user of the constructor.
   * It also set isAvailable to its default value ture.
   * @param initTitle the initial value to use for title
   * @param initAuthor the initial value to use for Author
   */ 
    public Book(String initTitle, String initAuthor) {
        this.title = initTitle;
        this.author = initAuthor;
        this.isAvailable = true;
    }
    
   /**
   * Retrieves the value of the title variable and returns it
   * to the caller of the method as a String.
   * @return the value of title as a String
   */
    public String getTitle() {
        return title;
    }
   /**
   * Retrieves the value of the author variable and returns it
   * to the caller of the method as a String.
   * @return the value of author as a String
   */

    public String getAuthor() {
        return author;
    }

    /**
   * Retrieves the value of the isAvailable variable and returns it
   * to the caller of the method as a Bboolean.
   * @return the value of isAvailable as a boolean
   */

    public boolean isAvailable() {
        return isAvailable;
    }


   /**
   * Sets the title instance variable to the given String
   * value.  
   * @param inputTitle the new value to use for title
   */ 
    public void setTitle(String inputTitle) {
        title = inputTitle;
    }

    /**
   * Sets the author instance variable to the given String
   * value.  
   * @param inputAuthor the new value to use for author
   */ 
    public void setAuthor(String inputAuthor) {
        author = inputAuthor;
    }

    /**
   * Set the value of the isAvailable to false 
   * when the book is checked out.
   */
    public void checkOut() {
        isAvailable = false;
    }

    /**
   * Set the value of the isAvailable to true 
   * when the book is checked in.
   */
    public void checkIn() {
        isAvailable = true;
    }
}