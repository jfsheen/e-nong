package cc.aisc.web;

import cc.aisc.dao.DaoApplication;
import cc.aisc.model.ModelApplication;
import cc.aisc.service.ServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 * Created by sjf on 15-10-25.
 */
@SpringBootApplication
@Import(value = {ModelApplication.class, DaoApplication.class, ServiceApplication.class})
public class WebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
    }
}

