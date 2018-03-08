import java.lang.*;
public class TestStringvsBuilder{
	public static void main(String...args){
		concatStrings();
		appendString();
	}

	public static void concatStrings(){
		String var1 = "0";
		for(int i= 0; i<10; i++){
		    var1 += i+1;
		}
		System.out.println(var1);

		String var2 = "ESVUX ";
		var2.trim().toLowerCase().replace("e","E");
		System.out.println(var2);

	}

	public static void appendString(){
		StringBuilder var1 = new StringBuilder("0");
		for(int i= 0; i<10; i++){
		    var1.append(i+1);
		}
		System.out.println(var1);
	}
}