package com.example.Talkio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TalkioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalkioApplication.class, args);
	}

}
