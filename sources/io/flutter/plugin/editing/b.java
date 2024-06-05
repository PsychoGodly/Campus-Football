package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kc.q;

/* compiled from: InputConnectionAdaptor */
public class b extends BaseInputConnection implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final View f33611a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33612b;

    /* renamed from: c  reason: collision with root package name */
    private final q f33613c;

    /* renamed from: d  reason: collision with root package name */
    private final c f33614d;

    /* renamed from: e  reason: collision with root package name */
    private final EditorInfo f33615e;

    /* renamed from: f  reason: collision with root package name */
    private ExtractedTextRequest f33616f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f33617g;

    /* renamed from: h  reason: collision with root package name */
    private CursorAnchorInfo.Builder f33618h;

    /* renamed from: i  reason: collision with root package name */
    private ExtractedText f33619i;

    /* renamed from: j  reason: collision with root package name */
    private InputMethodManager f33620j;

    /* renamed from: k  reason: collision with root package name */
    private final Layout f33621k;

    /* renamed from: l  reason: collision with root package name */
    private a f33622l;

    /* renamed from: m  reason: collision with root package name */
    private final a f33623m;

    /* renamed from: n  reason: collision with root package name */
    private int f33624n;

    /* compiled from: InputConnectionAdaptor */
    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public b(View view, int i10, q qVar, a aVar, c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f33617g = false;
        this.f33619i = new ExtractedText();
        this.f33624n = 0;
        this.f33611a = view;
        this.f33612b = i10;
        this.f33613c = qVar;
        this.f33614d = cVar;
        cVar.a(this);
        this.f33615e = editorInfo;
        this.f33623m = aVar;
        this.f33622l = new a(flutterJNI);
        this.f33621k = new DynamicLayout(cVar, new TextPaint(), a.e.API_PRIORITY_OTHER, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f33620j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int i10) {
        if (i10 == 16908319) {
            setSelection(0, this.f33614d.length());
            return true;
        } else if (i10 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f33614d);
            int selectionEnd = Selection.getSelectionEnd(this.f33614d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f33611a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f33614d.subSequence(min, max)));
                this.f33614d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i10 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f33614d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f33614d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f33611a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f33614d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i10 != 16908322) {
            return false;
        } else {
            ClipData primaryClip = ((ClipboardManager) this.f33611a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f33611a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f33614d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f33614d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f33614d.delete(min2, max4);
                }
                this.f33614d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        }
    }

    private CursorAnchorInfo c() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        CursorAnchorInfo.Builder builder = this.f33618h;
        if (builder == null) {
            this.f33618h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f33618h.setSelectionRange(this.f33614d.i(), this.f33614d.h());
        int g10 = this.f33614d.g();
        int f10 = this.f33614d.f();
        if (g10 < 0 || f10 <= g10) {
            this.f33618h.setComposingText(-1, MaxReward.DEFAULT_LABEL);
        } else {
            this.f33618h.setComposingText(g10, this.f33614d.toString().subSequence(g10, f10));
        }
        return this.f33618h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        CharSequence charSequence;
        ExtractedText extractedText = this.f33619i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f33614d.i();
        this.f33619i.selectionEnd = this.f33614d.h();
        ExtractedText extractedText2 = this.f33619i;
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = this.f33614d.toString();
        } else {
            charSequence = this.f33614d;
        }
        extractedText2.text = charSequence;
        return this.f33619i;
    }

    private boolean e(boolean z10, boolean z11) {
        int i10;
        int selectionStart = Selection.getSelectionStart(this.f33614d);
        int selectionEnd = Selection.getSelectionEnd(this.f33614d);
        boolean z12 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (z10) {
            i10 = Math.max(this.f33622l.b(this.f33614d, selectionEnd), 0);
        } else {
            i10 = Math.min(this.f33622l.a(this.f33614d, selectionEnd), this.f33614d.length());
        }
        if (selectionStart == selectionEnd && !z11) {
            z12 = true;
        }
        if (z12) {
            setSelection(i10, i10);
        } else {
            setSelection(selectionStart, i10);
        }
        return true;
    }

    private boolean g(boolean z10, boolean z11) {
        int selectionStart = Selection.getSelectionStart(this.f33614d);
        int selectionEnd = Selection.getSelectionEnd(this.f33614d);
        boolean z12 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z11) {
            z12 = true;
        }
        beginBatchEdit();
        if (z12) {
            if (z10) {
                Selection.moveUp(this.f33614d, this.f33621k);
            } else {
                Selection.moveDown(this.f33614d, this.f33621k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f33614d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z10) {
                Selection.extendUp(this.f33614d, this.f33621k);
            } else {
                Selection.extendDown(this.f33614d, this.f33621k);
            }
            setSelection(Selection.getSelectionStart(this.f33614d), Selection.getSelectionEnd(this.f33614d));
        }
        endBatchEdit();
        return true;
    }

    private byte[] h(InputStream inputStream, int i10) {
        int i11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i10];
        while (true) {
            try {
                i11 = inputStream.read(bArr);
            } catch (IOException unused) {
                i11 = -1;
            }
            if (i11 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    public void a(boolean z10, boolean z11, boolean z12) {
        this.f33620j.updateSelection(this.f33611a, this.f33614d.i(), this.f33614d.h(), this.f33614d.g(), this.f33614d.f());
        if (Build.VERSION.SDK_INT >= 21) {
            ExtractedTextRequest extractedTextRequest = this.f33616f;
            if (extractedTextRequest != null) {
                this.f33620j.updateExtractedText(this.f33611a, extractedTextRequest.token, d(extractedTextRequest));
            }
            if (this.f33617g) {
                this.f33620j.updateCursorAnchorInfo(this.f33611a, c());
            }
        }
    }

    public boolean beginBatchEdit() {
        this.f33614d.b();
        this.f33624n++;
        return super.beginBatchEdit();
    }

    public boolean clearMetaKeyStates(int i10) {
        return super.clearMetaKeyStates(i10);
    }

    public void closeConnection() {
        super.closeConnection();
        this.f33614d.l(this);
        while (this.f33624n > 0) {
            endBatchEdit();
            this.f33624n--;
        }
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f33611a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h10 = h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put(JsonStorageKeyNames.DATA_KEY, h10);
                                hashMap.put("uri", contentUri.toString());
                                this.f33613c.b(this.f33612b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public boolean commitText(CharSequence charSequence, int i10) {
        return super.commitText(charSequence, i10);
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        if (this.f33614d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i10, i11);
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f33624n--;
        this.f33614d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f33615e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f33614d);
            int selectionEnd = Selection.getSelectionEnd(this.f33614d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.f33614d.delete(min, max);
                }
                this.f33614d.insert(min, String.valueOf((char) unicodeChar));
                int i10 = min + 1;
                setSelection(i10, i10);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public Editable getEditable() {
        return this.f33614d;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = true;
        boolean z11 = (i10 & 1) != 0;
        if (this.f33616f != null) {
            z10 = false;
        }
        if (z11 == z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The input method toggled text monitoring ");
            sb2.append(z11 ? "on" : "off");
            xb.b.a("InputConnectionAdaptor", sb2.toString());
        }
        this.f33616f = z11 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    public boolean performContextMenuAction(int i10) {
        beginBatchEdit();
        boolean b10 = b(i10);
        endBatchEdit();
        return b10;
    }

    public boolean performEditorAction(int i10) {
        if (i10 == 0) {
            this.f33613c.p(this.f33612b);
        } else if (i10 == 1) {
            this.f33613c.g(this.f33612b);
        } else if (i10 == 2) {
            this.f33613c.f(this.f33612b);
        } else if (i10 == 3) {
            this.f33613c.m(this.f33612b);
        } else if (i10 == 4) {
            this.f33613c.n(this.f33612b);
        } else if (i10 == 5) {
            this.f33613c.h(this.f33612b);
        } else if (i10 != 7) {
            this.f33613c.e(this.f33612b);
        } else {
            this.f33613c.k(this.f33612b);
        }
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f33613c.j(this.f33612b, str, bundle);
        return true;
    }

    public boolean requestCursorUpdates(int i10) {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if ((i10 & 1) != 0) {
            this.f33620j.updateCursorAnchorInfo(this.f33611a, c());
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if (z10 != this.f33617g) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The input method toggled cursor monitoring ");
            sb2.append(z10 ? "on" : "off");
            xb.b.a("InputConnectionAdaptor", sb2.toString());
        }
        this.f33617g = z10;
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f33623m.a(keyEvent);
    }

    public boolean setComposingRegion(int i10, int i11) {
        return super.setComposingRegion(i10, i11);
    }

    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10;
        beginBatchEdit();
        if (charSequence.length() == 0) {
            z10 = super.commitText(charSequence, i10);
        } else {
            z10 = super.setComposingText(charSequence, i10);
        }
        endBatchEdit();
        return z10;
    }

    public boolean setSelection(int i10, int i11) {
        beginBatchEdit();
        boolean selection = super.setSelection(i10, i11);
        endBatchEdit();
        return selection;
    }

    public b(View view, int i10, q qVar, a aVar, c cVar, EditorInfo editorInfo) {
        this(view, i10, qVar, aVar, cVar, editorInfo, new FlutterJNI());
    }
}
