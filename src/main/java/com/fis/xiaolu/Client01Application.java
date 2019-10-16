package com.fis.xiaolu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Client01Application!
 *
 */
@SpringBootApplication
public class Client01Application 
{
    public static void main( String[] args )
    {
        System.out.println( "Client01Application start ......!" );
        SpringApplication.run(Client01Application.class, args);
        System.out.println( "Client01Application success ......!" );
        
    }
}
