package com.sourcefire.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.sourcefire.FooService;

/**
 * <p>Description: 服务实现</p>
 * @author JiaSonglin
 * @version V1.0,2017年3月8日 上午9:26:03
 */
@Service("fooService")
public class FooServiceImpl implements FooService{

	private static final Log LOG = LogFactory.getLog(FooServiceImpl.class); 
	
	@Override
	public String hello(String sayString) {
		LOG.info(sayString + "invoked rpc service ");
		return sayString+" invoked";
	}

}
