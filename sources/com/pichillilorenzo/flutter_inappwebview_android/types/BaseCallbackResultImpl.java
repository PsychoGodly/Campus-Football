package com.pichillilorenzo.flutter_inappwebview_android.types;

public class BaseCallbackResultImpl<T> implements ICallbackResult<T> {
    public T decodeResult(Object obj) {
        return null;
    }

    public void defaultBehaviour(T t10) {
    }

    public void error(String str, String str2, Object obj) {
    }

    public boolean nonNullSuccess(T t10) {
        return true;
    }

    public void notImplemented() {
        defaultBehaviour((Object) null);
    }

    public boolean nullSuccess() {
        return true;
    }

    public void success(Object obj) {
        boolean z10;
        Object decodeResult = decodeResult(obj);
        if (decodeResult == null) {
            z10 = nullSuccess();
        } else {
            z10 = nonNullSuccess(decodeResult);
        }
        if (z10) {
            defaultBehaviour(decodeResult);
        }
    }
}
