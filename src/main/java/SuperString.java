import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

import groovy.lang.GString;


public class SuperString {

    private final String s;
    

    public SuperString(String aS) {
        super();
        this.s = aS;
    }
    
    public boolean in(String s1) {
        System.out.println("in method 1");
        return s.equals(s1); 
    }

    public boolean in(String... s1) {
        System.out.println("in method");
        for(String current : s1) {
            if (s.equals(current)) {
                return true;
            }
        }
        return false; 
    }
    
    public boolean notIn(String... s1) {
        System.out.println("notIn method");
        for(String current : s1) {
            if (s.equals(current)) {
                return false;
            }
        }
        return true; 
    }
    
    public boolean notIn(String s1) {
        System.out.println("notIn method 1");
        return !s.equals(s1); 
    }


}
