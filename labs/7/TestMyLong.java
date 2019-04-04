public class TestMyLong {

	public static void main(String[] args) {
		MyLong testerLong = new MyLong(25);
		long testerNum = 30;
		System.out.println("The long num is 30, MyLong is 25.");
		System.out.println("The value is " + testerLong.getValue());
		System.out.println("Is it even? " + testerLong.isEven());
		System.out.println("Is it odd? " + testerLong.isOdd());
		System.out.println("Is it prime? " + testerLong.isPrime());
		System.out.println("Is the long even? " + testerLong.isEven(testerNum));
		System.out.println("Is the long odd? " + testerLong.isOdd(testerNum));
		System.out.println("Is the long prime?" + testerLong.isPrime(testerNum));
		System.out.println("Is MyLong even? " + testerLong.isEven(testerLong));
		System.out.println("Is MyLong odd? " + testerLong.isOdd(testerLong));
		System.out.println("Is MyLong even? " + testerLong.isPrime(testerLong));
		System.out.println("Is the long equal? " + testerLong.equals(testerNum));
		System.out.println("Is MyLong equal? " + testerLong.equals(testerLong));
	}
}
