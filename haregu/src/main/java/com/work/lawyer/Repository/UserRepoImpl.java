package com.work.lawyer.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.work.lawyer.Entity.User;
import com.work.lawyer.IRepository.IUserRepo;

@Component()
public class UserRepoImpl implements IUserRepo {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	public int create(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

	public User delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
