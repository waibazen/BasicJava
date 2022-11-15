package com.java.basic;

import java.util.List;

public class MisUtils {

    public String json(int sum){
        return String.format("{sum:%d}",sum);

    }

    public boolean isStringNullorEmpty(String s){

        if(s==null||s.isEmpty()) {
            return true;
        }

          return  false;

    }

}
//separation of responsibility a funcitonality that formats the sumoutput 'S'for SOLID