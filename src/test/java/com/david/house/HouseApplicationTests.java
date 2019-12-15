package com.david.house;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class HouseApplicationTests {

	// 因为标记 Autowired 所以会被扫描并执行 @Bean HttpClientAutoConfiguration httpClient 方法
	@Autowired
	private HttpClient HttpClient;

	@Test
	void testHttpclient() throws IOException {
		HttpUriRequest request = new HttpGet("http://www.baidu.com");
		HttpEntity entity = HttpClient.execute(request).getEntity();
		System.out.println(EntityUtils.toString(entity));
	}

}
