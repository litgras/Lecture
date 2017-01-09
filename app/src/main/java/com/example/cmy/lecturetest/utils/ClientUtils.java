package com.example.cmy.lecturetest.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cmy on 2016/11/23.
 */
public final class ClientUtils {
    public static Map stringToMap(String msg){
        String[] parameters = msg.split(",");
        Map<String, String> parameterMap = new HashMap<>();
        for(String parameter:parameters){
            String[] para = parameter.split("=");
            parameterMap.put(para[0], para[1]);
        }
        return parameterMap;
    }

    //String sendMsg = "action=login" + "," + "studNum=" + studNum + "," + "studPsw=" + psw;
    public static String mapToString(Map<String, String> parasMap){
        StringBuilder sendMsg = new StringBuilder("");
        for(String key: parasMap.keySet()){
            sendMsg.append(key).append("=").append(parasMap.get(key)).append(",");
        }
        sendMsg.deleteCharAt(sendMsg.length()-1);
        return sendMsg.toString();
    }
}
