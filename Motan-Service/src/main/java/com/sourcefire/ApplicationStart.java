package com.sourcefire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;

/**
 * <p>Description: </p>
 * @author JiaSonglin
 * @version V1.0,2017年3月27日 下午1:35:13
 */
@ImportResource("classpath:foo-server.xml")
@SpringBootApplication
public class ApplicationStart {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationStart.class, args);
		MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
	}
}
