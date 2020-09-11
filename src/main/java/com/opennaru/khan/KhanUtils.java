package com.opennaru.khan;
//egovframework.com.khan.KhanUtils
public class KhanUtils {
    public static void testParse() {
        long random = new Double(Math.random() * 3 * 1000).longValue();
        try {
            Thread.sleep(random);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
