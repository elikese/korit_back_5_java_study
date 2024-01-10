package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;
// 1 5 4 6 2&3
public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        String selectedMenu = null;
        String name = null;
        String address = null;

        while(true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>");
            selectedMenu = scanner.nextLine();
            
            if("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("[ 회원 등록 하기 ]");
                System.out.print("이름 >>");
                name = scanner.nextLine();
                System.out.print("주소 >>");
                address = scanner.nextLine();
                System.out.println("<< 등록이 완료되었습니다 >>");
                Member member = new Member(name, address);
                members.add(member);

            } else if("2".equals(selectedMenu)) {
                System.out.println("[ 회원 이름 수정하기 ]");
                System.out.print("수정할 회원의 이름을 입력하세요 >> ");
                name = scanner.nextLine();
                for (int i = 0; i < members.size(); i++) {
                    if(members.get(i).getName().equals(name)) {
                        String tmp;
                        System.out.print("수정하실 이름 >>");
                        tmp = scanner.nextLine();
                        members.get(i).setName(tmp);
                        break;
                    } else {
                        System.out.println("회원이름이 없습니다");
                    }
                }
                System.out.println("<< 수정이 완료되었습니다 >>");
            } else if ("3".equals(selectedMenu)) {
                System.out.println("[ 회원 주소 수정하기 ]");
                System.out.print("수정할 회원의 주소를 입력하세요 >> ");
                address = scanner.nextLine();
                for (int i = 0; i < members.size(); i++) {
                    if(members.get(i).getAddress().equals(address)) {
                        String tmp;
                        System.out.print("수정하실 주소 >>");
                        tmp = scanner.nextLine();
                        members.get(i).setAddress(tmp);
                        break;
                    } else {
                        System.out.println("회원 주소가 없습니다");
                    }
                }
                System.out.println("<< 수정이 완료되었습니다 >>");
            } else if ("4".equals(selectedMenu)) {
                /*
                Member 객체의 toString 호출
                 */
                System.out.println("[ 회원 이름 조회하기 ]");
                System.out.print("조회하실 이름 >>");
                name = scanner.nextLine();
                for(int i=0; i<members.size(); i++) {
                    if (members.get(i).getName().equals(name)) {
                        System.out.println(members.get(i).toString());
                    } else {
                        System.out.println("조회하신 이름이 없습니다");
                    }
                }
                System.out.println("조회가 완료되었습니다");
            } else if ("5".equals(selectedMenu)) {
                System.out.println("[ 회원 전체 조회 ]");
                System.out.println(members);
                /*
                MemberList 객체들 정보 전체 조회
                 */
            } else if ("6".equals(selectedMenu)) {
                /*
                삭제할 이름을 toString 조회 - remove(); return 값 : 삭제한 객체
                 */
                System.out.println("[ 회원 이름으로 삭제하기 ]");
                System.out.println("삭제하실 이름 >>");
                name = scanner.nextLine();
                for (int i = 0; i < members.size(); i++) {
                    if(members.get(i).getName().equals(name)) {
                        System.out.println(members.remove(i));
                        break;
                    } else {
                        System.out.println("회원이름이 없습니다");
                    }
                }
                System.out.println("<<삭제가 완료되었습니다>>");
            } else {
                System.out.println("잘못입력, 다시선택");
            }
            System.out.println("-----------------");


        }
        System.out.println("프로그램 종료");

    }
}
