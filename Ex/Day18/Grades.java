public class Grades{
    public static void main(String[] args){
        Student[] Students = new Student[10];
        Students[0] = new Student();
        Students[0].setName("Bob");
        Students[0].setScore(90);
        Students[1] = new Student();
        Students[1].setName("Jim");
        Students[1].setScore(50);
        
        Students[2] = new Student();
        Students[2].setName("Sal");
        Students[2].setScore(95);
        
        Students[3] = new Student();
        Students[3].setName("Frank");
        Students[3].setScore(75);
        
        Students[4] = new Student();
        Students[4].setName("Donna");
        Students[4].setScore(88);
        
        Students[5] = new Student();
        Students[5].setName("Bag Of Cement");
        Students[5].setScore(100);
        
        Students[6] = new Student();
        Students[6].setName("BORT");
        Students[6].setScore(1);
        
        Students[7] = new Student();
        Students[7].setName("Actual Clown");
        Students[7].setScore(69);
        
        Students[8] = new Student();
        Students[8].setName("Freddy");
        Students[8].setScore(79);
        
        
        Students[9] = new Student();
        Students[9].setName("Archi");
        Students[9].setScore(94);
        
        double maxScore = -1;
        double minScore = 100000;
        int minPosition = -1;
        int maxPosition = -1;
        
        for(int i = 0; i < Students.length; i++){
            if(Students[i].getScore() > maxScore){
                maxScore = Students[i].getScore();
                maxPosition = i;
            }
            if(Students[i].getScore() < minScore){
                minScore = Students[i].getScore();
                minPosition = i;
            }
        }
        
        System.out.println("The student with the highest score was: " + Students[maxPosition].getName() + " with a score of: " + maxScore);
        System.out.println("The student with the lowest score was: " + Students[minPosition].getName() + " with a score of: " + minScore);
               
                
        
    }
}