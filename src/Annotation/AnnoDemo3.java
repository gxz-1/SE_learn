package Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 元注解：用于表述注解的注解 
 * @target:描述注解能作用的位置
 * 		ElementType.TYPE   表示作用于类
 * 		ElementType.METHOD 表示作用于方法
 * 		ElementType.FIELD  表示作用于属性	
 * @Retention:描述注解被保留的的阶段
 * 		RetentionPolicy.RUNTIME 表示被描述的注解会保留到Class字节码文件中并被JVM读取到
 * 		RetentionPolicy.CLASS   表示被描述的注解会保留到Class字节码文件中,但不被JVM读取到
 * 		RetentionPolicy.SOURCE  表示被描述的注解不会保留到Class字节码文件中
 * @documented:描述注解是否被抽取到api文档中
 * @inherited:描述注解是否被子类继承
 */

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnoDemo3{
	
}