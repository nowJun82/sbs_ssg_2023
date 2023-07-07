package com.sbs.java.ssg.controller;

import java.util.List;
import java.util.Scanner;

import com.sbs.java.ssg.dto.Member;
import com.sbs.java.ssg.util.Util;

public class MemberController {
	private Scanner sc;
	private List<Member> members;
	
	public MemberController (Scanner sc, List<Member> members) {
		this.sc = sc;
		this.members = members;
	}
	
	private int getMemberIndexByLoginId(String loginId) {
		int i = 0;
		for (Member member : members) {
			if (member.loginId.equals(loginId)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	private boolean isJoinableLoginId(String loginId) {
		int index = getMemberIndexByLoginId(loginId);

		if (index == -1) {
			return true;
		}
		return false;
	}

	public void dojoin() {
		int id = members.size() + 1;
		String regDate = Util.getNowDateStr();

		String loginId;
		String loginPw;
		String loginPwConfirm;

		while (true) {
			System.out.printf("로그인 아이디 : ");
			loginId = sc.nextLine();

			if (isJoinableLoginId(loginId) == false) {
				System.out.printf("%s (은)는 이미 사용 중인 아이디입니다.\n", loginId);
				continue;
			}
			break;
		}

		while (true) {
			System.out.printf("로그인 비번 : ");
			loginPw = sc.nextLine();
			System.out.printf("로그인 비번 확인 : ");
			loginPwConfirm = sc.nextLine();

			if (loginPw.equals(loginPwConfirm) == false) {
				System.out.println("비밀번호를 확인해주세요.");
				continue;
			}
			break;
		}

		System.out.printf("이름 : ");
		String name = sc.nextLine();
		Member member = new Member(id, regDate, loginId, loginPw, name);
		members.add(member);

		System.out.printf("%d번 회원이 생성되었습니다. 환영합니다^^\n", id);
	}
}