package com.alibaba.dubbo.common.utils;

public class StackTraceElementUtils {

    public static void printStackTrace(){
        StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------");
        for (StackTraceElement stackTrace : stackTraces) {
            sb.append(stackTrace.getClassName()).append(".");
            sb.append(stackTrace.getMethodName()).append("() ");
            sb.append("-> ").append(stackTrace.getLineNumber()).append("\n");
        }
        sb.append("--------------------------------------");
        System.out.println("$=>" + sb.toString());
    }
}
