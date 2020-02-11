public class Student{
    private String name;
    private double score;
    
    public Student(){
        score = -1;
        name = "";
    }
    
    public void setName(String inpName){
        this.name = inpName;
    }
    
    public void setScore(double inpScore){
        this.score = inpScore;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getScore(){
        return this.score;
    }
    
}