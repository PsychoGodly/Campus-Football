package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinSdkUtils;

public class br {

    /* renamed from: a  reason: collision with root package name */
    private final k f6788a;

    /* renamed from: b  reason: collision with root package name */
    private final t f6789b;

    /* renamed from: c  reason: collision with root package name */
    private final View f6790c;

    public br(View view, k kVar) {
        this.f6788a = kVar;
        this.f6789b = kVar.L();
        this.f6790c = view;
    }

    public long a(ie ieVar) {
        if (t.a()) {
            this.f6789b.a("ViewabilityTracker", "Checking visibility...");
        }
        long j10 = 0;
        Point b10 = x3.b(this.f6790c.getContext());
        if (!this.f6790c.isShown()) {
            if (t.a()) {
                this.f6789b.b("ViewabilityTracker", "View is hidden");
            }
            j10 = 2;
        }
        if (this.f6790c.getAlpha() < ieVar.c0()) {
            if (t.a()) {
                this.f6789b.b("ViewabilityTracker", "View is transparent");
            }
            j10 |= 4;
        }
        Animation animation = this.f6790c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (t.a()) {
                this.f6789b.b("ViewabilityTracker", "View is animating");
            }
            j10 |= 8;
        }
        if (this.f6790c.getParent() == null) {
            if (t.a()) {
                this.f6789b.b("ViewabilityTracker", "No parent view found");
            }
            j10 |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f6790c.getContext(), this.f6790c.getWidth());
        if (pxToDp < Math.min(ieVar.i0(), b10.x)) {
            if (t.a()) {
                t tVar = this.f6789b;
                tVar.b("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j10 |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f6790c.getContext(), this.f6790c.getHeight());
        if (pxToDp2 < ieVar.e0()) {
            if (t.a()) {
                t tVar2 = this.f6789b;
                tVar2.b("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j10 |= 64;
        }
        Rect rect = new Rect(0, 0, b10.x, b10.y);
        int[] iArr = {-1, -1};
        this.f6790c.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect2 = new Rect(i10, iArr[1], this.f6790c.getWidth() + i10, iArr[1] + this.f6790c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (t.a()) {
                t tVar3 = this.f6789b;
                tVar3.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j10 |= 128;
        }
        Activity b11 = this.f6788a.e().b();
        if (b11 != null && !ar.a(this.f6790c, b11)) {
            if (t.a()) {
                this.f6789b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j10 |= 256;
        }
        if (t.a()) {
            t tVar4 = this.f6789b;
            tVar4.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j10));
        }
        return j10;
    }
}
