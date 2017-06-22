// [04/01/13] Challenge #122 [Easy] Sum Them Digits

public class sumDigits {

	public static int sumThemDigits(int input) {
		if ((int)Math.floor(input / 10) == 0) {
			return input;
		} else {
			return input % 10 + sumThemDigits((int)(Math.floor(input / 10)));
		}
	}

	public static void main(String [] args){
		sumDigits hey = new sumDigits();
		System.out.println(hey.sumThemDigits(555));
	}
}