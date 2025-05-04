package com.training.ui.util;
 
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.Reader;
 
public class ConsoleIO {

	public static void prompt(String message) {

		System.out.printf("\t\t %-30s: ", message);

	}
 
	public static String stringInput() {

		Reader reader = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(reader);

		String s = null;
 
		try {

			s = br.readLine();

		} catch (IOException e) {

			System.err.println(e);

		}

		return s;

	}
 
	public static int intInput() {

		int r = Integer.parseInt(stringInput());

		return r;

	}
 
	public static byte byteInput() {

		byte r = Byte.parseByte(stringInput());

		return r;

	}
 
	public static short shortInput() {

		short r = Short.parseShort(stringInput());

		return r;

	}
 
	public static long longInput() {

		long r = Long.parseLong(stringInput());

		return r;

	}
 
	public static float floatInput() {

		float r = Float.parseFloat(stringInput());

		return r;

	}
 
	public static double doubleInput() {

		double r = Double.parseDouble(stringInput());

		return r;

	}
 
	public static char charInput() {

		char ch = stringInput().charAt(0);

		return ch;

	}
 
	public static boolean booleanInput() {

		char ch = stringInput().charAt(0);

		if (ch == 'Y' || ch == 'y')

			return true;

		else

			return false;

	}

}

 