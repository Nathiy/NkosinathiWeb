package com.nkosigeek.geekweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nkosigeek.geekweb.model.User;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer>
{
    
}
