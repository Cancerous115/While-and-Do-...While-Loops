class Main{
	public static void main(String[]args){
		int numbers=3;
		int multiplier= 1;

		//do while loops are set up in a different way compaired to While Loops.
		do{
			System.out.printf("%dx%d=%d\n",numbers,multiplier,numbers*multiplier);
			multiplier++;
		//while(multiplier<=10)/condition is last instead of right before/first  before our "System.out.printf.""Compare to our while loop below line 16."They both will print out the same answer. 
		}while(multiplier<=10);
		
		//Line 16 our condition is first then the body gets executed.
		//While loops only have on component/condition.
		//For Loops have multiple portions
		while (multiplier <=10) {
			System.out.printf("%dx%d=%d\n",numbers,multiplier,numbers*multiplier);

			multiplier++;
		}

		
	}
}