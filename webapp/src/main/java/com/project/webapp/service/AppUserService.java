package com.project.webapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.webapp.dto.request.ChangePassDTO;
import com.project.webapp.dto.request.InviteDTO;
import com.project.webapp.dto.request.LoginDTO;
import com.project.webapp.dto.response.AppUserDto;
import com.project.webapp.model.AppUser;

@Service
public interface AppUserService {

	List<AppUserDto> findAllAppUsers();

	AppUserDto getAppUserById(int id);

	AppUserDto editAppUser(int id, AppUserDto appUserDto);

	AppUserDto createNewAppUser(AppUserDto appUserDto);

	AppUserDto deleteAppUserById(int id);

	AppUser findByEmail(String email);

	AppUserDto inviteCompanyAdmin(InviteDTO invite);

	void comfirmEmail(String token);

	void changeTemporaryPassword(ChangePassDTO changePassDTO);

	AppUserDto getAppUserByToken(String token);

	AppUserDto signUp(LoginDTO user);

}
