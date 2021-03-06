package com.example.factory.presenter.user;

import com.example.common.factory.presenter.BaseContract;


/**
 * 更新用户信息的基本的契约
 *
 * @author 1050483859@qq.com
 * @version 1.0.0
 */
public interface UpdateInfoContract {
    interface Presenter extends BaseContract.Presenter {
        // 更新
        void update(String photoFilePath, String desc, boolean isMan);
        void update(String desc,int type);
    }

    interface View extends BaseContract.View<Presenter> {
        // 回调成功
        void updateSucceed();
    }
}
