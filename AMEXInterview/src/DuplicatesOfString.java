import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "helloworld";
		
		char[] chararray = input.toCharArray();
		
		List<Character> charlist = new ArrayList<Character>();
		
		for(char c : chararray) {
			charlist.add(c);
		}
		
		charlist.stream().filter(i -> Collections.frequency(charlist, i)>1).collect(Collectors.toSet()).forEach(System.out::println);		
		
	}

}
