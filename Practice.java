package Pages;

import java.lang.reflect.Array;
import java.util.*;

public class Practice {

	ArrayList<String> list = new ArrayList<String>();
	ArrayList<Character> dupl = new ArrayList<Character>();
	ArrayList<Character> withoutDupl = new ArrayList<Character>();
	ArrayList<String> listOfString = new ArrayList<String>();
	List<Integer> listOfInt = new ArrayList<Integer>();
	ArrayList<Integer> listOfInt1 = new ArrayList<Integer>();
	ArrayList<Integer> listOfInt2 = new ArrayList<Integer>();
	ArrayList<Character> listFromString = new ArrayList<Character>();
	ArrayList<Character> reverseListFromString = new ArrayList<Character>();
	String[] inputList = { "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Avg", "Sep", "Okt", "Nov", "Dec" };
	Integer[] intList = { 11, 2, 3, 5, 9 };
	Arrays inputListSorted;

	// Form a list of numbers from 0-9.
	public void createList() {
		listOfInt.clear();
		Integer[] intListNew = new Integer[11];

		for (int i = 0; i < 11; i++) {
			Random rand = new Random();
			int randomElement = rand.nextInt(5, 50);
			listOfInt.add(randomElement);
			intListNew[i] = randomElement;
			System.out.println("random element is : " + randomElement);
			System.out.println("elem when reading from list is : " + listOfInt.get(i));
			System.out.println("Input list : " + listOfInt);
			listOfInt.add(randomElement);
			System.out.println("Input list after adding again : " + listOfInt);
			listOfInt.remove(i + 1);
			System.out.println("Input array list after remove : " + listOfInt);
			System.out.println("Input array  : " + intListNew[i]);
		}
		int i = listOfInt.size();
		System.out.println("Number of element of first array  : " + i);
		int j = intListNew.length;
		System.out.println("Number of element of second array  : " + j);

		while (i > 0) {
			System.out.println(i);
			System.out.println("listOfInt element is: " + listOfInt.get(i - 1));
			i--;
		}
		while (j > 0) {
			System.out.println(j);

			System.out.println("intList element is: " + intListNew[j - 1]);
			j--;
		}

		System.out.println(j);

		System.out.println("Input list : " + listOfInt);
	}

