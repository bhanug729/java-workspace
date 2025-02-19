package $00_Coding_Exercise.Exercise05;

import java.util.ArrayList;

public class $02_ArratList {

	public static void main(String[] args) {
		// Type specific
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=10;i++) {
			list.add(i);
		}
		System.out.println(list.toString());
	}

}
