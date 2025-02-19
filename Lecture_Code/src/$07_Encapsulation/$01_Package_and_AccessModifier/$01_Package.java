package $07_Encapsulation.$01_Package_and_AccessModifier;

import $07_Encapsulation.$02_NewTestPackage.$01_NewPackage;

public class $01_Package {

	public static void main(String[] args) {
		String str = "Bhanu";
		$01_NewPackage pkg1 = new $01_NewPackage();
		$01_Package pkg2 = new $01_Package();
		
		// Same method different output with help of Packaging
		pkg1.print(str);
		pkg2.print(str);
	}

	public void print(String str) {
		System.out.println("---- " + str + " ----");
	}
}