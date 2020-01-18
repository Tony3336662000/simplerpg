package homework;

public class homework20191007 {

	public static void main(String[] args) {
		// 第一題
		System.out.println("====作業練習01====");
		int sum=0;
		for(int i=2;i<=1000;i=i+2) {
			sum +=i;
		}
		System.out.println(sum);
		System.out.println();
		
		// 第二題
		System.out.println("====作業練習02====");
		int mul = 1;
		for(int i=1;i<=10;i++){
			mul *= i; //等同於mul = mul * i;
		}
		System.out.println(mul);
		System.out.println();
		
		// 第三題
		System.out.println("====作業練習03====");
		int first = 1;
		int number = 0;
		while(number<10) {
			number++;
			first *= number;
		}
			System.out.println(first);
			System.out.println();
					
		// 第四題
		System.out.println("====作業練習04====");	
		double xyz = 0;
		for(int i=1;i<=10;i++) {
			 	xyz = Math.pow(i,2);
			 	System.out.print(xyz+", ");
			 	
		}
		System.out.println();
		
		// 第五題
		System.out.println("====作業練習05====");	
		 int sum1 = 0, mul1 = 10; 
		 for (int i = 1; i <= 49 ; i++) {
		 if (i % mul1 == 4) { 
		 }
		 else if (i / mul1 == 4) { 
		 }                     
		 else {
		 System.out.print(i + " ");
		 sum1++; 
		 }
		 }
		 System.out.println();
		 System.out.println("共" + sum1 + "個號碼");
		 System.out.println();
		 
		// 第六題
		System.out.println("====作業練習06====");
		for(int i = 11; i >= 1; i--) {
			for(int j=1;j<i;j++) {
				 System.out.print(j + "");
			}
			 System.out.println();
		}
		
		// 第七題
		System.out.println("====作業練習07====");
		char A = 'A';
		for (int n1=1; n1<=6; n1++) {
			for(int n2=1; n2<=n1;n2++) {
				System.out.print(A);

			}
			A++;
			System.out.println();
		}
			

	}
}
