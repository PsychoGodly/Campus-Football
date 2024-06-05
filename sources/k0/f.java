package k0;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.h;
import androidx.emoji2.text.e;

/* compiled from: EmojiTextViewHelper */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f19534a;

    /* compiled from: EmojiTextViewHelper */
    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f19535a;

        /* renamed from: b  reason: collision with root package name */
        private final d f19536b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f19537c = true;

        a(TextView textView) {
            this.f19535a = textView;
            this.f19536b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            for (d dVar : inputFilterArr) {
                if (dVar == this.f19536b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f19536b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> e10 = e(inputFilterArr);
            if (e10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - e10.size())];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (e10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f19535a.setFilters(a(this.f19535a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new h(transformationMethod);
            }
            return transformationMethod;
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f19537c) {
                return f(inputFilterArr);
            }
            return d(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10) {
            if (z10) {
                j();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            this.f19537c = z10;
            j();
            i();
        }

        /* access modifiers changed from: package-private */
        public void g(boolean z10) {
            this.f19537c = z10;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            this.f19535a.setTransformationMethod(l(this.f19535a.getTransformationMethod()));
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod l(TransformationMethod transformationMethod) {
            if (this.f19537c) {
                return k(transformationMethod);
            }
            return h(transformationMethod);
        }
    }

    /* compiled from: EmojiTextViewHelper */
    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
        }
    }

    /* compiled from: EmojiTextViewHelper */
    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f19538a;

        c(TextView textView) {
            this.f19538a = new a(textView);
        }

        private boolean d() {
            return !e.h();
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (d()) {
                return inputFilterArr;
            }
            return this.f19538a.a(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10) {
            if (!d()) {
                this.f19538a.b(z10);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            if (d()) {
                this.f19538a.g(z10);
            } else {
                this.f19538a.c(z10);
            }
        }
    }

    public f(TextView textView, boolean z10) {
        h.g(textView, "textView cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f19534a = new b();
        } else if (!z10) {
            this.f19534a = new c(textView);
        } else {
            this.f19534a = new a(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f19534a.a(inputFilterArr);
    }

    public void b(boolean z10) {
        this.f19534a.b(z10);
    }

    public void c(boolean z10) {
        this.f19534a.c(z10);
    }
}
