package Arrays;
//time complexity is O(n);

public class Buysellstocks {

    public static int stocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;//+infinity
        int maxprofit =0;

        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){//profit case
                int profit = prices[i]-buyprice;// todays profit
                maxprofit = Math.max(maxprofit, profit); //previous max profit
            }else{
                buyprice=prices[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("max profit is :"+stocks(prices));

    }
}
