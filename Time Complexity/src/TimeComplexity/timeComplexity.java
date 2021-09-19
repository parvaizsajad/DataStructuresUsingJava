package TimeComplexity;

public class timeComplexity {
	public int sum(int num) {
	
		return num*(num+1)/2;
//		int	Sum=0;
//		for (int i=0;i<=num;i++) {
//			Sum+=i;
//		}
//		return Sum;
//		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double date=System.currentTimeMillis();
		timeComplexity tmc=new timeComplexity();
		int res=tmc.sum(500000);
		System.out.println(res);
System.out.println(System.currentTimeMillis()-date);
	}

}
