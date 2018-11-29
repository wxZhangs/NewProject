package com.android.wx.news;

/**
 * Created by Administrator on 2018/11/27.
 */

public class ResultBean {


    /**
     * success : true
     * code : 00000000
     * message : success
     * result : {"mkData":{"merchantCode":"1001","QRC":"/uploads/image/20181024/market/feac95588ef44f86a470f6a0b418beca.jpg","num":1000,"honorName":"最优商户","shopHours":"07:00~20:00","merchantName":"致一自营商户","managerType":"综合性市场","license":null,"score":5,"marketName":"致一自营市场","managerArea":"20000","SupervisionTel":"12135","tel":"4007111365","onescreen":6,"Supervision":"市场监督局","twoscreen":3},"mksData":{"test":"28次","testMonth":"1次","ori":"11件","check":"46%"}}
     */

    private boolean success;
    private String code;
    private String message;
    private ResultBeans result;

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

    public ResultBeans getResult() {
        return result;
    }

    public void setResult(ResultBeans result) {
        this.result = result;
    }

    public static class ResultBeans {
        /**
         * mkData : {"merchantCode":"1001","QRC":"/uploads/image/20181024/market/feac95588ef44f86a470f6a0b418beca.jpg","num":1000,"honorName":"最优商户","shopHours":"07:00~20:00","merchantName":"致一自营商户","managerType":"综合性市场","license":null,"score":5,"marketName":"致一自营市场","managerArea":"20000","SupervisionTel":"12135","tel":"4007111365","onescreen":6,"Supervision":"市场监督局","twoscreen":3}
         * mksData : {"test":"28次","testMonth":"1次","ori":"11件","check":"46%"}
         */

        private MkDataBean mkData;
        private MksDataBean mksData;

        public MkDataBean getMkData() {
            return mkData;
        }

        public void setMkData(MkDataBean mkData) {
            this.mkData = mkData;
        }

        public MksDataBean getMksData() {
            return mksData;
        }

        public void setMksData(MksDataBean mksData) {
            this.mksData = mksData;
        }

        public static class MkDataBean {
            /**
             * merchantCode : 1001
             * QRC : /uploads/image/20181024/market/feac95588ef44f86a470f6a0b418beca.jpg
             * num : 1000
             * honorName : 最优商户
             * shopHours : 07:00~20:00
             * merchantName : 致一自营商户
             * managerType : 综合性市场
             * license : null
             * score : 5
             * marketName : 致一自营市场
             * managerArea : 20000
             * SupervisionTel : 12135
             * tel : 4007111365
             * onescreen : 6
             * Supervision : 市场监督局
             * twoscreen : 3
             */

            private String merchantCode;
            private String QRC;
            private int num;
            private String honorName;
            private String shopHours;
            private String merchantName;
            private String managerType;
            private Object license;
            private int score;
            private String marketName;
            private String managerArea;
            private String SupervisionTel;
            private String tel;
            private int onescreen;
            private String Supervision;
            private int twoscreen;

            public String getMerchantCode() {
                return merchantCode;
            }

            public void setMerchantCode(String merchantCode) {
                this.merchantCode = merchantCode;
            }

            public String getQRC() {
                return QRC;
            }

            public void setQRC(String QRC) {
                this.QRC = QRC;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String getHonorName() {
                return honorName;
            }

            public void setHonorName(String honorName) {
                this.honorName = honorName;
            }

            public String getShopHours() {
                return shopHours;
            }

            public void setShopHours(String shopHours) {
                this.shopHours = shopHours;
            }

            public String getMerchantName() {
                return merchantName;
            }

            public void setMerchantName(String merchantName) {
                this.merchantName = merchantName;
            }

            public String getManagerType() {
                return managerType;
            }

            public void setManagerType(String managerType) {
                this.managerType = managerType;
            }

            public Object getLicense() {
                return license;
            }

            public void setLicense(Object license) {
                this.license = license;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getMarketName() {
                return marketName;
            }

            public void setMarketName(String marketName) {
                this.marketName = marketName;
            }

            public String getManagerArea() {
                return managerArea;
            }

            public void setManagerArea(String managerArea) {
                this.managerArea = managerArea;
            }

            public String getSupervisionTel() {
                return SupervisionTel;
            }

            public void setSupervisionTel(String SupervisionTel) {
                this.SupervisionTel = SupervisionTel;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public int getOnescreen() {
                return onescreen;
            }

            public void setOnescreen(int onescreen) {
                this.onescreen = onescreen;
            }

            public String getSupervision() {
                return Supervision;
            }

            public void setSupervision(String Supervision) {
                this.Supervision = Supervision;
            }

            public int getTwoscreen() {
                return twoscreen;
            }

            public void setTwoscreen(int twoscreen) {
                this.twoscreen = twoscreen;
            }
        }

        public static class MksDataBean {
            /**
             * test : 28次
             * testMonth : 1次
             * ori : 11件
             * check : 46%
             */

            private String test;
            private String testMonth;
            private String ori;
            private String check;

            public String getTest() {
                return test;
            }

            public void setTest(String test) {
                this.test = test;
            }

            public String getTestMonth() {
                return testMonth;
            }

            public void setTestMonth(String testMonth) {
                this.testMonth = testMonth;
            }

            public String getOri() {
                return ori;
            }

            public void setOri(String ori) {
                this.ori = ori;
            }

            public String getCheck() {
                return check;
            }

            public void setCheck(String check) {
                this.check = check;
            }
        }
    }
}
