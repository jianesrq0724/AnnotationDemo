package com.ruiqin.processor;

import com.google.auto.service.AutoService;
import com.ruiqin.annotation.Test;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/3/6
 */

@AutoService(Processor.class)
//@SupportedOptions(KEY_MODULE_NAME)
//@SupportedSourceVersion(SourceVersion.RELEASE_7)
//@SupportedAnnotationTypes({ANNOTATION_TYPE_ROUTE, ANNOTATION_TYPE_AUTOWIRED})
public class TestProcessor extends AbstractProcessor {

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        // 规定需要处理的注解
        return Collections.singleton(Test.class.getCanonicalName());
    }


    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        //生成方法
        MethodSpec main2 = MethodSpec.methodBuilder("test")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(String.class)
                .addStatement("$T.out.println($S)", System.class, "Hello, Ruiqin")
                .addStatement("return $S", "3")
                .build();

        //生成方法
        MethodSpec main = MethodSpec.methodBuilder("main")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(void.class)
                .addParameter(String[].class, "args")
                .addStatement("$T.out.println($S)", System.class, "Hello, JavaPoet!")
                .build();

        MethodSpec main3 = MethodSpec.methodBuilder("main3")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addCode("int total = 0;\n" +
                        "for ( int i = 0; i < 10; i++ ){\n" +
                        "  total += i; \n" +
                        "}\n")
                .build();

        //生成类
        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addMethod(main2)
                .addMethod(main)
                .addMethod(main3)
                .build();

        //创建包下面的文件
        JavaFile javaFile = JavaFile.builder("com.example.helloworld", helloWorld)
                .build();

        try {
            javaFile.writeTo(processingEnv.getFiler());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }
}
