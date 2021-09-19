package getSet;

public class getSet {


//	public int getId() {
//	return id;
//}
//
//public void setId(int id) {
//	this.id = id;
//}
//
//public String getName() {
//	return name;
//}
//
//public void setName(String name) {
//	this.name = name;
//}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		gs gs=new gs();
//		
//		gs.setName("parvaiz sajad");
//		System.out.println(gs.getName());
//		gs.setId(10);
//		System.out.println(gs.getId());
		int[] arr= {1,200,2,3,10,5,300,100};

		int peek= arr[0];
		int n=8;
		int i=0;
		int j=0;
	for(i=0;i<n;i++) {
		
			if(arr[i]>peek)  {
				peek=arr[i];
				
		
			}
			
		}
	
	for(j=0;j <n;j++) {
		if(arr[j]==peek) {
			break;
		}

	}
	j=j+1;
		System.out.println("the peek is:"+ peek +"\t the index is "+ j);
	}

}
