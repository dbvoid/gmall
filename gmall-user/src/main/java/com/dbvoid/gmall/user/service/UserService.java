package com.dbvoid.gmall.user.service;

import com.dbvoid.gmall.user.bean.UmsMember;
import com.dbvoid.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author DBVoid
 * @date 2019/8/9 - 14:26
 */
public interface UserService {
    public List<UmsMember> getUmsMembers();

    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
