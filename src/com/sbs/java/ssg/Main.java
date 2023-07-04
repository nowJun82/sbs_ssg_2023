package com.sbs.java.ssg;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("=== 프로그램 시작 ===");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("명령어 입력 : ");
			String command = sc.nextLine();
			command = command.trim();
			
			if ( command.length() == 0 ) {
				continue;
			}
			
			if ( command.equals("종료") ) {
				break;
			}
			else if ( command.equals("article list") ) {
				System.out.println("게시물이 없습니다.");
			}
			else {
				System.out.printf("%s (은)는 존재하지 않는 명령어입니다.\n", command);
			}
		}
//		System.out.printf("ID : %s\nPW : %s\n", ID, PW);
		System.out.println("=== 프로그램 끝 ===");

	}
}