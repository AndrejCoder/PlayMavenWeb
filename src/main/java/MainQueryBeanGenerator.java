import org.avaje.ebean.typequery.generator.Generator;
import org.avaje.ebean.typequery.generator.GeneratorConfig;

import java.io.IOException;

public class MainQueryBeanGenerator {

    public static void main(String[] args) throws IOException {
        GeneratorConfig config = new GeneratorConfig();
        config.setEntityBeanPackage("ru.lanit.models");

        Generator generator = new Generator(config);
        generator.generateQueryBeans();
    }
}