	public static void numberOfAppereance(Integer[] integerArray) {
		int numb = 1;

		int max = 1;
		String[] list = new String[10];
		int[] myIntArray = new int[3];
		myIntArray[0] = 1;
		list[0] = "Opel";
		System.out.println(list[0]);
		System.out.println(list[1]);
		// Integer [] arr = {1,1,2,3,2,2,2,2,5,3,3};
		Integer[] arr = integerArray;
		for (int i = 0; i < arr.length; i++) {
			int appereance = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] == arr[i]) {
					// numb = arr[i];
					appereance = appereance + 1;
					if (appereance > max) {
						numb = arr[j];
						max = appereance;
						System.out.println("Number of appereance:" + max);
						// numb = arr[j];

					}
				}

			}

		}
		System.out.println("number with most appereance is: " + numb + " number of appereance is: " + max);
	}

	public static void SumOfValues(int input) {
		/* Count sum of numbers in integer input */
		int tempSum = 0;
		int a = 0;
		int add;
		while (input > 0) {
			add = input - (input / 10 * 10); // 98-9*10=8
			input = input / 10; // 9
			tempSum = tempSum + add; //

			System.out.println("Sum is: " + tempSum);
		}
	}

	public static void ReverseStringPractice(String s) {
		char[] originalarray = s.toCharArray();
		int length = originalarray.length;
		char[] reverse = new char[length];
		int j = 0;
		for (int i = length - 1; i >= 0; i--) {

			reverse[i] = originalarray[j];
			j++;
		}
		System.out.println(reverse);
		String finalString = "";
		for (int k = 0; k < reverse.length; k++) {
			finalString = finalString + String.valueOf(reverse[k]);

		}
		System.out.println(finalString);
	}

	public static void ReverseString(String s) {
		String originalStr = s;
		String reversedStr = "";
		char[] original = originalStr.toCharArray();
		char[] reversed = originalStr.toCharArray();
		System.out.println("Original string: " + originalStr);
		int j = 0;
		for (int i = originalStr.length() - 1; i >= 0; i--)

		{
			reversed[j] = original[i];
			System.out.println("Reversed string: " + reversed[j]);
			j = j + 1;
		}
	}

	public void findStringDuplicates(String s) {
		withoutDupl.clear();
		char[] duplic;
		char[] noduplic;
		duplic = s.toCharArray();

		for (int i = 0; i < duplic.length; i++) {
			// count = 1;
			for (int j = i + 1; j < duplic.length; j++) {
				if (duplic[i] == duplic[j] && duplic[i] != ' ') {
					break;

				}
				withoutDupl.add(duplic[i]);
			}
		}

		String a = withoutDupl.toString();
		System.out.println(a);

	}

	public static void findStringDuplicatesAgain(String s) {
		List<Character> lst = new ArrayList<>();
		char[] duplic;
		// char[] noduplic;
		duplic = s.toCharArray();

		for (int i = 0; i < duplic.length; i++) {
			// count = 1;
			for (int j = i + 1; j < duplic.length; j++) {
				// System.out.println(duplic[i]);
				if (duplic[i] == duplic[j] && duplic[i] != ' ') {
					System.out.println("duplikat je: " + duplic[j]);
					lst.add(duplic[i]);
					break;

				}

			}
		}

		String a = lst.toString();
		System.out.println("duplikati su: " + a);

	}

	public static void findStringDuplicatesInteger(int s) {
		List<Character> lst = new ArrayList<>();
		char[] duplic;
		// char[] noduplic;

		String str = Integer.toString(s);
		duplic = str.toCharArray();

		for (int i = 0; i < duplic.length; i++) {
			// count = 1;
			for (int j = i + 1; j < duplic.length; j++) {
				// System.out.println(duplic[i]);
				if (duplic[i] == duplic[j] && duplic[i] != ' ') {
					System.out.println("duplikat je: " + duplic[j]);
					lst.add(duplic[i]);
					break;

				}

			}
		}

		String a = lst.toString();
		System.out.println("duplikati su: " + a);

	}

	public void createIntList() {
		for (int i = 0; i < 10; i++) {
			listOfInt1.add(i);
			i = i + 1;
		}
		System.out.println("Input list : " + listOfInt1);
	}

	public void createIntListTwo() {
		for (int i = 0; i < 20; i++) {
			listOfInt2.add(i);

		}
		System.out.println("Input list : " + listOfInt2);
	}

	public void removeExtraSpaces() {
		String str = "Acv bv gsdc EMdc  sdertj";
		System.out.println(str);
		String replacement = str.replaceAll(" ", "");

		System.out.println(replacement);
	}

	public void showList() {

		for (String str : inputList) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

	public boolean isItPalindrome(String str) {
		listFromString.clear();
		reverseListFromString.clear();
		Boolean t = true;
		for (int i = 0; i < str.length(); i++) {
			listFromString.add(str.charAt(i));

		}

		// System.out.println(listFromString);

		for (int i = str.length() - 1; i >= 0; i--) {

			reverseListFromString.add(listFromString.get(i));

		}
		// System.out.println(reverseListFromString);

		for (int i = 0; i < str.length(); i++) {

			if (listFromString.get(i).equals(reverseListFromString.get(i))) {

			} else {
				System.out.println("Not palindromes" + listFromString + " " + reverseListFromString);
				t = false;
				break;
			}

		}
		if (t) {
			System.out.println("Yes palindromes" + listFromString + " " + reverseListFromString);
		}

		return (t);

	}

	public void sameElements() {
		listOfInt1.clear();
		listOfInt2.clear();
		listOfInt1.add(2);
		createIntList();
		createIntListTwo();
		for (int str : listOfInt1) {
			System.out.println("success");
		}

	}

	public void twoMaxArrayValues() {
		createList();

		int maxfirst = 0;

		for (int str : listOfInt) {

			if (str > maxfirst) {

				maxfirst = str;

			}

		}
		int min = maxfirst;
		for (int str : listOfInt) {

			if (str > maxfirst) {

				maxfirst = str;
				// maxsecond = maxfirst -1;

			}
			if (min > str) {
				min = str;
			}
		}
		System.out.println("max is: " + maxfirst + "min is: " + min);
	}

	public int reverseNumber(int numb) {

		int invert = 0;
		while (numb != 0) {
			invert = (invert * 10) + (numb % 10);
			numb = numb / 10;
		}
		return invert;
	}

	public void showSortedList() {

		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
		for (String str : inputList) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

	public void addDuplicatesToList() {
		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));

		}
		System.out.println("\nAdded duplicates : " + list);
	}

	public static void findMaxSubString(String s) {
		// Insert a new set of numbers from 0-5.
		char[] myChar = s.toCharArray();
		ArrayList<Integer> myInteger = new ArrayList<Integer>();
		int max = 0;
		int count = 0;
		// int a = 5/0;
		for (int i = 0; i < myChar.length; i++) {

			if (String.valueOf(myChar[i]).equals(" ")) {

				if (i - count > max) {
					System.out.println("i: " + i);
					System.out.println("max before calculation: " + max);
					int tmp = i - count;
					max = i - count;
					count = i;
					System.out.println("i -count: " + tmp);
					System.out.println("count: " + count);
					System.out.println("max after calculation: " + max);

				}

				myInteger.add(i);
			}

		}
		System.out.println("dragan");
		System.out.println(max);
		System.out.println(myInteger);
		System.out.println(myInteger);
	}

	public static int sockMerchant(int n, List<Integer> ar) {
		// Write your code here

		int counter = 0;
		int count = 0;
		//
		for (int i = 0; i < ar.size(); i++) {
			count = 1;
			//
			for (int j = i + 1; j < ar.size(); j++) {
				if (ar.get(i) == ar.get(j)) {
					count++;
				}
			}

			if (count % 2 == 0) {
				counter++;
			}
		}
		System.out.print(counter);
		return counter;
	}

	public static int countingSteps(int n, String path) {
		// Write your code here

		int counter = 0;
		List<Character> listOfString;
		List<Character> chars = new ArrayList<>();

		// For each character in the String
		// add it to the List
		for (char ch : path.toCharArray()) {

			chars.add(ch);
		}

		//
		for (int i = 0; i < chars.size(); i++) {
			// System.out.print(chars.size());
			// System.out.print("\n");

			System.out.print(chars.get(i) + "\n");
			if (chars.get(i).toString().equals("U")) {
				System.out.print("Up" + "\n");
				counter++;
				System.out.print("Counter is " + counter + "\n");

			}
			if (chars.get(i).toString().equals("D")) {
				System.out.print("Down" + "\n");
				counter--;
				System.out.print("Counter is " + counter + "\n");

			}

		}
		System.out.print("\n" + counter);
		return counter;
	}

