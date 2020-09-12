package com.example.springbootexamples.repository;

import com.example.springbootexamples.entity.Member;
import com.example.springbootexamples.entity.Role;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MemberDaoTest {

  @Autowired
  private MemberDao memberDao;

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  /**
   * 測試 Member 的 Role Enum
   */
  @Test
  void getOne() {
    final String memId = "demo";
    final Member member = memberDao.findById(memId)
        .orElseThrow(() -> new RuntimeException("Member not found, id: " + memId));
    final Role role = member.getRole();

    assertThat(member.getFirstName(), is("Mrinmoy"));
    assertThat(member.getLastName(), is("Majumdar"));
    assertThat(role, is(Role.USER));
  }

  /**
   * JPA 的 distinct 會對所有欄位做 distinct
   * select distinct user_id, address1, address2... etc
   * from member
   * where fist_name = ?
   */
  @Test
  void getDistinctByFistName(){
    List<Member> list = memberDao.findDistinctByFirstName("123");
    assertTrue(list.isEmpty());
  }
}