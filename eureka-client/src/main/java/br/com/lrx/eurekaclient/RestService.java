package br.com.lrx.eurekaclient;

import lombok.AllArgsConstructor;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class RestService {
	
	@Autowired
	@Setter
	private FeignClient2 feignClient2;  

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> sayHi() {
		return new ResponseEntity<>(feignClient2.sayHiByClient2() + " using client1", HttpStatus.OK);
	}
}
