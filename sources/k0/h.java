package k0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.e;

/* compiled from: EmojiTransformationMethod */
class h implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    private final TransformationMethod f19546a;

    h(TransformationMethod transformationMethod) {
        this.f19546a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f19546a;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f19546a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || e.b().d() != 1) ? charSequence : e.b().o(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f19546a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
