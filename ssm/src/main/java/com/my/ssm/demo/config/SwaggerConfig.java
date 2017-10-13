package com.my.ssm.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

/**
 * 修改swagger/index.html文件，默认是从连接http://petstore.swagger.io/v2/swagger.json获取 API 的 JSON，
 * 这里需要将url值修改为http://{ip}:{port}/{projectName}/api-docs的形式
 * swagger-ui 地址：https://github.com/swagger-api/swagger-ui/tree/v2.1.4
 * 须保证swagger-ui和swagger-core的大版本一致，否则ui无法显示api信息
 * @author Administrator
 * @URL http://{ip}:{port}/{projectName}/swagger/index.html
 */
@WebAppConfiguration
@EnableSwagger
@ComponentScan(basePackages="com.my.ssm.demo.controller")
public class SwaggerConfig {
	private SpringSwaggerConfig springSwaggerConfig;

    /**
     * Required to autowire SpringSwaggerConfig
     */
    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig)
    {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    /**
     * Every SwaggerSpringMvcPlugin bean is picked up by the swagger-mvc
     * framework - allowing for multiple swagger groups i.e. same code base
     * multiple swagger resource listings.
     */
    @Bean
    public SwaggerSpringMvcPlugin customImplementation()
    {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(apiInfo())
                .includePatterns(".*?");
    }

    private ApiInfo apiInfo()
    {
        ApiInfo apiInfo = new ApiInfo(
                "ssm测试项目API",
                "这是个小小的测试",
                "http://localhost:9090/ssm",
                "zsxneil@qq.com",
                "myself",
                "no");
        return apiInfo;
    }
}
