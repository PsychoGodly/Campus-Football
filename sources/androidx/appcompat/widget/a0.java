package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.h;

/* compiled from: AppCompatTextClassifierHelper */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1490a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f1491b;

    /* compiled from: AppCompatTextClassifierHelper */
    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    a0(TextView textView) {
        this.f1490a = (TextView) h.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1491b;
        return textClassifier == null ? a.a(this.f1490a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1491b = textClassifier;
    }
}
