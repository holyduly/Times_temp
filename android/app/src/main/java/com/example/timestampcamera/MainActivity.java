package com.example.timestampcamera;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(DeviceToolsPlugin.class);
        super.onCreate(savedInstanceState);
    }
}
