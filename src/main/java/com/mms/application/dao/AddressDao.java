package com.mms.application.dao;

import com.mms.application.bean.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address, Long> {


}
