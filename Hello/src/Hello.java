
public class Hello {
	public static void main(String[] args) {
		if(args.length != 4){
			System.out.println("You have put in " + args.length + " arguments. This program requires at least 4 arguments.");
			System.exit(-6);
		}
		System.out.println("Hello world!");
		System.out.println("\"Hi,\" said " + args[0] + " and " + args[3] +  ".");
		
			
	}

}
