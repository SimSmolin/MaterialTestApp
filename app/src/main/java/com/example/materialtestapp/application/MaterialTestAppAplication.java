package com.example.materialtestapp.application;

import android.app.Application;
import android.content.Context;

// для работы загрузчика и кеша изображений хочу использовать Application сontext
// так чтобы кеш не сбрасывался пока не будет остановдено приложение
// Активити-контект и Фрейм-контекст не подходят так как рестартуют при поворотах устроийсва
// сдесь не создаем чистый сиглтон а просто запоминает инстанс для дальнейшего обращения
// да и не забываем в манифесте  android:name="com.example.materialtestapp.application.MaterialTestAppAplication"

public class MaterialTestAppAplication extends Application {
    private static MaterialTestAppAplication instance;
    private static Context appContext;

    public static MaterialTestAppAplication getInstance() {
        return instance;
    }

    public static Context getAppContext() {
        return appContext;
    }

    public void setAppContext(Context mAppContext) {
        appContext = mAppContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        this.setAppContext(getApplicationContext()); // фактически при старте в appContext запомним  копию
    }
}
