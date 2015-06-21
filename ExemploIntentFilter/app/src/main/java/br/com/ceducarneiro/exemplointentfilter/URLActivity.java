package br.com.ceducarneiro.exemplointentfilter;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class URLActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        TextView txtUrl = (TextView) findViewById(R.id.txtUrl);
        Uri uri = getIntent().getData();

        txtUrl.setText(uri.toString());
    }

}
