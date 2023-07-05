package com.sbs.java.ssg;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("=== 프로그램 시작 ===");
		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 0;
		
		while (true) {
			System.out.print("명령어 입력 : ");
			String command = sc.nextLine();
			command = command.trim();
			System.out.printf("입력된 명령어 : %s\n", command);
			
			if ( command.length() == 0 ) {
				continue;
			}
			
			if ( command.equals("system exit") ) {
				break;
			}
			else if ( command.equals("article write") ) {
				int id = lastArticleId +1;
				lastArticleId = id;
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				
				System.out.printf("%s번 글이 작성되었습니다.\n", id);
			}
			else if ( command.equals("article list") ) {
				System.out.println("게시물이 없습니다.");
			}
			else {
				System.out.printf("%s (은)는 존재하지 않는 명령어입니다.\n", command);
			}
		}
		System.out.println("=== 프로그램 끝 ===");
		
	}
}