package com.panoptic.services;

import com.panoptic.data.DeviceMessage;

public class MessageService {

    DeviceMessage deviceMessage;
    ComService comService;

    public MessageService(){
        this.comService = new ComService("..//temp");
    }

    public void setDeviceMessage(String msg) {

        this.deviceMessage = new DeviceMessage(msg);
        this.comService.sendMsg(this.deviceMessage);
    }

    public String getDeviceMessage() {
        return deviceMessage.getMsg();
    }
}
