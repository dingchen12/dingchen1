package Example;

public class Example {
	String str = new String("good");
	char[] ch = {'a','b','c'};
	public void change(String str,char ch[]) {
		str = str.toUpperCase();
		ch = new char[] {'m','n'};
	}
	public static void main(String args[]) {
		Example ex = new Example();
		ex.change(ex.str,ex.ch);
		System.out.println(ex.str);
		System.out.println(ex.ch);
	}
}
