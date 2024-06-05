package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.o;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;

public class CheckableImageButton extends o implements Checkable {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f25790h = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f25791d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25792f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f25793g;

    class a extends androidx.core.view.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.V(CheckableImageButton.this.a());
            cVar.W(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends e0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f25795c;

        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void d(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f25795c = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f25795c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            d(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.C);
    }

    public boolean a() {
        return this.f25792f;
    }

    public boolean isChecked() {
        return this.f25791d;
    }

    public int[] onCreateDrawableState(int i10) {
        if (!this.f25791d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f25790h;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.c());
        setChecked(bVar.f25795c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f25795c = this.f25791d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f25792f != z10) {
            this.f25792f = z10;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z10) {
        if (this.f25792f && this.f25791d != z10) {
            this.f25791d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f25793g = z10;
    }

    public void setPressed(boolean z10) {
        if (this.f25793g) {
            super.setPressed(z10);
        }
    }

    public void toggle() {
        setChecked(!this.f25791d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25792f = true;
        this.f25793g = true;
        a0.n0(this, new a());
    }
}
