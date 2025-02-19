package $06_Control_Statements_Math_String;

public class $12_StringTest {
	public static void main(String[] args) {
		int marks = 45;
		StringBuilder sb = new StringBuilder("First ");
		sb.append(marks);
		sb.append(", now this is the ");
		sb.append(76.45);
		System.out.println(sb);
		
		StringBuffer s = new StringBuffer("Second ");
		s.append(marks);
		s.append(", now this is the ");
		s.append(12.34);
		System.out.println(s);
	}
}
