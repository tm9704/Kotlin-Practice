package com.company.design.singleton;

public class BClazz {

//    public void setSocketClient(SocketClient socketClient) {
//        this.socketClient = socketClient;
//    }

    private SocketClient socketClient;

    public BClazz(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
