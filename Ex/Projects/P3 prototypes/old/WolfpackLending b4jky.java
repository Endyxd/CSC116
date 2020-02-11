import java.util.*;
/**
 * This program is for a user to request for a loan,
 * and for the program to process the information the user
 * input to determine if they are eligable for a loan.
 * This program also returns the specific interest rates.
 * @author Nicholas Loftin nlloftin@ncsu.edu
 * Version 1.4
 */
public class WolfpackLending {


    /** Number of months until payment*/
    public static final int NUMBER_OF_MONTHS_TO_PAYMENT = 60;

    /**frequency of each leap year*/
    public static final int LEAP_YEAR_FREQUENCY = 4;

    /**Current year of example programs creation */
    public static final int CURRENT_YEAR = 2020;

    /**What to subtract from if days exceed 31*/
    public static final int SUBTRACT_MONTH_31 = 30;

    /**What to subtract from if days exceed 28*/
    public static final int SUBTRACT_MONTH_FEB = 28;

    /**What to subtract from if days exceed 30*/
    public static final int SUBTRACT_MONTH_NOT31 = 30;

    /** When the month reaches this number it will know to return to 1*/
    public static final int MONTH_OVERFLOW = 13;

    /** days per week */
    public static final int DAYS_PER_WEEK = 7;

    /** leap year century */
    public static final int LEAP_YEAR_CENTURY = 400; // leap year century
    /** months per year */
    public static final int MONTHS_PER_YEAR = 12; //months per year
    /** days per month */
    public static final int DAYS_PER_MONTH = 31; //days per month

    /**
     *This program is to first determine if the loan and score inputs are valid
     * Then it decides weather or not the loan will be given if not it returns -1
     *@param loanAmount loan amount requested by user
     *@param creditScore credit score input of user
     *@param income income of user through input    
     *@return interest rate according to previous parameters
     */
    public static double getInterestRate(int loanAmount, int creditScore, int income) {
        if (loanAmount < 1000 || loanAmount > 10000) {
            throw new IllegalArgumentException("Invalid loan amount");
        }
        if (creditScore > 850 || creditScore < 300) {
            throw new IllegalArgumentException("Invalid credit score");
        }

        if (creditScore >= 720) {
            return 5.5;
        } else if (creditScore < 720 && creditScore > 500) {
            if (income >= 5 * loanAmount)
                return 6.0;
        } else if (creditScore >= 500 && creditScore > 350) {
            if (income >= 3 * loanAmount)
                return 6.5;
        } else if (creditScore >= 300 && creditScore < 500) {
            if (income >= 2 * loanAmount)
                return 7.5;

        }


        return -1;

    }

    /**
     *This method is to find the monthly payment and return
     *how much money the user needs to pay each month
     *@param loanAmount Amount of money requested by user
     *@param annualInterestRate The interest rate determined by getInterestRate
     *@param numberOfMonths is always sixty
     *@return Whatever the user needs to pay each month for their loan
     */
    public static double getMonthlyPayment(double loanAmount, double annualInterestRate,
        int numberOfMonths) {
        //System.out.println(annualInterestRate);
        
        double ir = annualInterestRate / 100;
        System.out.println(ir);
        if (ir < 0.05)
            throw new IllegalArgumentException("Invalid interest rate");
        if (loanAmount <= 0)
            throw new IllegalArgumentException("Invalid loan ammount");
        if (numberOfMonths <= 0)
            throw new IllegalArgumentException("Invalid number of months");
        double l = loanAmount;
        
        int months = numberOfMonths;
        double output;
        output = l * ((ir * Math.pow((1 + ir), months)) / (Math.pow((1 + ir), months) - 1));
        return output;
    }


