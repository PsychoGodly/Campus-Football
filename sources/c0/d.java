package c0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f5568a;

    /* compiled from: InputContentInfoCompat */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f5570a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f5571b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f5572c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f5570a = uri;
            this.f5571b = clipDescription;
            this.f5572c = uri2;
        }

        public Uri a() {
            return this.f5570a;
        }

        public void b() {
        }

        public Uri c() {
            return this.f5572c;
        }

        public Object d() {
            return null;
        }

        public ClipDescription getDescription() {
            return this.f5571b;
        }
    }

    /* compiled from: InputContentInfoCompat */
    private interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f5568a = new a(uri, clipDescription, uri2);
        } else {
            this.f5568a = new b(uri, clipDescription, uri2);
        }
    }

    public static d f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new d(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f5568a.a();
    }

    public ClipDescription b() {
        return this.f5568a.getDescription();
    }

    public Uri c() {
        return this.f5568a.c();
    }

    public void d() {
        this.f5568a.b();
    }

    public Object e() {
        return this.f5568a.d();
    }

    /* compiled from: InputContentInfoCompat */
    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f5569a;

        a(Object obj) {
            this.f5569a = (InputContentInfo) obj;
        }

        public Uri a() {
            return this.f5569a.getContentUri();
        }

        public void b() {
            this.f5569a.requestPermission();
        }

        public Uri c() {
            return this.f5569a.getLinkUri();
        }

        public Object d() {
            return this.f5569a;
        }

        public ClipDescription getDescription() {
            return this.f5569a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f5569a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private d(c cVar) {
        this.f5568a = cVar;
    }
}
