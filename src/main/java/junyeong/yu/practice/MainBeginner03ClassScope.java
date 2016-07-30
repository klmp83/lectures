package junyeong.yu.practice;

public class MainBeginner03ClassScope {
	public static void main(String[] args) throws Exception {
		// This is static main method : static --call--> static
		System.out.println(JustClass.staticVariable);
		JustClass.staticMethod();
		
		// static can not call instance something
		
		// instance can call both instance/static. but generally, instance call only instance.
		JustClass justClass = new JustClass();
		System.out.println(justClass.instanceVariable);
		justClass.instanceMethod();
		System.out.println(justClass.staticVariable);// possible, but not recommendation
		justClass.staticMethod();// possible, but not recommended.
		
		
		
	}
	
	private static class JustClass {
		public static String staticVariable = "Static Value";
		public String instanceVariable = "Instance Value" ;
		
		public static void staticMethod() {
			System.out.println("call staticMethod()");
		}
		public void instanceMethod() {
			System.out.println("call instanceMethod()");			
		}
	}
	
	private static class JustClassChild extends JustClass {
		//@Override
		public static void staticMethod() {
			System.out.println("doSome()");
		}
		@Override
		public void instanceMethod() {
			System.out.println("doSome()");
		}
	}
}
