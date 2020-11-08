package net.xdclass.demoproject.dao;

import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.domain.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {

    /**
     * 查询全部订单，关联用户信息
     * @return
     */
    List<VideoOrder> queryVideoOrderList();


    /**
     * 查询全部订单，关联用户信息 懒加载
     * @return
     */
    List<VideoOrder> queryVideoOrderListLazy();

    /**
     *查询全部用户的全部订单
     * @return
     */
    List<User> queryUserOrder();
}
