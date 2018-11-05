/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		System.out.println(centered("abys", "aby"));
		if (args.length > 1 && args.length <= 3) {
			if (args[0] == "surroundMe") {
				if (args.length == 3) {
					String surrounded = surroundMe(args[1], args[2]);
					System.out.println(surrounded);
				}
				else {
					System.out.println("invalid result");
				}
			}
			else if (args[0] == "endsMeet") {
				if (args.length == 3) {
					int arg2 = Integer.parseInt(args[2]);
					String meetingEnds = endsMeet(args[1], arg2);
					System.out.println(meetingEnds);
				}
				else {
					System.out.println("invalid result");
				}

			}
			else if (args[0] == "middleMan") {
				if(args.length == 2) {
					String menInMiddle = middleMan(args[1]);
					System.out.println(menInMiddle);
				}
				else {
					System.out.println("invalid result");
				}
			}
			else if (args[0] == "doubleVision") {
				if (args.length == 2) {
					String Visx2 = doubleVision(args[1]);
					System.out.println(Visx2);
				}
				else {
					System.out.println("invalid result");
				}
			}
			else if (args[0] == "centered") {
				if (args.length == 3) {
					boolean centre = centered(args[1], args[2]);
					System.out.println(centre);
				}
				else {
					System.out.println("invalid result");
				}
			}
			else if (args[0] == "upOrDown") {
				if(args.length == 3) {
					double value = Double.parseDouble(args[1]);
					char floorOrRoof = args[1].charAt(1);
					int upsideDown = upOrDown(value,floorOrRoof);
					System.out.println(upsideDown);
					
				}
				else {
					System.out.println("invalid result");
				}
			}
			else if (args[0] == "countMe") {
				if(args.length == 3) {
					char check = args[2].charAt(1);
					int counted = countMe(args[1], check);
					System.out.println(counted);
				}
				else {
					System.out.println("invalid result");
				}
			}
			else if (args[0] == "isNotEqual") {
				if(args.length == 2) {
					boolean isIt = isNotEqual(args[1]);
					System.out.println(isIt);
				}
				else {
					System.out.println("invalid result");
				}
			}
			else if (args[0] == "triplets") {
				if(args.length == 2) {
					int triple = triplets(args[1]);
					System.out.println(triple);
				}
				else {
					System.out.println("invalid result");
				}
			}
			else if (args[0] == "addMe") {
				if(args.length == 3) {
					boolean truth = false;
					if(args[2] == "t") {
						truth = true;
					}
					else if (args[2] =="f") {
						truth = false; 
					}
					int addition = addMe(args[1], truth);
					System.out.println(addition);
				}
				else {
					System.out.println("invalid result");
				}
			}
			else {
				System.out.println("invalid result");
			}
		}
	}
	public static String surroundMe (String a, String b){
		if(a == null || b == null) {
			return null;
		}
		else if (a.length() == 4 && b.length() == 3) {
			String a1 = a.substring(0,2);
			String a2 = a.substring(2,4);
			return (a1 + b + a2);
		}
		return null;
	}
	public static String endsMeet (String a, int b) {
		if (a == null) {
			return null;
		}
		else if (a.length() <= 10 && a.length() >= 0 && 1 <= b  && b <= a.length()) {
			return (a.substring(0,b) + a.substring(a.length() - b, a.length()));
		}
		return null;
	}
	public static String middleMan (String a) {
		if (a == null ) {
			return null;
		}
		else if (a.length() >= 3){
			return (a.substring(a.length()/2 -1, a.length()/2 +2));
		}
		else {
			return null;
		}
	}
	public static String doubleVision (String a) {
		if (a == null) {
			return a;
		}
		else {
			String c = "";
			for (int i = 0 ; i < a.length(); i++) {
				c = c + (a.charAt(i) + "" + a.charAt(i));
			}
			return c;
		}
	}
	public static boolean centered (String a, String b) {
		if (a == null || b == null) {
			return false;
		}
		if (a.substring(a.length()/2 - 1, a.length()/2 + 2).equals(b) || a.substring(a.length()/2 - 2, a.length()/2 + 1).equals(b) ) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int upOrDown (double a, char b) {
		int result;
		if (b == 'c') {
			result = (int) Math.ceil(a);
			return result;
		}
		if (b == 'r') {
			result = (int) Math.round(a);
			return result;
		}
		
		if (b == 'f') {
			result = (int) Math.floor(a);
			return result;
		}
		else {
			return -1;
		}
	}
	public static int countMe (String a, char b) {
		if (a == null) {
			return -1;
		}
		else {
			int count = 0;
			for (int i = 0; i < a.length(); i++) {
				if (b == a.charAt(i)) {
					count = count + 1;
				}
						
			}
			return count;
		}
	}
	public static boolean isNotEqual (String a) {
		int countis =0;
		int countnot =0;
		for(int i =0; i< a.length()-1; i++) {
			if(a.substring(i, i+2).equals("is")) {
				countis = countis + 1;
			}
		}
		for(int i1 =0; i1< a.length()-2; i1++) {
			if(a.substring(i1, i1+3).equals("not")) {
				countnot = countnot + 1;
			}
		}
		if (countis == countnot) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int triplets (String a) {
		if (a == null) {
			return -1;
		}
		int count =0;
		for (int i = 0; i <= a.length()-3; i++) {
			if (a.charAt(i) == a.charAt(i + 1) && a.charAt(i + 1) == a.charAt(i + 2)) {
				count++;
			}
		}
		return count;
	}
	public static int addMe (String a, boolean b) {
		int count = 0;
		if(a == null) {
			return -1;
		}
		if (b == true) {
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == ' ') {
					return -1;
				}
				if(Character.isDigit(a.charAt(i))) {
					count += (a.charAt(i) - '0');
				}
			}
			return count;
		}
		else if (b == false) {
			int fin = 0;
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == ' ') {
					return -1;
				}
				if(Character.isDigit(a.charAt(i))) {
					count = 10*count + (a.charAt(i) - '0');
				}
				if(!Character.isDigit(a.charAt(i))) {
					fin += count;
					count = 0;
				}
			}
			fin+= count;
			return fin;
		}
		return -1;
	}
}