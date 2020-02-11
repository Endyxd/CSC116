/**
 * Model of a Bakery that sells Cakes
 * @author Suzanne Balik, 19 Feb 2003
 */
public class Bakery {

  public static final int BIRTHDAY_CAKE = 1;
  public static final int SHEET_CAKE = 2;
  public static final int WEDDING_CAKE = 3;
  
  private Cake birthdayCake;
  private Cake sheetCake;
  private Cake weddingCake;
  
  public Bakery() {
  
    birthdayCake = new Cake("Birthday Cake", 10, 1);
    sheetCake = new Cake("Sheet Cake", 15, 2);
    weddingCake = new Cake("Wedding Cake", 50, 5);
    
  }
  
  public String buyCake(int type){
  
    switch (type) {
    
      case BIRTHDAY_CAKE: if (birthdayCake.bake())
                return birthdayCake.getReceipt();
	      else
	        return "Sold out";
	      
      case SHEET_CAKE: if (sheetCake.bake())
                return sheetCake.getReceipt();
	      else
	        return "Sold out";
	      
      case WEDDING_CAKE: if (weddingCake.bake())
                return weddingCake.getReceipt();
              else
	        return "Sold out";
	      
      default: System.out.println("Invalid type: " + type);
    }
    
    return "";
  }
  
  public static void main (String [] args) {

    Bakery bakery = new Bakery();
    
    //Buy a birthday cake
    System.out.println(bakery.buyCake(BIRTHDAY_CAKE));
    
    //Buy a sheet cake
    System.out.println(bakery.buyCake(SHEET_CAKE));
    
    //Buy a wedding cake
    System.out.println(bakery.buyCake(WEDDING_CAKE));

  }
}

/*PROGRAM OUTPUT:

csc% java Bakery
Birthday Cake  $10.00
Sheet Cake  $15.00
Wedding Cake  $50.00

*/  

  
      
  
     
    
    
