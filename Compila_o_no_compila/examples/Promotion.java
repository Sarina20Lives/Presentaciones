public class Promotion{
	public static void main(String ... args){
		firstRule();
		//secondRule();
		//thirdRule();
		//fourthRule();
		//exceptionRule();
	}

	public static void firstRule(){
		long var1 = 10;
		int var2 = 2;
		long var3 = var1 * var2; 
		int var4 = var1 * var2;
		System.out.println("first rule: var3 = " + var3);
		System.out.println("first rule: var4 = " + var4);
	}

	public static void secondRule(){
		float var1 = 10.5f;
		int var2 = 2;
		double var3 = var1 * var2; 
		float var4 = var1 * var2;
		System.out.println("second rule: var3 = " + var3);
		System.out.println("second rule: var4 = " + var4);
	}

	public static void thirdRule(){
		short var1 = 0;
		short var2 = 2;
		int var3 = var1 + var2;
		//short var4 = var1 + var2;
		System.out.println("third rule: var3 = " + var3);
		//System.out.println("third rule: var4 = " + var4);
	}

	public static void fourthRule(){
		short var1 = 20/4 + 5;
		char var2 = 'a';
		float var3 = var1 + var2 + 2.4f;
		double var4 = var1 + var2 + 2.4f;
		System.out.println("fourth rule: var3 = " + var3);
		System.out.println("fourth rule: var4 = " + var4);
	}

	public static void exceptionRule(){
		short var1 = 10;
		short var2 = var1++;
		int var3 = var1++;
		System.out.println("exception rule: var2 = " + var2);
		System.out.println("exception rule: var3 = " + var3);
	}

}