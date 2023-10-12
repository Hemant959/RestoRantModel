package com.Hemant.Restorant_Management_Service.repo;

import com.Hemant.Restorant_Management_Service.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<user,String> {

}
