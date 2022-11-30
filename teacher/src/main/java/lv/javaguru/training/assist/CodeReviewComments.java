package lv.javaguru.training.assist;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.TYPE,
		ElementType.FIELD,
		ElementType.METHOD,
		ElementType.CONSTRUCTOR,
		ElementType.LOCAL_VARIABLE,
		ElementType.PARAMETER
})
public @interface CodeReviewComments {

	CodeReviewComment[] value();

}
