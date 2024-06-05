package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f498a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f499b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f500c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f501d;

    /* renamed from: f  reason: collision with root package name */
    private final Bitmap f502f;

    /* renamed from: g  reason: collision with root package name */
    private final Uri f503g;

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f504h;

    /* renamed from: i  reason: collision with root package name */
    private final Uri f505i;

    /* renamed from: j  reason: collision with root package name */
    private MediaDescription f506j;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f507a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f508b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f509c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f510d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f511e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f512f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f513g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f514h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f507a, this.f508b, this.f509c, this.f510d, this.f511e, this.f512f, this.f513g, this.f514h);
        }

        public d b(CharSequence charSequence) {
            this.f510d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f513g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f511e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f512f = uri;
            return this;
        }

        public d f(String str) {
            this.f507a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f514h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f509c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f508b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f498a = str;
        this.f499b = charSequence;
        this.f500c = charSequence2;
        this.f501d = charSequence3;
        this.f502f = bitmap;
        this.f503g = uri;
        this.f504h = bundle;
        this.f505i = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0083
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0083
            android.support.v4.media.MediaDescriptionCompat$d r2 = new android.support.v4.media.MediaDescriptionCompat$d
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.b.g(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.i(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.h(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.c(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.MediaDescriptionCompat.b.e(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.MediaDescriptionCompat.b.f(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.MediaDescriptionCompat.b.d(r9)
            if (r3 == 0) goto L_0x0044
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.u(r3)
        L_0x0044:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0050
        L_0x004f:
            r5 = r0
        L_0x0050:
            if (r5 == 0) goto L_0x0068
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0062
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0068:
            r0 = r3
        L_0x0069:
            r2.c(r0)
            if (r5 == 0) goto L_0x0072
            r2.g(r5)
            goto L_0x007d
        L_0x0072:
            r0 = 23
            if (r1 < r0) goto L_0x007d
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r9)
            r2.g(r0)
        L_0x007d:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f506j = r9
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public CharSequence c() {
        return this.f501d;
    }

    public Bundle d() {
        return this.f504h;
    }

    public int describeContents() {
        return 0;
    }

    public Bitmap e() {
        return this.f502f;
    }

    public Uri g() {
        return this.f503g;
    }

    public Object h() {
        int i10;
        Bundle bundle;
        MediaDescription mediaDescription = this.f506j;
        if (mediaDescription != null || (i10 = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder b10 = b.b();
        b.n(b10, this.f498a);
        b.p(b10, this.f499b);
        b.o(b10, this.f500c);
        b.j(b10, this.f501d);
        b.l(b10, this.f502f);
        b.m(b10, this.f503g);
        if (i10 >= 23 || this.f505i == null) {
            b.k(b10, this.f504h);
        } else {
            if (this.f504h == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(this.f504h);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f505i);
            b.k(b10, bundle);
        }
        if (i10 >= 23) {
            c.b(b10, this.f505i);
        }
        MediaDescription a10 = b.a(b10);
        this.f506j = a10;
        return a10;
    }

    public String i() {
        return this.f498a;
    }

    public Uri j() {
        return this.f505i;
    }

    public CharSequence k() {
        return this.f500c;
    }

    public CharSequence l() {
        return this.f499b;
    }

    public String toString() {
        return this.f499b + ", " + this.f500c + ", " + this.f501d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f498a);
            TextUtils.writeToParcel(this.f499b, parcel, i10);
            TextUtils.writeToParcel(this.f500c, parcel, i10);
            TextUtils.writeToParcel(this.f501d, parcel, i10);
            parcel.writeParcelable(this.f502f, i10);
            parcel.writeParcelable(this.f503g, i10);
            parcel.writeBundle(this.f504h);
            parcel.writeParcelable(this.f505i, i10);
            return;
        }
        ((MediaDescription) h()).writeToParcel(parcel, i10);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f498a = parcel.readString();
        this.f499b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f500c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f501d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f502f = (Bitmap) parcel.readParcelable(classLoader);
        this.f503g = (Uri) parcel.readParcelable(classLoader);
        this.f504h = parcel.readBundle(classLoader);
        this.f505i = (Uri) parcel.readParcelable(classLoader);
    }
}
