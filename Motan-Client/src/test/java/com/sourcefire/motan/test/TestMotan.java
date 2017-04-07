package com.sourcefire.motan.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sourcefire.FooService;

/**
 * <p>Description: </p>
 * @author JiaSonglin
 * @version V1.0,2017年3月27日 下午2:05:36
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMotan {

	@Autowired
	FooService fooService;
	
	@Test
	public void test(){
		String re = fooService.hello(" say xxx ");
		System.out.println(re);
	}
}
