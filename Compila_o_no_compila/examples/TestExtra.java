public class TestExtra{
	public static void main(String ... args){
		testReturnAssignment();
	}

	public static void testReturnAssignment(){
		boolean var1 = false;
		boolean var2 = (var1 = true);
		System.out.println(var1 + "," + var2);
	}
}