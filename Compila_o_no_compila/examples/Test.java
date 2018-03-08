import java.lang.*;
public class Test{
	public static void main(String...args){
		firstQuestion();
		secondQuestion();
		thirdQuestion();
		fourthQuestion();
	}

	public static void firstQuestion(){
		short a = 2 + 3 * 2;
		short c = a + 12;
		if(c > 20){
			System.out.println(c);
		}
	}

	public static void secondQuestion(){
		String var1 = "Hello";
		String var2 = new String("Hello");
		String var3 = var1;
		System.out.println(var1 == var3);
		System.out.println(var1.equal(var2));
		System.out.println(var1 == var2);
	}

	public static void thirdQuestion(){
		boolean $$ = false;
		if($$=true){
			System.out.println("is true");
		}else if(!$$){
			System.out.println("is false");
		}
	}

	public static void fourthQuestion(){
		int a[ ], b = 0;
		int[ ] _$a, _$b[] = new int[3][ ];
		for(int i=0; i<_$b.length; i++){
			_$b[i] = new int[2];	
		}
		System.out.println(_$b.length + a.length);
	}
}