package github;

public class LongestSubstingPalindrome {

	public static int palindromeCheck(String st) {

		char a[] = st.toCharArray();
		char[] b = new char[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[j] = a[i];
			j++;
		}
		String q = new String(b);
		if (st.compareTo(q) == 0) {
			return 1;
		} else
			return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "forgeeksskeegfor";
		String b = "";
		int l = 0;
		for (int i = 0; i < a.length(); i++) {
			
			for (int j = 1; j <= a.length() - i; j++) {
				
				String sub = a.substring(i, j + i);
				int  x = 0;
				if (sub.length() > l) {
					
					x = palindromeCheck(sub);
				}
				
				if (x == 1) {
					
					l = sub.length();
					b = sub;
					
				}
			}
		}
		
		System.out.println(b);

	}

}
