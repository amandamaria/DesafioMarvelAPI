package com.restapi.marvel.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket marvelRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.restapi.marvel"))
				.paths(PathSelectors.regex("/v1/public.*"))
				.build()
				.apiInfo(metaInfo());		
	}

	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Marvel REST API",
				"The Marvel Comics API is a RESTful service which provides methods for accessing specific resources at canonical URLs and for searching and filtering sets of resources by various criteria. All representations are encoded as JSON objects",
				"1.0",
				"Termos",
				new Contact("© MARVEL", "https://developer.marvel.com/", ""), 
				"© MARVEL",
				"", 
				new ArrayList<VendorExtension>()
				);
		return apiInfo;
	}
	
}
