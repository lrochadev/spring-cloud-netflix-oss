package br.com.lrx.eurekaclient2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class RestService {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> sayHi() {
		return new ResponseEntity<>("Hi by client2", HttpStatus.OK);
	}
}
