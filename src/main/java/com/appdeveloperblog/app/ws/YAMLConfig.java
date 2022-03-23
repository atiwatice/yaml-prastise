package com.appdeveloperblog.app.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
@Getter
@Setter

public class YAMLConfig {
	private String name;
    private String environment;
    private boolean enabled;
    private List<String> servers = new ArrayList<>();
    private Map<String, String> map = new HashMap<String, String>();
}
