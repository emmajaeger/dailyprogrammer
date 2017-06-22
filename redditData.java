// [easy] challenge #1
// also don't know how to ask users for data yet so this is the best I've got

public class redditData {

	public static void redditPrint(String name, int age, String username) {
		System.out.println("Your name is " + name + ", you are " + age + " years old, and your username is " + username);
	}

	public static void main(String [] args) {
		String nam = "Emma";
		String user = "wasianbran";
		redditData.redditPrint(nam, 19, user);
	}
}