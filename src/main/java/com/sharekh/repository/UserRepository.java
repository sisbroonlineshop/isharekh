package com.sharekh.repository;

import com.sharekh.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/*
Create By: Ron Rith
Create Date: 11/25/2017
*/
public interface UserRepository extends PagingAndSortingRepository<User,Long> {
    User findByUsername(String username);
}
