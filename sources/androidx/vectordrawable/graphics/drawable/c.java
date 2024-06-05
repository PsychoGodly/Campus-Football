package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import m0.a;
import m0.b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimationUtilsCompat */
public class c {
    private static Interpolator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Interpolator fVar;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            fVar = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            fVar = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            fVar = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            fVar = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            fVar = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            fVar = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            fVar = new f(context, asAttributeSet, xmlPullParser);
                        } else {
                            throw new RuntimeException("Unknown interpolator name: " + xmlPullParser.getName());
                        }
                        interpolator = fVar;
                    }
                }
            }
        }
        return interpolator;
    }

    public static Interpolator b(Context context, int i10) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i10);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i10 == 17563663) {
            try {
                return new a();
            } catch (XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            } catch (IOException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i10 == 17563661) {
            return new b();
        } else {
            if (i10 == 17563662) {
                return new m0.c();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i10);
            Interpolator a10 = a(context, context.getResources(), context.getTheme(), animation);
            if (animation != null) {
                animation.close();
            }
            return a10;
        }
    }
}
