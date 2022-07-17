package com.aza.service.user;

import com.aza.service.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

import java.util.Optional;

public interface UserRepository {

    Optional<User> getUserBySeq(Long seq) throws Exception;

    Optional<User> getUserByUserId(String userId) throws Exception;

    void updateUser(User user) throws Exception;

    void deleteUser(String userId) throws Exception;

}
