
public class ConsDemo8 {
    //int a=5;
    //int b =10;
	ConsDemo8(int a, int b){
		System.out.println("ConsDemo8");
		a = a;
		b = b;
	}
	public static void main(String[] args) {
		
		//ConsDemo8 c1 = new ConsDemo8();
		ConsDemo8 c1 = new ConsDemo8(20,30);
		System.out.println(c1.a);
		System.out.println(c1.b);
		//ConsDemo8 c2 = new ConsDemo8(30, 40 );
		//System.out.println(c2.b);

	}

}
