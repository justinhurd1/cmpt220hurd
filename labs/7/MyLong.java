public class MyLong{
	private long value;
	
	MyLong(long value){
		this.value = value;
	}
	long getValue() {
		return value;
	}
	boolean isEven() {
		return value % 2 == 0;
	}
	boolean isOdd() {
		return value % 2 != 0;
	}
	boolean isPrime() {
		for (int k=2; k<value; k++)
			if(value % k == 0)
				return false;
		return true;
	}
	
	static boolean isEven(long value) {
		return value % 2 == 0;
	}
	static boolean isOdd(long value) {
		return value % 2 != 0;
	}
	static boolean isPrime(long value) {
		for (int k=2; k<value; k++)
			if(value % k == 0)
				return false;
		return true;
	}
	
	static boolean isEven(MyLong value) {
		return value.isEven();
	}
	static boolean isOdd(MyLong value) {
		return value.isOdd();
	}
	static boolean isPrime(MyLong value) {
		return value.isPrime();
	}
	
	boolean equals(long value) {
		return this.value == value;
	}
	boolean equals(MyLong value) {
		return this.value == getValue();
	}
	long parseLong(char[] value) {
        int sum = 0;
        for (char i : value) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

	long parseLong(String value) {
        return this.parseLong(value);
    }

}