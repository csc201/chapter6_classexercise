public class Method {
	public static int greet() {
		System.out.println("Hi Class!");
		return 0;
	}

	public static int main(String [] args) {
		System.out.print(args[0]);
		System.out.print(args[1]);
		System.out.print(args[2]);
		System.out.print(args[3]);
		greet(args,args[4]);
		System.out.println(greet());
		return 0;
	}
	
	public static void greet(String [] args, String greeting) {
		System.out.println(greeting + " " + args[0]);
		System.out.println(greeting + " "  + args[1]);
		System.out.println(greeting + " " + args[2]);
		System.out.println(greeting + " " + args[3]);
	}
}
