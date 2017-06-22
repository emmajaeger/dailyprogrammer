// [2017-04-17] Challenge #311 [Easy] Jolly Jumper

public class jollyJumpers {

	public static void main(String[] args) {
		boolean[] differences = new boolean[args.length];

		for (int i = 0; i < args.length - 1; i++) {
			int difference = Math.abs(Integer.parseInt(args[i]) - Integer.parseInt(args[i + 1]));
			if (difference < args.length && differences[difference] == false) {
				differences[difference] = true;
			} else {
				System.out.println("NOT JOLLY");
		 		return;
			}
		}
		System.out.println("JOLLY");
	}
}