package com.bnt.tasks;

import org.springframework.stereotype.Component;

@Component
public class AddMinimumCharacters {
   public int addMinChar(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            return 0;
        }else {
            return s.length()-1;
        }
    }



}
