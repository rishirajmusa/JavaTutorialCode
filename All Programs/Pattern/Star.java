import java.util.concurrent.TimeUnit;

public class Star {
Star() {
	System.out.print("Printing .");
	for(int i=0;i<5;i++) {
		try {
			TimeUnit.MILLISECONDS.sleep(400);
			System.out.print(".");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println();
	int[] width= {10,9,8,7,0,1,2,3,2,1,0,7,8,9,10};
	int i,j,row = 14, column = 21;
	for(i=0;i<=row;i++) {
		for(j=0;j<=column;j++) {
			if(j<width[i] || j>column-width[i]-1){
				System.out.print("   ");}
			else{
				System.out.print(" * ");}
				
		}System.out.println();
		System.out.println();
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
}
}
