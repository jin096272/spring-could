package com.eurekaconsumerfeign.Hystric;

import org.springframework.stereotype.Component;

import com.eurekaconsumerfeign.Client.DcClient;

@Component
public class DcClientHystric implements DcClient {

	public String consumer() {
		// TODO Auto-generated method stub
		return "sorry consumer feign";
	}

}
