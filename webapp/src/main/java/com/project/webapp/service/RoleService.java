package com.project.webapp.service;

import java.util.List;

import com.project.webapp.dto.response.RoleDto;

public interface RoleService {

	List<RoleDto> getAllRoles();

	RoleDto getRoleById(int id);

//	RoleDto editRole(int id, RoleDto roleDto);
//
//	RoleDto createNewRole(RoleDto roleDto);
//
//	RoleDto deleteRoleById(int id);
//
//	

}
