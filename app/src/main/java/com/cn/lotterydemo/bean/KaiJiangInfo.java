package com.cn.lotterydemo.bean;

/**
 * Created by Administrator on 2018/1/25.
 */

public class KaiJiangInfo {
   private  String kaijiangCode;
   private String kaijiangDate;
   private String kaijiangNum;
   private String kaijiangName;

   public KaiJiangInfo(String kaijiangCode,String kaijiangDate, String kaijiangNum, String kaijiangName){
       this.kaijiangCode=kaijiangCode;
       this.kaijiangDate=kaijiangDate;
       this.kaijiangNum=kaijiangNum;
       this.kaijiangName=kaijiangName;
   }
    public KaiJiangInfo(){

    }
    @Override
    public String toString() {
        return "KaiJiangInfo{" +
                "kaijiangCode='" + kaijiangCode + '\'' +
                ", kaijiangDate='" + kaijiangDate + '\'' +
                ", kaijiangNum='" + kaijiangNum + '\'' +
                ", kaijiangName='" + kaijiangName + '\'' +
                '}';
    }

    public void setKaijiangName(String kaijiangName) {
        this.kaijiangName = kaijiangName;
    }

    public String getKaijiangName() {

        return kaijiangName;
    }

    public String getKaijiangDate() {
        return kaijiangDate;
    }

    public void setKaijiangDate(String kaijiangDate) {
        this.kaijiangDate = kaijiangDate;
    }

    public String getKaijiangNum() {
        return kaijiangNum;
    }

    public void setKaijiangNum(String kaijiangNum) {
        this.kaijiangNum = kaijiangNum;
    }

    public String getKaijiangCode() {

        return kaijiangCode;
    }

    public void setKaijiangCode(String kaijiangCode) {
        this.kaijiangCode = kaijiangCode;
    }
}
