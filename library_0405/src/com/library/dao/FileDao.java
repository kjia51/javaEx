package com.library.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao{

		@Override
		public List<Book> getList() {
//			System.out.println("getlist 시작");
			List<Book> list = new ArrayList<>();
			try (BufferedReader br = new BufferedReader(new FileReader("bookArr.txt"))){
				String arrList ="";
				while((arrList=br.readLine())!=null) {
					Book book = makeBook(arrList);
					
					if(book!=null) {
						list.add(book);
					}
				}

				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			}
			
			
//			System.out.println("getlist 끝");
			return list;
		}
	
		private Book makeBook(String arrList) {
			Book book = null;
			// 공백을 기준으로 배열로 저장
			String[] str = arrList.split(" ");
			// Book을 생성하기 위해 알맞은 타입으로 저장
			// 강제 형변환시 오류가 발생할 수 있으므로 문자열을 int타입으로 변환
			// 프로그램에서 오류가 발생했을 때, 프로그램이 비정상적으로 종료되는 것을 막기 위해서 예외처리
			try {
				int no = Integer.parseInt(str[0]);
				String title = str[1];
				String author = str[2];
				boolean isRent = Boolean.parseBoolean(str[3]);
				
				book = new Book(no, title, author, isRent);
				
			} catch (Exception e) {
				// 문자열 파싱 중 오류가 발생했을 경우 메시지 처리, return null
				System.err.println(arrList+" : 파싱중 오류가 발생했습니다");
//				return null;
				
			}
			// 책을 생성
			// 오류가 발생할 경우 null을 반환
			// 책을 반환
		
		
		return book;
		
	}

		@Override
		/**
		 * 리스트를 매개변수로 받아 파일로 출력
		 */
		public boolean ListToFile(List<Book> list) {
			
			//향상된 try문에 넣으면 버퍼를 따로 닫지 않아도됌
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("bookArr_copy.txt"));){
				for(Book book: list) {
					bw.write(book.toString()+"\n");
					
				}
				bw.flush();
				return true;
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return false;
		}

	
	
}
