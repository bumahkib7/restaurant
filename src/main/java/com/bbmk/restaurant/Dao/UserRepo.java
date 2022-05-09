package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.function.Function;
@Repository("rzosknmk@rogue.db.elephantsql.com")
@Transactional
public interface UserRepo extends JpaRepository <User, String> {
	User findByUsername(String username);

	void Save(String password);

	abstract <S extends User> S save(S entity);

	void deleteUser (User user);


	<S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction, Sort sort);
}