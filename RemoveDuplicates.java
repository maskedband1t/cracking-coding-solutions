import java.util.HashSet;

// LinkedListNode is defined in book (alternately):
// https://github.com/careercup/CtCI-6th-Edition/blob/59018cfcb90292209275db1c4b3ed306d4b07d7f/Java/CtCILibrary/CtCILibrary/LinkedListNode.java
public class RemoveDuplicates{
	// key here is to use a hashset, as lookup is 0(1) complexity

	void remove_duplicates(LinkedListNode n){
		HashSet<Integer> set = new HashSet<Integer>();

		LinkedListNode prev = null;

		while(n != null){
			if(set.contains(n)){
				set.remove(n);
			}
			else{
				set.add(n);
				prev = n;
			}
			n = n.next;
		}
	}
}