package pb;

import com.unity3d.services.store.core.api.Store;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Integer f36888a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f36889b;

    public /* synthetic */ a(Integer num, String str) {
        this.f36888a = num;
        this.f36889b = str;
    }

    public final void run() {
        Store.storeMonitor.isFeatureSupported(this.f36888a.intValue(), this.f36889b, Store.storeEventListenerFactory.invoke());
    }
}
