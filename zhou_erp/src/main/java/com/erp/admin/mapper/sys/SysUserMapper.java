package com.erp.admin.mapper.sys;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.erp.admin.pojo.sys.SysUser;

@Repository
public interface SysUserMapper {

	@Insert("insert into sys_user(user_name,pass_word,image,status) values (#{userName},#{passWord},#{image},#{status})")
	int insert(SysUser user);

}
