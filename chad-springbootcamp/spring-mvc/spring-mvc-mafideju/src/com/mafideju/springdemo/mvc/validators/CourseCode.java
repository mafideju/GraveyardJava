package com.mafideju.springdemo.mvc.validators;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String value() default "PROG";
	public String message() default "Deve começar com PROG";
	public Class<?>[] groups() default {};
	public Class <? extends Payload>[] payload() default {};
}
