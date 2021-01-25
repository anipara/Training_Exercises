package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Q2 {
	public static void main(String[] args){
		HashSet<Integer> hashNumbers = new HashSet<>();
		hashNumbers.add(67);
		hashNumbers.add(32);
		hashNumbers.add(98);
		hashNumbers.add(64);
		hashNumbers.add(114);
		hashNumbers.add(264);
//		Order of insertion not preserved
		System.out.println(hashNumbers);

		
		LinkedHashSet<Integer> linkedNumbers = new LinkedHashSet<>();
		linkedNumbers.add(67);
		linkedNumbers.add(32);
		linkedNumbers.add(98);
		linkedNumbers.add(64);
//		Order of insertion is preserved
		System.out.println(linkedNumbers);		

	}
}
