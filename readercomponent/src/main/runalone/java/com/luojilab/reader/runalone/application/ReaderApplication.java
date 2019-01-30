package com.luojilab.reader.runalone.application;

import com.luojilab.component.basicres.BaseApplication;

import org.github.jimu.msg.EventManager;

/**
 * Created by mrzhang on 2017/6/20.
 */

public class ReaderApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        EventManager.init(this);
        //如果isRegisterCompoAuto为false，则需要通过反射加载组件
//        Router.registerComponent("com.luojilab.share.applike.ShareApplike");
//        Router.registerComponent("com.luojilab.share.kotlin.applike.KotlinApplike");
    }
}
