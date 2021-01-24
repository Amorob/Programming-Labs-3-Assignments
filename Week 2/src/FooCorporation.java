/*
Programming Labs 3 Assignment 2 - Foo Corporation
Name: Amoro
 */
public class FooCorporation {
    public static double calculatePay(double basePay, int hoursWorked){
       double minimumWage = 8.00;
       double regularPay;
       double overTimePay;
       double totalPay = 0;
       double overTimeRate = basePay * 1.5;
       if(basePay < minimumWage){
           System.out.println("Error - Base pay can not be less than" +
                   "minimum wage");
       }else if(hoursWorked > 60){
            System.out.println("Error - Hours worked can not be " +
                    "more than 60 hours");
        }else{
           if(hoursWorked <= 40){
               totalPay = basePay * hoursWorked;
               System.out.println("Total Pay is $" + totalPay);

           }else{
               int extraHours = hoursWorked - 40;
               regularPay = basePay * 40;
               overTimePay = overTimeRate * extraHours;
               totalPay = regularPay + overTimePay;
               System.out.println("Total Pay is $" + totalPay);
           }
       }
        return totalPay;

    }

    public static void main(String[] args) {
        calculatePay(3.50, 35);
        calculatePay(8.20, 47);
        calculatePay(10.00, 73);
    }
}
