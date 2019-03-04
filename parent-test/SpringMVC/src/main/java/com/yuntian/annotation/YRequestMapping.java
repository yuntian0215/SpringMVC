package com.yuntian.annotation;

import java.lang.annotation.*;

/**
 * Package: com.yuntian.annotation
 * <p>
 * Description： TODO
 * <p>
 * Author: lvjie
 * <p>
 * Date: Created in 2019/3/4/0004 9:09
 * <p>
 * Version: 0.0.1
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface YRequestMapping {
    String value() default "";
}
