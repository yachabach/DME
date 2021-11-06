package com.panoptic.data;

public class DeviceMessage implements DeviceMessageInterface {

    String msg;

    public DeviceMessage(String msg){
        this.msg = msg;
    }

    @Override
    public void formatMessage(String msg) {

    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Allows us to build a print output for this class that is useful for
     * debugging
     *
     * @return void
     */
    @Override
    public String toString(){
        return this.msg;
    }
}
