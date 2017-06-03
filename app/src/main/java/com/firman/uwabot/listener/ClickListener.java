package com.firman.uwabot.listener;

import android.view.View;

/**
 * Created by Firman on 4/6/2017.
 */

public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
