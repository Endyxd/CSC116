public class Fruit{
    private int calories;
    private String name;
    
    public Fruit(int calories, String name){
        if(calories < 0){
            throw new IllegalArgumentException("Calories cannot be negative");
        }
        this.calories = calories;
        this.name = name;
        if(name == null || name.equals("")){
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }
    
    
    @Override
    public String toString(){
        return "This fruit is called " + name + " and has " + calories + " calories";
    }
    
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Fruit){
            Fruit f = (Fruit) o;
            return calories == f.calories
                && this.name.equals(f.name);
            
        }else{
            return false;
        }
    }

}