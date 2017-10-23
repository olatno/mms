package com.mms.application.dao;

import com.mms.application.bean.Album;
import com.mms.application.bean.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumDao extends JpaRepository<Album, Long> {


}
