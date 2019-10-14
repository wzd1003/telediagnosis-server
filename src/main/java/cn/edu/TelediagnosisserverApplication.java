package cn.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("cn.edu.mapper")
@EnableCaching
public class TelediagnosisserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelediagnosisserverApplication.class, args);
	}
}
