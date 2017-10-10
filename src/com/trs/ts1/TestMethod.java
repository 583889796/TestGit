package com.trs.ts1;

import java.util.logging.Logger;

public class TestMethod {
    private static Logger log = Logger.getLogger(String.valueOf(TestMethod2.class));
    public static void main(String args[]){
        String str = "12tg37t67edg3uy";
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<str.length()-1;i++) {
            int c = str.charAt(i);
            if (c>48 && c<57) {
                sb.append((char)c);
        }
        }
        System.out.print(sb);
        int c = 10/3;
        System.out.print(c);
        log.info("调用时间:");
        //生产环境第一次提交测试
        System.out.print("1");
    }
}
