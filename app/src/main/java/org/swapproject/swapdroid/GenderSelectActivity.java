package org.swapproject.swapdroid;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;


public class GenderSelectActivity extends Activity implements OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
        // item is adapterView.getItemAtPosition(pos);
        // this should be passed to the database anyway idk how rn
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
