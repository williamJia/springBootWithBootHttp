package com.coocaa.neo_client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class InitConfig {
    @Value(value = "${py2neo_url}")
    private String coocaa_pyneo_url;
}
