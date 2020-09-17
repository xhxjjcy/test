package com.mode.enums;




public enum ResponseMessageCode {
    SUCCESS("0", "成功"),
    FAIL("1", "操作失败"),;


    private String code;
    private String msg;

    ResponseMessageCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据code获取ResponseMessage对象
     *
     * @return
     */
    public static ResponseMessageCode getResponseMessageByCode(String code) {

        ResponseMessageCode[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getCode().equals(code)) {
                return values[i];
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
