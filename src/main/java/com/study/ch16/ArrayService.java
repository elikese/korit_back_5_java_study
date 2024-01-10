package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1];
        System.arraycopy(strArray, 0, newArray, 0, strArray.length);
        strArray = newArray;
        strArray[strArray.length - 1] = str;
    }

    public String get(int index) {
        return strArray[index];
    }

    // 하나를 제거하니까 기존배열보다 크기 -1
    //1234
    public void remove(int index) {
        String[] newArray = new String[strArray.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = strArray[i < index ? i : i + 1];
        }
//        for (int i = 0; i < index; i++) {
//            newArray[i] = strArray[i];
//        }
//
//        for (int i = index; i < strArray.length - 1; i++) {
//            newArray[i] = strArray[i + 1];
//        }
        strArray = newArray;
    }

    public int indexOf(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "Array[ ";

        for (int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if (i < strArray.length - 1) {
                result += ", ";
            }
        }
        result += " ]";
        return result;
    }
}
