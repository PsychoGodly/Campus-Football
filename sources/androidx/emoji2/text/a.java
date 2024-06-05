package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3328a;

    public /* synthetic */ a(String str) {
        this.f3328a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return b.c(this.f3328a, runnable);
    }
}
