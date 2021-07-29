package com.example.survival_database;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {


}
