package nf;

import java.util.List;
import vn.hunghd.flutterdownloader.DownloadWorker;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DownloadWorker f36562a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f36563b;

    public /* synthetic */ e(DownloadWorker downloadWorker, List list) {
        this.f36562a = downloadWorker;
        this.f36563b = list;
    }

    public final void run() {
        DownloadWorker.w(this.f36562a, this.f36563b);
    }
}
