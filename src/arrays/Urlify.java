package arrays;

import java.util.Deque;
import java.util.LinkedList;

public class Urlify{
	public Character[] urlify(Character[] url){
		Deque<Character> queue = new LinkedList<Character>();
		for(int i = 0; i < url.length; i ++){
			Character nextChar = url[i];
			if(nextChar != null && nextChar == ' '){
				addEscape(queue);
			} else if(nextChar != null){
				queue.add(nextChar);
			}
			url[i] = queue.poll();
		}
		
		return url;
	}
	
	private void addEscape(Deque<Character> queue){
		queue.add('%');
		queue.add('2');
		queue.add('0');
	}
}