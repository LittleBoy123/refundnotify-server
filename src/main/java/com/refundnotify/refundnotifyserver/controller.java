package com.refundnotify.refundnotifyserver;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class controller {


   @RequestMapping(value = "/refundNotify",method = RequestMethod.POST)
   public void refundNotify(HttpServletRequest request, HttpServletResponse response){

      Map<String, String[]> parameterMap = request.getParameterMap();

      System.out.println(parameterMap.size()+JSONObject.toJSONString(parameterMap));
   }

   @RequestMapping("/test")
   public void test1(){
      try {
         Thread.sleep(60000);
      } catch (Exception e) {
         e.printStackTrace();
      }
      System.out.println("接收到请求");
   }

   @RequestMapping("/test2")
   public User test2(){
      User u = new User();
      u.setPlatformId("111111111");
      u.setRefundPaymentId("2222222222222");
      return u;
   }

}
