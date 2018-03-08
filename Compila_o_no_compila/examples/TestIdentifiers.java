public class TestIdentifiers{
	public static void main(String ... args){
		int _ = 0;
		System.out.println(_);

		validDeclations();
		invalidDeclarations();
	}

	public static void validDeclations(){
		int a[ ], b = 0;

		int[ ] _$a, _$b[] = new int[3][ ];

		String var1=""; int var2=9;
	}

	public static void invalidDeclarations(){
		int a[ ], int b = 0;

		int [ ] _$a, _$b = new int[3][];

		String var1="", int var2=9;
	}



}