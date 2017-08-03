package com.erp.admin.service.sys.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.admin.mapper.sys.SysUserMapper;
import com.erp.admin.pojo.sys.SysUser;
import com.erp.admin.service.sys.SysUserService;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public Map<String, Object> insert(SysUser user) {
		int result = sysUserMapper.insert(user);
		System.out.println(result);
		return null;
	}

}
