package com.shineiot.login;

import android.app.Activity;

import com.shineiot.libroute.IRouterLoad;

import java.util.Map;

public class LoginRouter implements IRouterLoad {
    @Override
    public void loadRoute(Map<String, Class<? extends Activity>> router) {
        //router.put("/login/login",LoginActivity.class);
    }
}
