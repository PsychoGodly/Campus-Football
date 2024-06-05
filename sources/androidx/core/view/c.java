package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.h;
import com.applovin.mediation.MaxReward;
import java.util.Objects;

/* compiled from: ContentInfoCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final f f3157a;

    /* compiled from: ContentInfoCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C0048c f3158a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3158a = new b(clipData, i10);
            } else {
                this.f3158a = new d(clipData, i10);
            }
        }

        public c a() {
            return this.f3158a.build();
        }

        public a b(Bundle bundle) {
            this.f3158a.b(bundle);
            return this;
        }

        public a c(int i10) {
            this.f3158a.a(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f3158a.c(uri);
            return this;
        }
    }

    /* compiled from: ContentInfoCompat */
    private static final class b implements C0048c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f3159a;

        b(ClipData clipData, int i10) {
            this.f3159a = new ContentInfo.Builder(clipData, i10);
        }

        public void a(int i10) {
            this.f3159a.setFlags(i10);
        }

        public void b(Bundle bundle) {
            this.f3159a.setExtras(bundle);
        }

        public c build() {
            return new c(new e(this.f3159a.build()));
        }

        public void c(Uri uri) {
            this.f3159a.setLinkUri(uri);
        }
    }

    /* renamed from: androidx.core.view.c$c  reason: collision with other inner class name */
    /* compiled from: ContentInfoCompat */
    private interface C0048c {
        void a(int i10);

        void b(Bundle bundle);

        c build();

        void c(Uri uri);
    }

    /* compiled from: ContentInfoCompat */
    private static final class d implements C0048c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f3160a;

        /* renamed from: b  reason: collision with root package name */
        int f3161b;

        /* renamed from: c  reason: collision with root package name */
        int f3162c;

        /* renamed from: d  reason: collision with root package name */
        Uri f3163d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f3164e;

        d(ClipData clipData, int i10) {
            this.f3160a = clipData;
            this.f3161b = i10;
        }

        public void a(int i10) {
            this.f3162c = i10;
        }

        public void b(Bundle bundle) {
            this.f3164e = bundle;
        }

        public c build() {
            return new c(new g(this));
        }

        public void c(Uri uri) {
            this.f3163d = uri;
        }
    }

    /* compiled from: ContentInfoCompat */
    private static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f3165a;

        e(ContentInfo contentInfo) {
            this.f3165a = (ContentInfo) h.f(contentInfo);
        }

        public ClipData a() {
            return this.f3165a.getClip();
        }

        public ContentInfo b() {
            return this.f3165a;
        }

        public int c() {
            return this.f3165a.getSource();
        }

        public int j() {
            return this.f3165a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3165a + "}";
        }
    }

    /* compiled from: ContentInfoCompat */
    private interface f {
        ClipData a();

        ContentInfo b();

        int c();

        int j();
    }

    /* compiled from: ContentInfoCompat */
    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f3166a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3167b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3168c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f3169d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f3170e;

        g(d dVar) {
            this.f3166a = (ClipData) h.f(dVar.f3160a);
            this.f3167b = h.b(dVar.f3161b, 0, 5, "source");
            this.f3168c = h.e(dVar.f3162c, 1);
            this.f3169d = dVar.f3163d;
            this.f3170e = dVar.f3164e;
        }

        public ClipData a() {
            return this.f3166a;
        }

        public ContentInfo b() {
            return null;
        }

        public int c() {
            return this.f3167b;
        }

        public int j() {
            return this.f3168c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f3166a.getDescription());
            sb2.append(", source=");
            sb2.append(c.e(this.f3167b));
            sb2.append(", flags=");
            sb2.append(c.a(this.f3168c));
            Uri uri = this.f3169d;
            String str2 = MaxReward.DEFAULT_LABEL;
            if (uri == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f3169d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f3170e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    c(f fVar) {
        this.f3157a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 != 4) {
            return i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f3157a.a();
    }

    public int c() {
        return this.f3157a.j();
    }

    public int d() {
        return this.f3157a.c();
    }

    public ContentInfo f() {
        ContentInfo b10 = this.f3157a.b();
        Objects.requireNonNull(b10);
        ContentInfo contentInfo = b10;
        return b10;
    }

    public String toString() {
        return this.f3157a.toString();
    }
}
