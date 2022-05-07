package Java.slidingwindow;

public class BestTimetoBuySellStock {
    public int maxProfit(int[] prices) {
        int l=0,r=1,max=0;
        while(r<prices.length){
            int profit=prices[r]-prices[l];
            if(profit<=0){
                l=r;
            } else if(profit>max){
                max=profit;
            }
            r++;
        }
        return max;
    }
}
