package com.dbvoid.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dbvoid.gmall.bean.UmsMember;
import com.dbvoid.gmall.bean.UmsMemberReceiveAddress;
import com.dbvoid.gmall.service.UserService;
import com.dbvoid.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.dbvoid.gmall.user.mapper.UserMapper;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DBVoid
 * @date 2019/8/9 - 14:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getUmsMembers() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);

        return umsMemberReceiveAddresses;
    }
}