//    public void moveDuplicatesFromList(int[] inputListInteger) {
//        //
//        int[] nodupl ;
//        ArrayList<Integer> lst = new ArrayList<Integer>();
//       
//        for (int i = 0; i < inputListInteger.length; i++) {
//            for (int j = i + 1; j < nodupl.length; j++) {
//                if (inputListInteger[i] == nodupl[j]) {
//                   
//                	break;
//                }
//                else {
//                	lst.add(inputListInteger[i]);
//                }
//            }
//
//        }
//        System.out.println("\nFiltered duplicates : " + lst);
//    }
	public void removeDuplicatesFromList(List<Integer> inputListInteger) {
		//
		List<Integer> arlist = inputListInteger;
		List<Integer> dupl = new ArrayList<>();

		arlist = inputListInteger;
		// dupl.add(arlist.get(0));
		for (int i = 0; i < arlist.size(); i++) {
			for (int j = i + 1; j < arlist.size(); j++) {
				if (arlist.get(i) == arlist.get(j)) {
					dupl.add(arlist.get(j));
					System.out.println("i am here" + arlist.get(j));
					break;
				}

			}

		}

		System.out.println("\nduplicates : " + dupl);
	}

	public static void inverse(String[] a) {
		String[] myArray = a;
		ArrayList<String> lst = new ArrayList<String>();
		String[] inverseArray = new String[myArray.length];

		int i = 0;
		int lengthOfArray = myArray.length - 1;
		System.out.println("length is " + lengthOfArray);

		for (int j = 0; j < myArray.length; j++) {
			inverseArray[j] = myArray[lengthOfArray - j];
			lst.add(myArray[lengthOfArray - j]);
			System.out.println("inverse:  " + inverseArray[j]);
		}

		for (int k = 0; k < lst.size(); k++) {

			System.out.println("inverse with arraylist:  " + lst.get(k));
		}
	}

	// rotation from first elem that is index, example 2 index of rotation
	public static void ArrayRotation(int[] arr) {
		int firstElement = arr[0];
		int[] arrexpected = new int[arr.length];
		for (int i = firstElement; i < arr.length; i++) {
			arrexpected[i - firstElement] = arr[i];
			// System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length - firstElement - 1; i++) {
			arrexpected[i + firstElement + 1] = arr[i];
			// System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(String.valueOf(arrexpected[i]));
		}

	}

	public static void palindromeAgain(String pal) {
		System.out.println("palindrom!");
		char[] original = pal.toCharArray();
		char[] reverse = new char[original.length];
		int j = original.length;
		boolean bool = true;
		System.out.println(j);
		for (int i = 0; i < original.length; i++) {
			reverse[i] = original[j - 1];
			j = j - 1;
			System.out.println("reverse: " + reverse[i]);
			System.out.println("original: " + original[i]);
			if (original[i] != reverse[i]) {
				System.out.println("no it is not palindrom!");
				bool = false;
				break;
			}

		}
		if (bool) {
			System.out.println("it is palindrom");
		}
	}

	// distance a and b are 3
	public static String ABCheck(String str) {
		char[] myArray = str.toLowerCase().toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (((i + 4 < str.length() && myArray[i + 4] == 'b') && myArray[i] == 'a')) {
				str = "true";
				return str;
			} else if (((i + 4 < str.length() && myArray[i + 4] == 'a') && myArray[i] == 'b')) {
				str = "true";
				return str;
			}
		}
		str = "false";

		return str;

	}
