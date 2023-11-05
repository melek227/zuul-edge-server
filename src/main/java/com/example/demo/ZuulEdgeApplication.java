package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableZuulProxy //Zuul proxyi etkinleştirir ve tüm talepleri ** idsine sahip bir servise yönlendirecek olan bir root oluşturur
@CrossOrigin(origins="*", maxAge=3600) //serverin kendi serveri olmayan farklı bir originden talepleri kabul etmesine izin verir.
//Bu serverin farklı bir alan adına sahip bir client tarafı uygulamasını sunan durumda kullanılır
//Origin özelliği servere talepte bulunmayı izin veren originin hangileri olduğunu belirtir.
// * değeri herhangi bir origine izin verildiğini gösterir.
public class ZuulEdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEdgeApplication.class, args);
	}

}
