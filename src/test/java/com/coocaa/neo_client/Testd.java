package com.coocaa.neo_client;

import com.coocaa.neo_client.config.InitConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Testd {
    @Autowired
    private InitConfig initConfig;

    @Test
    public void get_pram(){
        String url = initConfig.getCoocaa_pyneo_url();
        System.out.println(url);
    }
}
