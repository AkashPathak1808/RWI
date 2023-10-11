public class StringTask {

	public static void main(String[] args) {
		String a = "Railworld India";
		String lc = a.toLowerCase();
		String uc = a.toUpperCase();
		int len = a.length();
		char c = a.charAt(2);
		String ss = a.substring(1, 8);
		String con = a.concat(" pvt. lim");
		int ind = a.indexOf("I");
		char[] ch = a.toCharArray();
		System.out.println(lc+"\n"+uc+"\n"+len+"\n"+c+"\n"+ss+"\n"+con+"\n"+ind);
		for(char chr:ch) {
			System.out.print(chr);
		}

	}
}