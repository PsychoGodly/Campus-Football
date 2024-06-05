package u3;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: FullSegmentEncryptionKeyCache */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f22852a;

    /* compiled from: FullSegmentEncryptionKeyCache */
    class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f22853a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f22853a = i11;
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f22853a;
        }
    }

    public e(int i10) {
        this.f22852a = new a(this, i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f22852a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f22852a.put((Uri) k4.a.e(uri), (byte[]) k4.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f22852a.remove(k4.a.e(uri));
    }
}
