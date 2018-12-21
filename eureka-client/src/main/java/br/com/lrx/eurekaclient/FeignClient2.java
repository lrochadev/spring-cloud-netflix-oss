package br.com.lrx.eurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("CLIENT2")
public interface FeignClient2 {

	@RequestMapping(value="/api", method = RequestMethod.GET)
	String sayHiByClient2();
}
