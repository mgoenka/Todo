package com.mgoenka.example.todo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class TodoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_todo);
	}

	public void onAdd(View v) {
		// Generating an alert in Android
		Toast.makeText(getBaseContext(), "Hello World", Toast.LENGTH_SHORT).show();
	}

}
