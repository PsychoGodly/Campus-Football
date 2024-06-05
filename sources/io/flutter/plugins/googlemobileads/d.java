package io.flutter.plugins.googlemobileads;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import io.flutter.plugin.platform.f;
import java.util.Collections;
import n4.h;
import o4.b;

/* compiled from: FluidAdManagerBannerAd */
final class d extends j {

    /* renamed from: h  reason: collision with root package name */
    private ViewGroup f33944h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f33945i = -1;

    /* compiled from: FluidAdManagerBannerAd */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight != d.this.f33945i) {
                d dVar = d.this;
                dVar.f34013b.s(dVar.f33956a, measuredHeight);
            }
            int unused = d.this.f33945i = measuredHeight;
        }
    }

    d(int i10, a aVar, String str, i iVar, c cVar) {
        super(i10, aVar, str, Collections.singletonList(new m(h.f20934p)), iVar, cVar);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        b bVar = this.f34018g;
        if (bVar != null) {
            bVar.a();
            this.f34018g = null;
        }
        ViewGroup viewGroup = this.f33944h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f33944h = null;
        }
    }

    /* access modifiers changed from: package-private */
    public f b() {
        if (this.f34018g == null) {
            return null;
        }
        ViewGroup viewGroup = this.f33944h;
        if (viewGroup != null) {
            return new b0(viewGroup);
        }
        ScrollView g10 = g();
        if (g10 == null) {
            return null;
        }
        g10.setClipChildren(false);
        g10.setVerticalScrollBarEnabled(false);
        g10.setHorizontalScrollBarEnabled(false);
        this.f33944h = g10;
        g10.addView(this.f34018g);
        return new b0(this.f34018g);
    }

    /* access modifiers changed from: package-private */
    public ScrollView g() {
        if (this.f34013b.f() != null) {
            return new ScrollView(this.f34013b.f());
        }
        Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
        return null;
    }

    public void onAdLoaded() {
        b bVar = this.f34018g;
        if (bVar != null) {
            bVar.addOnLayoutChangeListener(new a());
            this.f34013b.m(this.f33956a, this.f34018g.getResponseInfo());
        }
    }
}
