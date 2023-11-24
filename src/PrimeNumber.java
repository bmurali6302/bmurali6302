
public class PrimeNumber {
	public static void main(String args[]){
		
		int n=29;
		boolean flag=false;
		for(int i=2;i<=n;++i) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) 
			System.out.println(n+"Prime number");
		else 
			System.out.println(n+"not a prime number");
		
		
		
	}

}
