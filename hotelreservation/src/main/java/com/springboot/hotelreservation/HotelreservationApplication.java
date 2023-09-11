package com.springboot.hotelreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Hp
 *
 */
/**
 * @author Hp
 *
 */
@SpringBootApplication
@EnableSwagger2
@EnableEncryptableProperties
public class HotelreservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelreservationApplication.class, args);
	}

}
