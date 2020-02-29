public class Main{
	public static int sum(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return sum(n-2) + sum(n-1);
	}
    public static void main(String args[]) {
	int n = 10;
	System.out.print("Fibonacci Series of "+n+" numbers: ");
	for(int i = 0; i < n; i++){
			System.out.print(sum(i) +" ");
		}
	}
}