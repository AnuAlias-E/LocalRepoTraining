package com.training.twodimensional;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Dictionary {
public static void main(String[] args) {
	 List<String> stringList = Arrays.asList("zzzzzz", "zzzzzb");
     String targetString = "zzzzza";
     
   
     
     String strFound=minLexicoDistance(stringList,targetString);

     if(strFound!=null) {
    	 System.out.println("String is :"+strFound);
     }
     else {
    System.out.println("strfound : "+strFound);
     }
}

private static String minLexicoDistance(List<String> stringList, String targetString) {
	  String close=null;
	     int minDis=Integer.MAX_VALUE;
	     boolean found=false;
	
	for(String str :stringList) {
		
		if(str.compareTo(targetString)==0){
		found=true;
		minDis =0;
		close=str;
		System.out.println(str);
		break;
		}
		int distance=computeleven(targetString,str);
		if(distance<minDis) {
			minDis=distance;
			close=str;
		}
		
	}
System.out.println("Min DIS: "+minDis);
	return close;
}

private static int computeleven(String targetString, String str) {
	int len1=targetString.length();
	int len2=str.length();
	int dis=0;
	for(int i=0;i<Math.max(len2, len1);i++) {
		if(i>=len1||i>=len2||targetString.charAt(i)!=str.charAt(i)) {
			dis++;
		}
	}
	return dis;
}
}
