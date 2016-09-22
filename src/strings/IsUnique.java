package strings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
	
	public static void main (String[] args){
		// empty string
		String my_string = "";
		System.out.println("Is '"+my_string+"' Unique : "+IsUnique.isUnique(my_string));
		my_string = "abcd";
		System.out.println("Is '"+my_string+"' Unique : "+IsUnique.isUnique(my_string));
		my_string = "abcda";
		System.out.println("Is '"+my_string+"' Unique : "+IsUnique.isUnique(my_string));
	}
	
	public static boolean isUnique(final String str){
		Set<Character> chars = new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			if(chars.contains(str.charAt(i))){
				return false;
			}
			chars.add(str.charAt(i));
		}
		return true;
	}
	
	
}