package ze;

import android.graphics.Rect;

/* compiled from: IViewFinder */
public interface g {
    void a();

    Rect getFramingRect();

    int getHeight();

    int getWidth();

    void setBorderAlpha(float f10);

    void setBorderColor(int i10);

    void setBorderCornerRadius(int i10);

    void setBorderCornerRounded(boolean z10);

    void setBorderLineLength(int i10);

    void setBorderStrokeWidth(int i10);

    void setLaserColor(int i10);

    void setLaserEnabled(boolean z10);

    void setMaskColor(int i10);

    void setSquareViewFinder(boolean z10);
}
