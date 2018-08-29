package com.refundnotify.refundnotifyserver;

public class User {
   private transient String platformId;
   private String refundPaymentId;



   public String getPlatformId() {
      return platformId;
   }

   public String getRefundPaymentId() {
      return refundPaymentId;
   }



   public void setPlatformId(String platformId) {
      this.platformId = platformId;
   }

   public void setRefundPaymentId(String refundPaymentId) {
      this.refundPaymentId = refundPaymentId;
   }



}
