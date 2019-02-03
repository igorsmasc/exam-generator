package br.com.devdojo.examgenerator.security.filter;

import java.util.concurrent.TimeUnit;

public class Constants {
    public static final String SECRET = "secre";
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER = "Authorization";
    public static final Long EXPIRATION_TIME = 86400000l; //1day

    public static void main(String[] args){
        System.out.println(TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
    }

}
