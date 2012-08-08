
public class fib {

	public fib () {}
	
	public int nthFib(int n){
		return n <2 ? 1 : nthFib(n-1) + nthFib(n-2);
	}
	
}
