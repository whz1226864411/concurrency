package com.creat.arithmetic;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2018-02-23.
 */
public class Four {

    @Test
    public void test() {
        char[] s = new char[]{'W','e',' ','a','r','e',' ', 'h','a','p','p',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        replaceBlank(s);
        Assert.assertEquals("We%20are%20happ",new String(s).trim());
    }

    public void replaceBlank(char[] s) {
        if (s != null) {
            int count = 0;
            int length = 0;
            for (int i = 0; s[i] != 0; i++) {
                if (s[i] == ' ') {
                    count++;
                }
                length++;
            }
            int p2 = length + count*2;
            for (int i = length; i > 0; i--) {
                if (s[i] != ' ') {
                    s[p2] = s[i];
                    p2--;
                }else {
                    s[p2] = '0';
                    s[p2-1] = '2';
                    s[p2-2] = '%';
                    p2 -= 3;
                }
            }
        }
    }
}
