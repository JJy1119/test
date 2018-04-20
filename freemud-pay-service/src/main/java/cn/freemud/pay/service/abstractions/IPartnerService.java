package cn.freemud.pay.service.abstractions;

import cn.freemud.pay.service.bo.PartnerBO;

/**
 * @author shaocheng.ding
 */
public interface IPartnerService {
    /**
     * 根据id获取Partner
     *
     * @param id partner的id
     * @return Partner的业务对象
     */
    PartnerBO getById(Integer id);
}
