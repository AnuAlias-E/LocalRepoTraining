package com.training.file.arrays;

public class Main {
public static void main(String[] args) {
	String search="one two three";
	String find="one";
	int slength=search.length();
	int flen=find.length();
	boolean found= false;
	for(int i=0;i<=slength-flen;i++) {
		if(search.regionMatches(i, find, 0, flen));
		{
			found=true;
			System.out.println(search.substring(i, i+flen));
		break;
		}
	}
	if(!found) {
		System.out.println("Nomatch");
	}
}
}
