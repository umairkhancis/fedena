package com.ufh.fedena.model.repo;

import com.ufh.fedena.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Umair on 3/11/15.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
