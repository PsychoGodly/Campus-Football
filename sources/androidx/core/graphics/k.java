package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TypefaceCompatApi29Impl */
public class k extends l {
    private Font l(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : CommonGatewayClient.CODE_400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m10 = m(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int m11 = m(fontStyle, font2.getStyle());
            if (m11 < m10) {
                font = font2;
                m10 = m11;
            }
        }
        return font;
    }

    private static int m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public Typeface b(Context context, e.c cVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (e.d dVar : cVar.a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.b()).setWeight(dVar.e()).setSlant(dVar.f() ? 1 : 0).setTtcIndex(dVar.c()).setFontVariationSettings(dVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(l(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (g.b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, cancellationSignal);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(l(build2, i10).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public g.b i(g.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
