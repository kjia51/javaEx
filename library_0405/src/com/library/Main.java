package com.library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
	
	public static void main(String[] args)  {
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("test_copy.txt"));) {
			
		String list = "";
		while((list=br.readLine())!=null) {
				String[] strArr = list.split(" ");
				int A = Integer.parseInt(strArr[0]);
				int B = Integer.parseInt(strArr[1]);
				
				if (A==0 && B==0) {
					break;
				}
				
				bw.write(A+B+"\n");
				bw.flush();
		}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
			
			
	}
	
		
	}
	
	


	
	

