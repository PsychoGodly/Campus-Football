package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import x5.e;
import x5.i;

/* compiled from: PasswordToggleEndIconDelegate */
class h extends e {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f25997d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.f f25998e = new b();

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.g f25999f = new c();

    /* compiled from: PasswordToggleEndIconDelegate */
    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            h hVar = h.this;
            hVar.f25970c.setChecked(!hVar.f());
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    class b implements TextInputLayout.f {
        b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            h hVar = h.this;
            hVar.f25970c.setChecked(!hVar.f());
            editText.removeTextChangedListener(h.this.f25997d);
            editText.addTextChangedListener(h.this.f25997d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    class c implements TextInputLayout.g {
        c() {
        }

        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            EditText editText = h.this.f25968a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (h.this.f()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    public boolean f() {
        EditText editText = this.f25968a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f25968a.setEndIconDrawable(i.a.b(this.f25969b, e.design_password_eye));
        TextInputLayout textInputLayout = this.f25968a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.password_toggle_content_description));
        this.f25968a.setEndIconOnClickListener(new d());
        this.f25968a.c(this.f25998e);
        this.f25968a.d(this.f25999f);
    }
}
