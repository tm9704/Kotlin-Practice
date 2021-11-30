package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    // default 생성자 막기
    private SocketClient(){}

    public static SocketClient getInstance(){ //static 메소드 이므로 바로 접근가능

        if(socketClient == null){
            socketClient = new SocketClient();
            System.out.println("socket new instance");
        }

        return socketClient;
    }

    public void connect(){
        System.out.println("socket");
    }

}

//디폴트 생성자를 막고 static 메소드를 통해 getInstance라는 메서드를 만들어줌
//그리고 자신이 가지고있는 자신의 객체가 null인 경우 신규로 생성해서 리턴,
//있는경우 그냥 리턴


