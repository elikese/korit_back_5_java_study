package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "박화목");
//        send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("박화목", "01091201874"));
        send(sendData2);
        sendData2.send();
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("박화목", "01091201874"));
        send(sendData3);
    }

    // 매개변수에 제네릭을 넣을때 제네릭의 타입을 모를 때 <?> 사용 : 와일드카드
    // <? extends 어쩌고>로 어쩌고 개체 및 어쩌고에게 상속받은 클래스까지의 제한을 가질 수 있다
    // <? super 어쩌고>로 어쩌고 개체 및 어쩌고의 상위 클래스까지의 제한을 가질 수 있다
    public static void send(SendData<? super VipMember> sendData) {
        sendData.send();
    }

}
