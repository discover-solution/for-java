package lecture_01;

import java.util.HashMap;

public class ClassObjectInitialization {
	static {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		System.out.println(map);
	}
	public static void main(String[] args) {
		String str = "a";
		for(int i=1; i<4; i++) {
		str = str.concat("a");
		}
		System.out.println(str);
	}
}