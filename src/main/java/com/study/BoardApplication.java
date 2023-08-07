package com.study;

import com.study.config.MyBatisConfig;
import com.study.repository.BoardRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Import(MyBatisConfig.class)
@SpringBootApplication(scanBasePackages = "com.study.web")
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

//	@Bean
//	@Profile("local")
//	public TestDataInit testDataInit(BoardRepository boardRepository) {
//		return new TestDataInit(boardRepository);
//	}
}
