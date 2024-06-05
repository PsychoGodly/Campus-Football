package androidx.lifecycle;

import androidx.lifecycle.i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: OnLifecycleEvent */
public @interface y {
    i.a value();
}
