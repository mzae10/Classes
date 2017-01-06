package com.tsofen.pcp.classes;

import android.view.View;

/**
 * Created by Pcp on 06/01/2017.
 */

public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
