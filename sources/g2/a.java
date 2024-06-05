package g2;

import java.lang.Throwable;

/* compiled from: Function */
public interface a<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput) throws Throwable;
}
