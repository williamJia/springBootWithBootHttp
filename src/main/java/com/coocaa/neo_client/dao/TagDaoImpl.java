package com.coocaa.neo_client.dao;

import com.coocaa.neo_client.config.InitConfig;
import com.coocaa.neo_client.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class TagDaoImpl implements TagDao {

    @Autowired
    private InitConfig initConfig;

    @Override
    public Tag getByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("####################");
        System.out.println(initConfig.getCoocaa_pyneo_url());
        System.out.println("###################");
        return restTemplate.getForObject(initConfig.getCoocaa_pyneo_url()+"?name={1}", Tag.class,name);
    }
}
