package cn.hhy.ad.dao;

import cn.hhy.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdUserRepository extends JpaRepository<AdUser,Long> {

    AdUser findByUsername(String username);
}
