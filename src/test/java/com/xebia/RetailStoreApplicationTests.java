package com.xebia;


import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xebia.service.BillService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetailStoreApplicationTests {

	@Autowired BillService billService;
	
	@SuppressWarnings("deprecation")
	
	@Test
	public void getBill() {
		Assert.assertEquals(208.60000000000002, billService.getBill(12345));
	}
}
