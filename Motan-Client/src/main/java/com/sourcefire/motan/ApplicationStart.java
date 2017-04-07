package com.sourcefire.motan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>Description: </p>
 * @author JiaSonglin
 * @version V1.0,2017年3月27日 下午1:35:13
 */
@ImportResource("classpath:foo-client.xml")
@SpringBootApplication
public class ApplicationStart {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationStart.class, args);
	}
}