    /**
     *This is to determine the day of the week the payment is due
     *@param applicationMonth input month by user
     *@param applicationDay input day by user
     *@param expressProcessing 
     *boolean depending on if the user 
     *requests for express processing payment
     *@return The day of the week for the payment
     */
    public static String getDisbursementDate(int applicationMonth, int applicationDay,
        boolean expressProcessing) {
        double x;
        double w;
        int y = CURRENT_YEAR;
        double z;
        int m = applicationMonth;
        int d = applicationDay;
        double dayOfWeek;
        boolean dateCheck = isValidDate(m, d);
        if (dateCheck == false) {
            throw new IllegalArgumentException("Invalid date");
        } else {
            if (expressProcessing == true) {
            d += 3;
            if (d > DAYS_PER_MONTH && (m == 1 || m == 3 || m == 5 || m == 7 ||
                    m == 8 || m == 10 || m == 12)) {
                m++;
                d = d - DAYS_PER_MONTH;
                if (m == MONTH_OVERFLOW) {
                    m = 1;
                    y++;
                }
            } else if (m != 2 && d > SUBTRACT_MONTH_31) {
                m++;
                d -= SUBTRACT_MONTH_31;
            }
            if (m == 2 && d > SUBTRACT_MONTH_FEB) {
                m++;
                d -= SUBTRACT_MONTH_FEB;
            }

        } else {
            d += 20;
            if (d > DAYS_PER_MONTH && (m == 1 || m == 3 || m == 5 || m == 7 ||
                    m == 8 || m == 10 || m == 12)) {
                m++;
                d = d - DAYS_PER_MONTH;
                if (m == MONTH_OVERFLOW) {
                    m = 1;
                    y++;
                }
            } else if (m != 2 && d > SUBTRACT_MONTH_31) {
                m++;
                d -= SUBTRACT_MONTH_31;

            }
            if (m == 2 && d > SUBTRACT_MONTH_FEB) {
                m++;
                d -= SUBTRACT_MONTH_FEB;
            }

        }
        
        w = y - (14 - m) / MONTHS_PER_YEAR;

        x = w + w / LEAP_YEAR_FREQUENCY - w / 100 + w / LEAP_YEAR_CENTURY;

        z = m + MONTHS_PER_YEAR * ((14 - m) / MONTHS_PER_YEAR) - 2;

        
        dayOfWeek = (d + x + (DAYS_PER_MONTH * z) / MONTHS_PER_YEAR) % DAYS_PER_WEEK;
        //System.out.println(dayOfWeek);
        dayOfWeek = (int)dayOfWeek;
        //System.out.println(dayOfWeek);
        
        if (dayOfWeek == 0)
            return ("Sun, "+ m + " " + d + " " + y);
        else if (dayOfWeek == 1)
            return ("Mon, "+ m + " " + d + " " + y);
        else if (dayOfWeek == 2)
            return ("Tue, "+ m + " " + d + " " + y);
        else if (dayOfWeek == 3)
            return ("Wed, "+ m + " " + d + " " + y);
        else if (dayOfWeek == 4)
            return ("Thu, "+ m + " " + d + " " + y);
        else if (dayOfWeek == 5)
            return ("Fri, " + m + " " + d + " " + y);
        else if (dayOfWeek == 6)
            return ("Sat, " + m + " " + d + " " + y);
        throw new IllegalArgumentException("Invalid date");
        //System.exit(1);
        //return "null";

    }
    }

    /**
     *This method is to determine weathor or not the input date is valid or not
     *@param month input month by user
     *@param day input day by user
     *@return True or False depending on if the input is correct
     */
    public static boolean isValidDate(int month, int day) {
        if ((month != 1) ||
            (month != 3) ||
            (month != 5) ||
            (month != 7) ||
            (month != 8) ||
            (month != 10) ||
            (month != 12)) {
            if (day > SUBTRACT_MONTH_31 || (day < 1))
                return false;
            if (month > 12 || month < 1)
                return false;
            if ((month == 2) && (day > 29))
                return false;
            else
                return true;
        } else if ((month <= 12 && month >= 1) && (day <= DAYS_PER_MONTH) && (day > 0))
            return true;
        else
            return false;

    }

    /**
     *Main method
     *
     *@param args N/A
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Wolfpack Lending!");
        System.out.println("Applications for loans from $1000 to $10000 will be accepted from");
        System.out.println("January 1 to December 31, 2020. All loans will be paid back over a");
        System.out.println("5 year period. When prompted, please enter today's date, your credit");
        System.out.println("score, your 2019 income, and the loan amount. Loans are normally paid");
        System.out.println("out 20 days after the application date, but for a fee of $25, which");
        System.out.println("will be added to the loan amount, you may request Express Processing");
        System.out.println("in which case the loan will be paid out 3 days after the application");
        System.out.println("date. If your loan is approved, the loan amount, interest rate,");
        System.out.println("disbursement date, and monthly payment amount will be output.");
        int month;
        int day;
        int year = CURRENT_YEAR;
        System.out.print("Month: ");
        month = in .nextInt();
        System.out.print("Day: ");
        day = in .nextInt();

        boolean dateCheck = isValidDate(month, day);
        if (dateCheck == false) {
            System.out.println("Invalid date");
            System.exit(1);
        }

        System.out.print("Credit Score: ");
        int cScore = in .nextInt();
        if (cScore > 850 || cScore < 300) {
            System.out.println("Invalid credit score");
            System.exit(1);
        }
        System.out.print("2019 Income: ");
        int income = in .nextInt();
        if(income <= 0){
            System.out.println("Invalid income");
            System.exit(1);
        }
        System.out.print("Loan Ammount: ");


        int loanAmount = in .nextInt();
        if (loanAmount < 1000 || loanAmount > 10000) {
            System.out.println("Invalid loan amount");
            System.exit(1);
        }

        System.out.print("Express processing (y, n): ");
        System.out.print(" ");
        String exInput = in .next();
        exInput = exInput.toLowerCase();
        boolean exPayment = false;
        if (exInput.charAt(0) == 'y') {
            exPayment = true;
        } else if (exInput.charAt(0) != 'n') {
            System.out.println("Invalid input");
            System.exit(1);



        }
        String dayOfWeek = getDisbursementDate(month, day, exPayment);
        double interestRate = getInterestRate(loanAmount, cScore, income);
        double payment = getMonthlyPayment(loanAmount, interestRate, NUMBER_OF_MONTHS_TO_PAYMENT);
        if (exPayment == true)
            loanAmount += 25;

        System.out.println("loan amount: $" + loanAmount);

        System.out.println("Interest Rate: " + interestRate + "%");
        
        
        System.out.print("Monthly Payment: $");
        System.out.printf("%.2f", (float)payment);
        System.out.println("");
        
        System.out.println("Disbursment Date: " + dayOfWeek);

        
        //System.out.println("Disbursment Date: " + dayOfWeek + ", " +
         //   month + " " + day + " " + year);




    }





}