package com.example.factory.presenter.group;

import com.example.common.factory.model.Author;
import com.example.common.factory.presenter.BaseContract;

/**
 * 群创建的契约
 *
 * @author 1050483859@qq.com
 * @version 1.0.0
 */
public interface GroupCreateContract {
    interface Presenter extends BaseContract.Presenter {
        // 创建
        void create(String name, String desc, String picture);

        // 更改一个Model的选中状态
        void changeSelect(ViewModel model, boolean isSelected);
    }

    interface View extends BaseContract.RecyclerView<Presenter, ViewModel> {
        // 创建成功
        void onCreateSucceed();
    }

    class ViewModel {
        // 用户信息
        public Author author;
        // 是否选中
        public boolean isSelected;
    }

}
