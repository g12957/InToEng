
import java.util.Scanner;

	public class InToEng {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        System.out.println(translateEng(input));
	        
	    }
	    
	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	String[] num = {"zero","one","two","three","four","five","six",
	    			"seven","eight","nine","ten","eleven","twelve","thirteen",
	    			"fourteen","fifteen","eighteen","nineteen"
	    	};
	    	String[] num2 = {"", "", "twenty","thirty","forty","fifty","sixty",
	    			"seventy","eighty","ninety","hundred"};
	    	
	    	if(n>=20 && n<100) {
	    		int x = n/10;
	    		String y = num[n-10*x];
	    		if(y.equals("zero")) return num2[x];
	    		return num2[x]+" "+num[n-10*x];
	    	}
	    		return num[n];
	    }
	}
