package cn.loc.beans;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata){
        //字符串必须是类的完整限定名 getBean不能根据名字获取，但是要根据类型获取
        //字符串可以注册多个Bean
        return new String[]{"cn.loc.beans.Person",Wife.class.getName()};
    }
}
