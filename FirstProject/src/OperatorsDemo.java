
public class OperatorsDemo {

	public static void main(String[] args) {
		// operators in java
		// 1. Arithmetic operators
		//       + - * / %
		// 2. assignment operator
		//       =
		// 3. relational operators
		//       > < >= <= == !=
		// 4. logical operators
		//       && (AND), || (OR), ! (NOT)
		// 5. bitwise operators
		//		&, |, <<(left shift), >>(right shitf) , >>>(unsigned right shift)
		// 6. arithmetic assignment operator
		//       +=, -=, *=, /=, %=
		//      int a = 20;
		//		a = a + 40; (or) a +=40;
		// 7. conditional operator
		// 		?:
		//		int a = 40;
		//		int b = 30;
		// 		int c = a>b?a:b; 
		// here c will hold the greater of the 2 numbers
		// 8. incremental/decremental operators
		//      ++ and --
		//		int a = 20;
		//		a = a + 1; (or) a++;
		// 	explore post incremental/decremental and pre incremental/decremental operator.
		
		byte a = 5;
		int b = a>>2;
		System.out.println("b:" + b);
		// _0 _0 _0 _0     _0 _1 _0 _1
		// _0 _0 _0 _0     _0 _0 _1 _0
		// _0 _0 _0 _0     _0 _0 _0 _1
		
	}

}
