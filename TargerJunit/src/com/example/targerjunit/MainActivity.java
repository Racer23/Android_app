package com.example.targerjunit;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText etAccount, etPassword;
	Button btSubmit;
	TextView tvShow;
	// 标识
	String TAG = "huanhui";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initView();
		initEvent();
	}

	private void initEvent() {
		btSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Log.i(TAG, "赋值== " + "account：" + etAccount.getText().toString() + "\r\n" + "password："
						+ etPassword.getText().toString());
				tvShow.setText(
						"account：" + etAccount.getText().toString() + " password：" + etPassword.getText().toString());
			}
		});
	}

	private void initView() {
		setContentView(R.layout.activity_main);
		etAccount = (EditText) findViewById(R.id.etAccount);
		etPassword = (EditText) findViewById(R.id.etPassword);
		btSubmit = (Button) findViewById(R.id.btSubmit);
		tvShow = (TextView) findViewById(R.id.tvShow);
	}

}
