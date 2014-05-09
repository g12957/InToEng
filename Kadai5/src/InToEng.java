
import java.util.Scanner;

	public class InToEng {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        
	        System.out.println(translateEng(input));
	        
	    }
	    
	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	int x,y,z;	    	
	    	
	    	if(n==0) return "zero";
	    	String[] num = {"","one","two","three","four","five","six",
	    			"seven","eight","nine","ten","eleven","twelve","thirteen",
	    			"fourteen","fifteen","eighteen","nineteen"
	    	};
	    	String[] num2 = {"", "", "twenty","thirty","forty","fifty","sixty",
	    			"seventy","eighty","ninety","hundred"};

	    	if(n>=1000 && n<10000) {
	    		x = n/1000;
	    		y = (n-1000*x)/100;
	    		z = (n-1000*x-100*y)/10;
	    		return num[x]+" thousand "+num[y]+" "+num2[10]+" "+num2[z]+" "+num[n-1000*x-100*y-10*z];
	    	}
	    	else if(n>=100 && n<1000) {
	    		x = n/100;
	    		y = (n-100*x)/10;
	    		return num[x]+" "+num2[10]+" "+num2[y]+" "+num[n-100*x-10*y];
	    	}	 
	    	else if(n>=20 && n<100) {
	    		x = n/10;
	    		y = n-10*x;
	    		return num2[x]+"  "+num[y];
	    	}	    	
   	
	    		return num[n];
	    }
	}
