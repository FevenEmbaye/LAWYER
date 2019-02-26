package com.work.lawyer.IRepository;


import org.springframework.stereotype.Component;

import com.work.lawyer.Entity.User;
@Component("userRepo")
public interface IUserRepo {
	public int create(User user);
	public User delete(User user);
	public User update(User user);
	public User read(int id);

}
