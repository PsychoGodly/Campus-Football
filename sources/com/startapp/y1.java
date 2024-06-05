package com.startapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: Sta */
public abstract class y1 extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public volatile SQLiteDatabase f17554a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17555b = new Object();

    public y1(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
    }

    public SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase = this.f17554a;
        if (sQLiteDatabase == null) {
            synchronized (this.f17555b) {
                sQLiteDatabase = this.f17554a;
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = getWritableDatabase();
                    this.f17554a = sQLiteDatabase;
                }
            }
        }
        return sQLiteDatabase;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
