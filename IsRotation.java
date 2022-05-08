public class IsRotation {
	// check if s2 is a rotation of s1 with only one call to isSubstring
	// ex. waterbottle -> erbottlewat (rotated @ char 3)
	boolean is_rotation(String s1, String s2){
		if(s1.length() == s2.length() && s1.length() != 0){
			String combined = s1 + s1;
			return isSubstring(combined, s2);
			// ex. waterbottlewaterbottle contains erbottlewat
			// double of s1 guaranteed to contain s2 if s2 is truly a rotation
		}
		return false;
	}	
}
