package xyz.homesangsang.websocketsecuritydemo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import xyz.homesangsang.websocketsecuritydemo.entity.UserInfo;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, Integer> {

    List<UserInfo> findAll();

    UserInfo save();

    UserInfo findByUsername(String username);

    Optional<UserInfo> findById(Integer id);
}
