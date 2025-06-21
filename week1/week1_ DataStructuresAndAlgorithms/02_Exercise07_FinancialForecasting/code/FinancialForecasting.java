
class Test{
    public static void main(String[] args) {
        int years = 5; //Number of years
        double amount = 10000.0;  // principal amount
        double growthRate = 12.0; // Growth or Return rate(in %)

        double result = forecast(years,amount,growthRate);
        System.out.printf("The amount %.1f after %d years with %.1f%% growth rate is : %.2f ",amount,years,growthRate,result);
    }

    public static double forecast(int years, double amount , double growthRate){
        if(years==0) return amount;
        return forecast(years-1,amount,growthRate) * (1+ growthRate/100);
    }
}
// Time complexity for this recursive algorithm is O(n)

// To optimize the recursive solution to avoid excessive computation:
//     ->when input is large, iterate using for loop would be used to avoid excessive computation

    