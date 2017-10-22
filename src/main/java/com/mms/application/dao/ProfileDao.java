package com.mms.application.dao;

import com.mms.application.bean.Profile;
import com.mms.application.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileDao extends JpaRepository<Profile, Long> {

        public Profile findByUsername(String username);

}
