package nf;

import android.content.Context;
import vn.hunghd.flutterdownloader.DownloadWorker;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DownloadWorker f36560a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f36561b;

    public /* synthetic */ d(DownloadWorker downloadWorker, Context context) {
        this.f36560a = downloadWorker;
        this.f36561b = context;
    }

    public final void run() {
        DownloadWorker.g(this.f36560a, this.f36561b);
    }
}
