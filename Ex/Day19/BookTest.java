public class BookTest{
    public static void main(String[] args){
        Book b1 = new Book("Spencer's book",
            "Spencer Yoder");
        System.out.println("Expect: title=Spencer's book, " + "author=Spencer Yoder, available=true");
        System.out.println("Actual: title=" + b1.getTitle() + ", " + "author=" + b1.getAuthor() + ", available= " + b1.isAvailable());
        
        try{
            Book b2 = new Book(null, "Spencer Yoder");
            System.out.println("Test fails");
        }catch(IllegalArgumentException e){
            System.out.println("Test passes");
        }
        
        try{
            Book b3= new Book("Spencer's book", null);
            System.out.println("Test fails");
        }catch(IllegalArgumentException e){
            System.out.println("Test passes");
        }
        
        System.out.println("Expect: author = Spencer Yoder");
        System.out.println("Actual: author= " + b1.getAuthor());
        
        System.out.println("Before: " + b1.getAuthor());
        System.out.println("Expect: Shell Silverstein");
        b1.setAuthor("Shell Silverstein");
        System.out.println("After: " + b1.getAuthor());
        
        System.out.println("Expect: Spencer's book by Spencer Yoder true");
        System.out.println("Actual: " + b1.toString());
        
        b1.setAuthor("Spencer Yoder");
        Book b4 = new Book("Spencer's book", "Spencer Yoder");
        Book b5 = new Book("Shell's book", "Shell Silverstein");
        System.out.println("Expect: true false");
        System.out.println("Actual: " + b1.equals(b4) + " " + b1.equals(b5));
        
    }
}