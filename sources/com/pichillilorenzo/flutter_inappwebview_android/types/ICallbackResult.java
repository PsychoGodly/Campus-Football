package com.pichillilorenzo.flutter_inappwebview_android.types;

import lc.k;

public interface ICallbackResult<T> extends k.d {
    T decodeResult(Object obj);

    void defaultBehaviour(T t10);

    /* synthetic */ void error(String str, String str2, Object obj);

    boolean nonNullSuccess(T t10);

    /* synthetic */ void notImplemented();

    boolean nullSuccess();

    /* synthetic */ void success(Object obj);
}
