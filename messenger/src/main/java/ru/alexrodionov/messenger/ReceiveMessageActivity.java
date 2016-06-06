package ru.alexrodionov.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        String messageText = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        TextView messageView = (TextView) findViewById(R.id.messageView);
        messageView.setText(messageText);
    }
}
