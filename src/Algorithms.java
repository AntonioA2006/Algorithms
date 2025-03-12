
public class Algorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithms obj = new Algorithms();
		
		double[] matriz = obj.arrayRandomVlues(10);
		
		for(double a : matriz ) {
			System.out.println(a);	
		}
	
	}
	
	
	
	
	public static double[] arrayRandomVlues(int N ) {
		N = (N   < 0) ? 50 : N;
		double[] a = new double[N];
		for (int i = 0; i < N; i++)
		 a[i] = Math.random();
		return a;
	}
	
	
	
	
	
	

}
