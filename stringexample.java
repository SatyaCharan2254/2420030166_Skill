package myproject;

public class stringexample {
	public static void main(String[] args)
	{
		String str="Hello this is java class";
		String str1="hello";
		String str2="HeLLO";
		String str3="hi how are you";
		String str4="hello";
		String str5="1234";
		String str6="Java234";
		String str7="";
		String str9="  hello java  ";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(8));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareToIgnoreCase(str5));
		System.out.println(str3.concat(str9));
		System.out.println(str1.contains("H"));
		System.out.println(str1.contentEquals(str4));
		System.out.println(str5.endsWith("234"));
		System.out.println(str1.equals(str4));
		System.out.println(str9.indexOf("h"));
		System.out.println(str6.matches("[a-zA-Z0-9]+"));//line 29 and 31 are the same for alphanumeric strings;
		System.out.println(str.matches("\\d+"));
		System.out.println(str.matches("[a-zA-Z]+\\d+"));
		System.out.println(str.isEmpty());
		System.out.println(String.join(" end ",str,str1,str3));
		System.out.println(String.join(" end ","hi this is the","I will see ur ","okay this is the actual end"));
		System.out.println(str.replace("llo","pa"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.replaceFirst("hell","tro"));
		String str10="hi,how,are,you";
		String str8[]=str10.split(",");
		for(String i:str8) {
			System.out.println(i);
		}
		System.out.println(str6.startsWith("J"));
		System.out.println(str.subSequence(2,21));
		char arr[]=str4.toCharArray();
		System.out.println(arr[0]);
		System.out.println(str9.trim());
		System.out.println(String.valueOf(9.8f));
		
		
	}
}
   
