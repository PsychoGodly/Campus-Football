package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Set;

/* compiled from: Sta */
public class f9 {
    public static int a(Context context, int i10) {
        return i0.a(context, 1, (float) i10);
    }

    public static int b(Context context, int i10) {
        return Math.round(((float) i10) / context.getResources().getDisplayMetrics().density);
    }

    public static void a(TextView textView, Set<String> set) {
        if (set.contains("UNDERLINE")) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
        int i10 = 0;
        if (set.contains("BOLD") && set.contains("ITALIC")) {
            i10 = 3;
        } else if (set.contains("BOLD")) {
            i10 = 1;
        } else if (set.contains("ITALIC")) {
            i10 = 2;
        }
        textView.setTypeface((Typeface) null, i10);
    }

    public static TextView a(Context context, TextView textView, Typeface typeface, int i10, float f10, int i11, int i12) {
        TextView textView2 = new TextView(context);
        textView2.setTypeface(typeface, i10);
        textView2.setTextSize(1, f10);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setTextColor(i11);
        textView2.setId(i12);
        return textView2;
    }

    public static RelativeLayout.LayoutParams a(Context context, int[] iArr, int[] iArr2) {
        int i10;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        for (int addRule : iArr2) {
            layoutParams.addRule(addRule);
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == 0) {
                i10 = 0;
            } else {
                i10 = i0.a(context, 1, (float) iArr[i11]);
            }
            iArr[i11] = i10;
        }
        layoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        return layoutParams;
    }

    public static ImageView a(Context context, ImageView imageView, Bitmap bitmap, int i10) {
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setId(i10);
        return imageView2;
    }

    public static void a(Context context, WindowManager windowManager, Point point) {
        if (Build.VERSION.SDK_INT >= 13) {
            windowManager.getDefaultDisplay().getSize(point);
        } else {
            point.x = windowManager.getDefaultDisplay().getWidth();
            point.y = windowManager.getDefaultDisplay().getHeight();
        }
        point.x = Math.round(((float) point.x) / context.getResources().getDisplayMetrics().density);
        point.y = Math.round(((float) point.y) / context.getResources().getDisplayMetrics().density);
    }
}
