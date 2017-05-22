package com.araj.microservice.rbac;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
  
public class SecondInterceptor implements Interceptor{
 
 @Override
 public void destroy() {
    
 }
 
 @Override
 public void init() {
  
 }
 
 @Override
 public String intercept(ActionInvocation actionInvocation) throws Exception {
  
  String startInterceptor="   Start Interceptor 2";
  System.out.println(startInterceptor);
  String result=actionInvocation.invoke();
  String endInterceptor="   End Interceptor 2";
  System.out.println(endInterceptor);
  return result;
 }
 
}
