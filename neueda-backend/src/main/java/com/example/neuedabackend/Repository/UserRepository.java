package com.example.neuedabackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.neuedabackend.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    

}
