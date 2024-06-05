package le;

import java.util.List;
import java.util.Map;

/* compiled from: KCallable.kt */
public interface b<R> extends a {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    List<Object> getParameters();

    j getReturnType();

    List<Object> getTypeParameters();

    k getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
