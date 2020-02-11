public class test{
    
    public static String help;
    public static void main(String[] args){
    WolfpackLending help = new WolfpackLending();
    System.out.println(help.getDisbursementDate(6,28, false));
    System.out.println(help.getDisbursementDate(8,30, true));
    System.out.println(help.getDisbursementDate(10,28, true));
    System.out.println(help.getDisbursementDate(9,15, false));
}
}