package site.jackwang.cloud.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.jackwang.cloud.study.entity.User;

/**
 * 数据库，用户表，操作接口
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/27
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
