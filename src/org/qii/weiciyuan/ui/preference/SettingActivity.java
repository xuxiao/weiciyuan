package org.qii.weiciyuan.ui.preference;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import org.qii.weiciyuan.R;
import org.qii.weiciyuan.ui.Abstract.AbstractAppActivity;
import org.qii.weiciyuan.ui.main.MainTimeLineActivity;

/**
 * User: Jiang Qi
 * Date: 12-8-6
 */
public class SettingActivity extends AbstractAppActivity {


    public static final String ENABLE_PIC = "show_picture";
    public static final String THEME = "theme";

    public static final String SOUND = "sound";
    public static final String AUTO_REFRESH = "auto_refresh";

    public static final String FREQUENCY = "frequency";
    public static final String ENABLE_FETCH_MSG = "enable_fetch_msg";
    public static final String DISABLE_FETCH_AT_NIGHT = "disable_fetch_at_night";

    public static final String CLEAR_CACHE = "clear_cache";
    public static final String FONT_SIZE = "font_size";
    public static final String OFFICIAL_WEIBO = "official_weibo";
    public static final String SHOW_BIG_PIC = "show_big_pic";
    public static final String AUTO_SHOW_BIG_PIC = "auto_show_big_pic";
    public static final String SHOW_BIG_AVATAR = "show_big_avatar";

    public static final String DOWNLOAD_EMOTIONS = "download_emotions";
    public static final String FILTER = "filter";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle(getString(R.string.setting));

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .replace(android.R.id.content, new SettingsFragment())
                    .commit();
        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case android.R.id.home:
                intent = new Intent(this, MainTimeLineActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return true;
        }
        return false;
    }


}


