package com.dbvoid.gmall.user.controller;

import com.dbvoid.gmall.user.bean.UmsMember;
import com.dbvoid.gmall.user.bean.UmsMemberReceiveAddress;
import com.dbvoid.gmall.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DBVoid
 * @date 2019/8/9 - 14:25
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@RequestParam String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getUmsMembers(){
        List<UmsMember> umsMembers = userService.getUmsMembers();
        return umsMembers;
    }

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "坚持ing";
    }

}
