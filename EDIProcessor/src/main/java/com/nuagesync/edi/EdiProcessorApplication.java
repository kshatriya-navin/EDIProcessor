package com.nuagesync.edi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.nuagesync.edi.file.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class EdiProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdiProcessorApplication.class, args);
	}

}
