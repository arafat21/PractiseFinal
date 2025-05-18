package fractionalknap;
import java.util.*;
public class Knapsack {
	public static void FKP(ArrayList<ItemValue> items) {
		int capacity = 15;
		double totalVal = 0;
		for(ItemValue item : items) {
			int currWeight = item.weight;
			int currVal = item.profit;
			if(capacity - currWeight >= 0) {
				capacity = capacity - currWeight;
				totalVal += currVal;
			}
			else {
				double frac = ((double)capacity/(double)currWeight);
				totalVal += (frac * currVal);
				capacity -= (currWeight*frac);
				break;
			}
		}
		System.out.print("Total Profit: "+totalVal);
	}
}