// happy numbers square of digit is 1: 10 , 1, no happy 23 2*2+3*3
	public static String  HappyNumber(int input) {
		int tempSum = 0;
		int add;
		while (input > 0) {
			add = input - (input / 10 * 10); // 98-9*10=8
			input = input / 10; // 9
			tempSum = tempSum + add*add; 
             System.out.println("Sum is: " + tempSum);
		}
		if (tempSum == 1) {
			return "True";
		}
		else {
			return "False";
			}
		
		
	}
	public static boolean CheckNums(int num1, int num2) {
		if (num2 > num1) {
			return true;
		} else if (num2 < num1) {
			return false;
		}
		else return true;

	}

	public static String LetterChanges(String str) {
		str = str.toLowerCase();
		char[] myArray = new char[str.length()];
		myArray = str.toCharArray(); // convert string to char array

		for (int i = 0; i < myArray.length; i++) {
			if (Character.isLetter(myArray[i]) == false) { // if not a letter skip iteration
				continue;
			} else if (myArray[i] == 'z') {
				myArray[i] = 'a'; // if z set = to a
				continue;
			} else if (myArray[i] == 'a') {
				myArray[i] = 'A';
				continue;
			} else if (myArray[i] == 'e') {
				myArray[i] = 'E';
				continue;
			} else if (myArray[i] == 'i') {
				myArray[i] = 'I';
				continue;
			} else if (myArray[i] == 'o') {
				myArray[i] = 'O';
				continue;
			} else if (myArray[i] == 'u') {
				myArray[i] = 'U';
				continue;
			}
			myArray[i]++; // increment to next letter
		}
		str = String.valueOf(myArray); // convert char array back to a string
		// Replace all vowels with capital letters
		/*
		 * str = str.replaceAll("a", "A").replaceAll("e","E").replaceAll("i","I").
		 * replaceAll("o", "O").replaceAll("u", "U");
		 */

		return str;

	}
	public static String CharArrayToString (char[] myArray) {
		
		
		String str = String.valueOf(myArray);
		return str;
	}

	public static void main(String[] args) {
		// HappyNumber
		System.out.println("Happy Number: " + HappyNumber(101));
		System.out.println("Happy Number: " + HappyNumber(1023));
		System.out.println("Happy Number: " + HappyNumber(10));
		System.out.println("letter: " + LetterChanges("aeiouzbcd"));
		
		char[] charArray = {'a', 'b', 'c', 'd', 'e', '1'};
		System.out.println("letter: " + CharArrayToString(charArray));
		
		System.out.println("check nums: " + CheckNums(4, 4));

		System.out.println("abc check true: " + ABCheck("adreb"));
		System.out.println("abc check false: " + ABCheck("areb"));

		int[] dr = { 2, 3, 4, 5, 6 };
		ArrayRotation(dr);
		try {
			findMaxSubString("Aleksandra BMW a ra s Konstantinopolj ddd ");
		} catch (Exception e) {
			System.out.println("Something went wrong." + e);
		}

		ReverseString("Aleksandra");

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda", "Peugeot" };
		inverse(cars);
		int number = 24598543;
		Practice obj = new Practice();
		obj.createList();

		// obj.addDuplicatesToList();
		List<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(1);
		ar.add(2);
		ar.add(4);
		ar.add(3);
		ar.add(3);
		ar.add(6);
		ar.add(6);
		ar.add(3);
		// obj.moveDuplicatesFromList(ar);
		obj.findStringDuplicates("aazbukka");
		// obj.showList();
		// obj.showSortedList();
		// obj.removeExtraSpaces();
		obj.twoMaxArrayValues();
		// sockMerchant(7,ar );
		// countingSteps(8, "UUDUUDUD");
		obj.isItPalindrome("Dragan");
		obj.isItPalindrome("ANA");
		obj.findStringDuplicates("Dragann");
		// obj.isItPalindrome("SAIPPUAKIVIKAUPPIAS");
		// System.out.println(obj.reverseNumber(number));
		// obj.twoMaxArrayValues();
		// obj.sameElements();
		// obj.showList();
		obj.removeDuplicatesFromList(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
		System.out.println(obj.reverseNumber(654123));
		// System.out.println("Input list : " + list);
		// System.out.println("\nFiltered duplicates : " + processList(list));
		SumOfValues(423);
		findStringDuplicatesInteger(112344);
		Integer[] arr = { 1, 1, 2, 3, 2, 7, 2, 5, 3, 3, 7, 7, 7 };
		numberOfAppereance(arr);
		ReverseStringPractice("dragan");
		findStringDuplicatesAgain("acddmnvv");
		palindromeAgain("ANA");
	}

}
