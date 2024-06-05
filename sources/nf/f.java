package nf;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import vn.hunghd.flutterdownloader.DownloadWorker;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f36564a = new f();

    private /* synthetic */ f() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return DownloadWorker.e(str, sSLSession);
    }
}
