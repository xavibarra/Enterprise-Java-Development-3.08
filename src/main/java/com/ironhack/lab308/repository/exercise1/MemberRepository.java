package com.ironhack.lab308.repository.exercise1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
}
