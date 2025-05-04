                                                                           package com.training.stringfun;

 
 public class Immutable {
	public static void main(String[] args) {
		ImmutableClass class1 = new ImmutableClass(67);
		
		System.out.println(class1.getNum());
	} 
 }
 final class ImmutableClass {

		private final int num;
		
		

		public ImmutableClass(int num) {
			super();
			this.num = num;
		}

		public int getNum() {
			return num;
		}

		
		
	}