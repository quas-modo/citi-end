package org.huaqi.usercenter.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author whm
 * @date 2024/1/21 15:46
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("花旗杯后端用户中心")
                        .description("花旗杯后端用户中心API文档")
                        .version("v1")
                        .license(new License().name("MIT").url("https://opensource.org/licenses/MIT")));
    }
}
