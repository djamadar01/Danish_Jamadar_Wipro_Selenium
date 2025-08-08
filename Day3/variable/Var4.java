package Day3assingment;

public class Var4 {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5.5; // 5.5% per annum
        double time = 2; // 2 years
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest for principal " + principal + 
                          " at rate " + rate + "% for " + time + 
                          " years is: " + simpleInterest);
    }
}
