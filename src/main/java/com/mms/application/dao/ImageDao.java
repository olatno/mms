package com.mms.application.dao;

import com.mms.application.bean.Address;
import com.mms.application.bean.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<Image, Long> {


}
