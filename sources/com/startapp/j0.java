package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.startapp.b1;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.banner3d.Banner3DView;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class j0 implements b1.b, Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public AdDetails f15936a;

    /* renamed from: b  reason: collision with root package name */
    public Point f15937b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f15938c = null;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f15939d = null;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f15940e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public TrackingParams f15941f;

    /* renamed from: g  reason: collision with root package name */
    public k7 f15942g = null;

    /* renamed from: h  reason: collision with root package name */
    public Banner3DView f15943h = null;

    /* compiled from: Sta */
    public class a implements Parcelable.Creator<j0> {
        public Object createFromParcel(Parcel parcel) {
            return new j0(parcel);
        }

        public Object[] newArray(int i10) {
            return new j0[i10];
        }
    }

    public j0(Context context, ViewGroup viewGroup, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f15936a = adDetails;
        this.f15941f = trackingParams;
        a(context, bannerOptions, viewGroup);
    }

    public void a(Context context, BannerOptions bannerOptions, ViewGroup viewGroup) {
        int a10 = i0.a(context, 1, (float) (bannerOptions.d() - 5));
        this.f15937b = new Point((int) (bannerOptions.p() * ((float) i0.a(context, 1, (float) bannerOptions.o()))), (int) (bannerOptions.e() * ((float) i0.a(context, 1, (float) bannerOptions.d()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.o(), bannerOptions.d()));
        this.f15943h = banner3DView;
        banner3DView.setText(this.f15936a.t());
        this.f15943h.setRating(this.f15936a.q());
        this.f15943h.setDescription(this.f15936a.i());
        this.f15943h.setButtonText(this.f15936a.z());
        Bitmap bitmap = this.f15938c;
        if (bitmap != null) {
            this.f15943h.setImage(bitmap, a10, a10);
        } else {
            this.f15943h.setImage(17301651, a10, a10);
            new b1(context, this.f15936a.j(), this, 0).a();
        }
        Point point = this.f15937b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        viewGroup.addView(this.f15943h, layoutParams);
        this.f15943h.setVisibility(8);
        a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f15936a, i10);
        parcel.writeInt(this.f15937b.x);
        parcel.writeInt(this.f15937b.y);
        parcel.writeParcelable(this.f15938c, i10);
        parcel.writeBooleanArray(new boolean[]{this.f15940e.get()});
        parcel.writeSerializable(this.f15941f);
    }

    public j0(Parcel parcel) {
        this.f15936a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f15937b = point;
        point.x = parcel.readInt();
        this.f15937b.y = parcel.readInt();
        this.f15938c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f15940e.set(zArr[0]);
        this.f15941f = (TrackingParams) parcel.readSerializable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        r1 = r4.f15937b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            com.startapp.sdk.ads.banner.banner3d.Banner3DView r0 = r4.f15943h
            if (r0 == 0) goto L_0x000d
            android.graphics.Bitmap r0 = a(r0)     // Catch:{ OutOfMemoryError -> 0x000d, all -> 0x0009 }
            goto L_0x000e
        L_0x0009:
            r0 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r0)
        L_0x000d:
            r0 = 0
        L_0x000e:
            r4.f15939d = r0
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            android.graphics.Point r1 = r4.f15937b
            int r2 = r1.x
            if (r2 <= 0) goto L_0x0024
            int r1 = r1.y
            if (r1 <= 0) goto L_0x0024
            r3 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r2, r1, r3)
            r4.f15939d = r0
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.j0.a():void");
    }

    public static Bitmap a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return createBitmap;
    }

    public void a(Bitmap bitmap, int i10) {
        Banner3DView banner3DView;
        if (bitmap != null && (banner3DView = this.f15943h) != null) {
            this.f15938c = bitmap;
            banner3DView.setImage(bitmap);
            a();
        }
    }
}
