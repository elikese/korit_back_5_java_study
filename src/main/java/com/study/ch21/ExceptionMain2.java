package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("a");
        nameList.add("b");
        nameList.add(null);
        nameList.add("d");

        try{
            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                if(name.equals("d")) {
                    System.out.println("d를 찾음!!!");
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            // 앵간한거 다 캐치
        } finally {
            System.out.println("이거는 무적권 실행됨");
        }
        System.out.println("프로그램 정상 종료");
    }
}