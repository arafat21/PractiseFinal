package activity.selection.prac;

public class ASPMain {
	public static void sorting(String[] items,int[] start,int[] finish) {
		for(int i=0;i<finish.length;i++) {
			int keyF=finish[i];
			String keyI=items[i];
            int keyS=start[i];
            int j=i-1;
            while(j>=0 && finish[j]>keyF) {
            	finish[j+1]=finish[j];
            	start[j+1]=start[j];
                items[j+1]=items[j];
                j=j-1;
            }
            finish[j+1]=keyF;
            items[j+1]=keyI;
            start[j+1]=keyS;
		}
	}
	public static void activitySelection(String[] items,int[] start,int[] finish) {
		sorting(items,start,finish);
		System.out.print(items[0]+" ");
		int stop = finish[0];
		for(int i=1;i<finish.length;i++) {
			if(stop<=start[i]) {
				stop = finish[i];
				System.out.print(items[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items={ "A1" ,"A2","A3","A4","A5","A6"};
        int[] start={0,3,1,5,5,8};
        int[] finish={6,4,2,9,7,9};
        activitySelection(items,start,finish);
	}

}
