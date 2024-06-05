package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.p;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f33784a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.e f33785b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f33786c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33787d;

    public /* synthetic */ d(i iVar, p.e eVar, String str, TaskCompletionSource taskCompletionSource) {
        this.f33784a = iVar;
        this.f33785b = eVar;
        this.f33786c = str;
        this.f33787d = taskCompletionSource;
    }

    public final void run() {
        this.f33784a.s(this.f33785b, this.f33786c, this.f33787d);
    }
}
