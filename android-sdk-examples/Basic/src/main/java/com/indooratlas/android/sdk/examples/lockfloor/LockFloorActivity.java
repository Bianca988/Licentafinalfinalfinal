package com.indooratlas.android.sdk.examples.lockfloor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.indooratlas.android.sdk.IALocationManager;
import com.indooratlas.android.sdk.examples.R;
import com.indooratlas.android.sdk.examples.SdkExample;
import com.indooratlas.android.sdk.examples.utils.ExampleUtils;

/**
 * Simple example that demonstrates basic interaction with {@link IALocationManager}.
 */
@SdkExample(description = R.string.example_lockfloor_description)
public class LockFloorActivity extends AppCompatActivity{
        private TextView mLog;
 protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beacon_activity);

    }


//-----------------SHOW IN LIST --------------------------------------------------//
        private void shareLog() {

            Intent sendIntent = new Intent()

                    .setAction(Intent.ACTION_SEND)

                    .putExtra(Intent.EXTRA_TEXT, mLog.getText())

                    .setType("text/plain");

            startActivity(sendIntent);

        }
}
