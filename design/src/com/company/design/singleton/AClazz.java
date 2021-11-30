package com.company.design.singleton;

public class AClazz {

//    public void setSocketClient(SocketClient socketClient) {
//        this.socketClient = socketClient;
//    }

    private SocketClient socketClient;

    public AClazz(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }

}
