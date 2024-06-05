package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.d;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import java.util.Calendar;
import x5.f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f25598a;

    class a extends androidx.core.view.a {
        a() {
        }

        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.Z((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().h());
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    /* renamed from: b */
    public m getAdapter() {
        return (m) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m b10 = getAdapter();
        d<?> dVar = b10.f25688b;
        c cVar = b10.f25689c;
        Long c10 = b10.getItem(b10.b());
        Long c11 = b10.getItem(b10.h());
        for (d next : dVar.E()) {
            F f10 = next.f3080a;
            if (f10 != null) {
                if (next.f3081b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f10).longValue();
                    long longValue2 = ((Long) next.f3081b).longValue();
                    if (!d(c10, c11, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < c10.longValue()) {
                            i11 = b10.b();
                            if (b10.f(i11)) {
                                i10 = 0;
                            } else {
                                i10 = materialCalendarGridView.getChildAt(i11 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.f25598a.setTimeInMillis(longValue);
                            i11 = b10.a(materialCalendarGridView.f25598a.get(5));
                            i10 = c(materialCalendarGridView.getChildAt(i11));
                        }
                        if (longValue2 > c11.longValue()) {
                            i13 = b10.h();
                            if (b10.g(i13)) {
                                i12 = getWidth();
                            } else {
                                i12 = materialCalendarGridView.getChildAt(i13).getRight();
                            }
                        } else {
                            materialCalendarGridView.f25598a.setTimeInMillis(longValue2);
                            i13 = b10.a(materialCalendarGridView.f25598a.get(5));
                            i12 = c(materialCalendarGridView.getChildAt(i13));
                        }
                        int itemId = (int) b10.getItemId(i11);
                        int itemId2 = (int) b10.getItemId(i13);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i11 ? 0 : i10), (float) (childAt.getTop() + cVar.f25618a.c()), (float) (i13 > numColumns2 ? getWidth() : i12), (float) (childAt.getBottom() - cVar.f25618a.b()), cVar.f25625h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25598a = r.k();
        if (i.j2(getContext())) {
            setNextFocusLeftId(f.cancel_button);
            setNextFocusRightId(f.confirm_button);
        }
        a0.n0(this, new a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof m) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()}));
        }
    }
}
