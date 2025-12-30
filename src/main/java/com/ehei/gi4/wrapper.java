package com.ehei.gi4;
import org.apache.commons.lang3.StringUtils;

public class wrapper {
    public String abrv(String text , int x){
        if (text == null){
            return null;
        }
        return StringUtils.abbreviate(text, x);
    }
}
