package cc.aisc.service;

import cc.aisc.dao.DaoApplication;
import cc.aisc.model.ModelApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by sjf on 15-10-25.
 */
@SpringBootApplication
@Import(value = {ModelApplication.class, DaoApplication.class})
public class ServiceApplication {
}
