package com.refundnotify.refundnotifyserver;

public class RefundNotifyJDVo {
   private String platformId;
   private String refundPaymentId;
   private String outPaymentId;
   private String resultCode;
   private String resultMsg;
   private String refundFee;

   public String getResultMsg() {
      return resultMsg;
   }

   public String getResultCode() {
      return resultCode;
   }

   public String getRefundFee() {
      return refundFee;
   }


   public String getRefundPaymentId() {
      return refundPaymentId;
   }

   public String getPlatformId() {
      return platformId;
   }

   public String getOutPaymentId() {
      return outPaymentId;
   }

   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   public void setRefundFee(String refundFee) {
      this.refundFee = refundFee;
   }


   public void setRefundPaymentId(String refundPaymentId) {
      this.refundPaymentId = refundPaymentId;
   }

   public void setPlatformId(String platformId) {
      this.platformId = platformId;
   }

   public void setOutPaymentId(String outPaymentId) {
      this.outPaymentId = outPaymentId;
   }
}
