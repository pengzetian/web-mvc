package web.function.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/6
 * Email: xionggao@terminus.io
 */
@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
	public String hello() {
		return "hello world";
	}
}
