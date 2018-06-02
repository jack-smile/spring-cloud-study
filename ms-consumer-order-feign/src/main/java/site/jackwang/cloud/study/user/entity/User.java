package site.jackwang.cloud.study.user.entity;

import java.math.BigDecimal;

/**
 * 用户实体
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/29
 */
public class User {
  private Long id;
  private String username;
  private String name;
  private Integer age;
  private BigDecimal balance;

  public User() {
  }

  public User(String name) {
    this.name = name;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public BigDecimal getBalance() {
    return this.balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
}