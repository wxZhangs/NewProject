package com.android.wx.news;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/11/27.
 */

public class LoginBean implements Serializable{

    /**
     * success : true
     * code : 00000000
     * message : success
     * result : {"info":{"code":"343","mobile":"13188888888","enCodePkey":"BBC070187D9986DA"}}
     */

    private boolean success;
    private String code;
    private String message;
    private ResultBean result;

    @Override
    public String toString() {
        return "LoginBean{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * info : {"code":"343","mobile":"13188888888","enCodePkey":"BBC070187D9986DA"}
         */

        private InfoBean info;

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public static class InfoBean {
            /**
             * code : 343
             * mobile : 13188888888
             * enCodePkey : BBC070187D9986DA
             */

            private String code;
            private String mobile;
            private String enCodePkey;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getEnCodePkey() {
                return enCodePkey;
            }

            public void setEnCodePkey(String enCodePkey) {
                this.enCodePkey = enCodePkey;
            }
        }
    }
}
