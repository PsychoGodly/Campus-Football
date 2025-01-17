package com.startapp.sdk.json;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.startapp.a1;
import com.startapp.c1;
import com.startapp.f9;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class RatingBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f17268a = new HashMap<String, String>() {
        {
            put("filled_star.png", "iVBORw0KGgoAAAANSUhEUgAAABUAAAAVCAYAAACpF6WWAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyFpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNS1jMDE0IDc5LjE1MTQ4MSwgMjAxMy8wMy8xMy0xMjowOToxNSAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpBRERBQzI2QTI5QzIxMUUzQTg0MzlDMTREMDk0QzcxMCIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpBRERBQzI2QjI5QzIxMUUzQTg0MzlDMTREMDk0QzcxMCI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkFEREFDMjY4MjlDMjExRTNBODQzOUMxNEQwOTRDNzEwIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkFEREFDMjY5MjlDMjExRTNBODQzOUMxNEQwOTRDNzEwIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+bizYBgAAAp5JREFUeNqUlL9rFEEUx9/M7Z23lx+eoiIoSUBzUUuDFhL9AyxsBBHtBJWU2olIJCA24nWKCKJCxEKrkCpF1EYkkC7aBIkWRuOvu8tmf83OjN+57MW9zR3JPfjw5u2b9+bXe8vc+QfUkPzBC8SyPdRCuoixE6T1e4ydtFOLFfIXXqzbPOkMvk4RRU4LVveT9Mah97Xy1+MSwtMryr8fiaSfwjtDwjle1ymfmW/iksKSx29IJlug3J6j67dCGfsT9ABYROLD0L5xhMtzJIW7IZ5TG1He8trxZHCWRHUAUF0bG9/r/jZitU3qLhMr7Mpj3VFiyTuiUXhfK/eX33FSraKs9H6PMJ4dSrmGtBIj8L/FWLRLegTsBkWw3WgEFTWxIslwGPaOVIyxb4HTWLoC3aAa659WFDiHMCiDXpBNwNocIgNOxeh4tw1q4JqlpJj0vVofzjtWL/LOxCyci6kQ4+W83Ttpji+kCB76bqWGjrkDey91Lt/RcTfzheIE2SQaDxVEInjqrVYWMX4C+jtI+AVcsruKb0zRpF9fqUjMeO7KFVzVo7jYNxNsgl21Cz0z8f22LCktpZgOfe+Z1nps0wtl7Hkub08nE9aTzr17hS1KUjJa00pqreTAFo/eH4ZCu84q8R/fiGcs4jxDlutU0xPRRWx4i0mHtVR5JZWf7AOL2Ib/54EWBS/BH7AzrtNkI5j5880dZaXjqQS6E3YI7oKX4Dy4EdclxfNKG5KyQl9zMatwUKvQNEEAZtEU1ymqzcb+22T1TqHI72N8zDQL47kS8Rxren18bL5PnhvEjM+Y8xj/gAkdOUvNT85nmdV9Dj+aizAu48sgsIH7P6mVPCltAx+w03sorgXTbG0eaImYVSaWmcSmTsZx60n/CTAAg+M3qqJD3uIAAAAASUVORK5CYII=");
            put("half_star.png", "iVBORw0KGgoAAAANSUhEUgAAABUAAAAVCAYAAACpF6WWAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyFpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNS1jMDE0IDc5LjE1MTQ4MSwgMjAxMy8wMy8xMy0xMjowOToxNSAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpBRUQ0MTlEMTI5QzIxMUUzQkJBNDlFRkRFQzIxQjU1NSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpBRUQ0MTlEMjI5QzIxMUUzQkJBNDlFRkRFQzIxQjU1NSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkFFRDQxOUNGMjlDMjExRTNCQkE0OUVGREVDMjFCNTU1IiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkFFRDQxOUQwMjlDMjExRTNCQkE0OUVGREVDMjFCNTU1Ii8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+x+XqwwAAAxJJREFUeNqUVEtIVFEY/s+dO9c7o05T2BAhZg81WrSwXdiyVhWFi6BWbYSgVe2iDEKoKLBNGUS4KKtFtZE2QpRuSgR3KolMINWgmY7jzH2fc/rubZzujDMNHfg4j//83/mfhxkzj2hz6AfOE4s2U5XRSIwdJSk/YZ2vFEp3g6yFF6W9Ehbai++IvHwVFFqJm7cw764mD/RCQ618ka/NUiSxr9KY08Qphfk4MB8W8Fw60AsPFnZ/c0SicdJS3aWoUCQ2h/kj4Ft8CrPlC5zlaeKusUVfpRpDmMukgBxB7iXhtBOLLJIUG0AvTBsRVcjqkxrLxOItOsJ+iVjglESAHpCkYUjfCGPF+m9SKbwoN3/1MCXaVYqVqqelZ81K4fZAPo4jtxbpIWAnkAS2+TOUkpJYkrhzBPvtFTovgcvACTztl1e2iPXi/FP17PxBLAaBBBANgW1JoBZHuSp+rX4DGqCbKhrUUjTuJNCvCu6OWmauDf7eDIq8zki07PVdTtsmys8pzLm2nzCZYooyQEx5qscSo777LnftIcvIIrNyAPtd/yIVQpIFwpXvX0jTY6yxacdhJaJehQvjejz5nGLkbibK9lx72Cxkv2KN7FJbLdLcaoZMIxeso5q2v5BfvY7lw1hjcsJ/szL7QnjuB9PY6IM7j7FvrxOJLiOfHULo78bizX4lyFolJTl3xxzLfCalvFGH9CxjbAIhGAsTBqTTE69hIifBvT+z4FIKvqc6jxZ0LYLgb/wquOg4rjTyBVKWfhBiS4oSIdXIr1dqQot1Vylpv7siaFceVJz0JnF4X3KhCy6scB+oxLb8n/urFDyIqAdAy6ojpLaukYc2lWy+eH+mvKPUSn3qBJpCewe4DbwCzgBvgWuktX4mbkwX75eTsnhZ9TD8SJ1SOH4T2MAUmuIKebmpovwOqYn3KPJ+rMcoomeYonWQorGy7OMwTBrDhQ7cSOPOE/wBI9LLZ8p/YGWKqU19+GguYHMOJ0uBHpHxl1QNe0oNwCQsvYfiWvCbrUY5ZRDbQSRtFEYdK+qVSH8LMADpmlyJIRuB5wAAAABJRU5ErkJggg==");
            put("empty_star.png", "iVBORw0KGgoAAAANSUhEUgAAABUAAAAVCAYAAACpF6WWAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyFpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNS1jMDE0IDc5LjE1MTQ4MSwgMjAxMy8wMy8xMy0xMjowOToxNSAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpBRkFGQjNDNDI5QzIxMUUzOEI2Mjk1OEM5OTM0Q0Y5NyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpBRkFGQjNDNTI5QzIxMUUzOEI2Mjk1OEM5OTM0Q0Y5NyI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkFGQUZCM0MyMjlDMjExRTM4QjYyOTU4Qzk5MzRDRjk3IiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkFGQUZCM0MzMjlDMjExRTM4QjYyOTU4Qzk5MzRDRjk3Ii8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+J0wgvwAAA4BJREFUeNqUVE1sVFUU/u57d347lGLGLoCgESuIiQt2at0pG1fEhYms2HRhXBoXYjSYmDQGkBXERSMbdKNuGjcSYygLg8QaTChCmgkRobZWOzN98/7vvX739XV8M3QW3uR755177jn3/F7h37qA7VV9+k2I0i7ssMYgxIsw5kf+e8NCk2wiXP6izztFYfT7t0Dq7YDePqjgNOneneSZXmHJ4RvVxhLc8aeGnXkFCgHpq8TdokB1W5neSKMwGvH6L3A7d1CePNrPCtzacdKPiPfp8RxpaAXx2iJU4j+SKwcjlg7WtsJT0etIurdpbGGLkud+Jh+x5Eij/hpEvVnlvTMQOElquHseBp+Tfq399fB/GzU6Lang72nhlJZEqd7Kt1sm8ZeMTqYpv0o+GWX0CPE4MUHstpRKEwaiARU/Qf4CwnZR50vibeIYr7bt1c7RyelfMo28w/w5Tdi+uEc8IG7KSsMmLSLuDzlie/UPokLdSdJm7pR17jXiQ6lVMh8G3QOM9zmj9TlArJUqdShtUKntOAg25FYUsP3i3u0kstU3k8JxPoZw5qq18XkbfqKS6GLot09wYs5qlZ7pef/8GoeBae47hObew5ClSt9imkRYf/gb1h+w7ao1MdZ47HnHle9w4n6o1icuo4Zku1ARD18Kem1bkFNGq/fSJFz+895NbKy2oI2A1+mhsXsMjjCwXtpVKpcP0oFTNu+1sYkF2zTD1dc6Ta4G/maZ4XxG/i3iTuh36J1Gr9ujwYhe91v7kO+1LzJds7X6LtsJZlRLGaWSKwx92hhjp2g2CyMUmXCT3laqfd3jQohrTMGVosHM6OLCV3RRgbncoloZhv8kZXNbR8btQPYV4sjmt7vdBSfjODG+xyhWH4K5heO4kL7XGa4up0g8S3odwgbiIv9Y610DVzGb9C29Tv6MUbqqlQ6LcyAhHmmbg9lLJEwI2bTzvwcon+CefWEWedFlyP0bSDmmRtzNz98afFAkdQbxDPEzyvttIl+AW/+GfIP4JKOWt/tWLvcs5ucHbEhRP1C8REDHU0bH97NRdKvHOBTvIu3eyOWzkOPfs8k/4P93lK8IpzwFpywGqs/NotEaD0zxxEs8c41vwIxJvZWB5AjnhpCNGT40TIl4gzurmR7g/2dUNooqtrQ/0dMFNteyHbYRj9gKc/sphDtPp17O9fpG/xVgAGPaqihJwv/NAAAAAElFTkSuQmCC");
        }
    };

    public RatingBar(Context context) {
        super(context);
    }

    public final void a(String str) {
        try {
            int a10 = f9.a(getContext(), 2);
            int a11 = f9.a(getContext(), 5);
            ImageView imageView = new ImageView(getContext());
            Bitmap a12 = a1.a(getContext(), str);
            if (a12 == null) {
                a12 = c1.a((String) ((HashMap) f17268a).get(str));
            }
            imageView.setImageBitmap(Bitmap.createScaledBitmap(a12, f9.a(getContext(), 15), f9.a(getContext(), 15), true));
            imageView.setPadding(a10, 0, 0, a11);
            addView(imageView);
        } catch (NullPointerException unused) {
        }
    }

    public void setRating(float f10) {
        removeAllViews();
        float round = ((float) Math.round(f10 * 2.0f)) / 2.0f;
        int floor = (int) Math.floor((double) round);
        int i10 = round - ((float) floor) == 0.5f ? 1 : 0;
        int i11 = (5 - floor) - i10;
        for (int i12 = 0; i12 < floor; i12++) {
            a("filled_star.png");
        }
        if (i10 != 0) {
            a("half_star.png");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            a("empty_star.png");
        }
    }
}
