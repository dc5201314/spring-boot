//package top.loader;
//
//import io.micrometer.common.lang.Nullable;
//import org.apache.logging.log4j.util.PropertiesPropertySource;
//import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.PropertySource;
//import org.springframework.core.io.support.DefaultPropertySourceFactory;
//import org.springframework.core.io.support.EncodedResource;
//
//import java.io.IOException;
//import java.util.Properties;
//
//@Configuration
//public class YamlPropertyLoader extends DefaultPropertySourceFactory {
//    @Override
//    public PropertySource<?> createPropertySource(@Nullable String name, EncodedResource resource) throws IOException {
//        String sourceName = name != null ? name : resource.getResource().getFilename();
//        if (sourceName != null && (sourceName.endsWith(".yml") || sourceName.endsWith(".yaml"))) {
//            Properties propertiesFromYaml = loadYml(resource);
//            //将YML配置转成Properties之后，再⽤PropertiesPropertySource绑定
////            return new PropertiesPropertySource(sourceName, propertiesFromYaml);
//              return new PropertiesPropertySource(sourceName, propertiesFromYaml);
//        } else {
//            return super.createPropertySource(name, resource);
//        }
//    }
//
//    // 将YML格式的配置转成Properties配置
//    private Properties loadYml(EncodedResource resource) throws IOException {
//        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
//        factory.setResources(resource.getResource());
//        factory.afterPropertiesSet();
//
//        Properties properties = factory.getObject();
//
//        if (properties == null) {
//            throw new IOException("无法加载YAML文件，返回的Properties对象为null");
//        }
//
//        return properties;
//    }
//}
