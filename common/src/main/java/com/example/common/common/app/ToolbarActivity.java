package com.example.common.common.app;



import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.example.common.R;


/**
 * @author 1050483859@qq.com
 * @version 1.0.0
 */
public abstract class ToolbarActivity extends Activity {
    protected Toolbar mToolbar;


    @Override
    protected void initWidget() {
        super.initWidget();
        initToolbar((Toolbar) findViewById(R.id.toolbar));
    }

    /**
     * 初始化toolbar
     *
     * @param toolbar Toolbar
     */
    public void initToolbar(Toolbar toolbar) {
        mToolbar = toolbar;
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

        initTitleNeedBack();
    }

    protected void initTitleNeedBack() {
        // 设置左上角的返回按钮为实际的返回效果
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
        }
    }
}
