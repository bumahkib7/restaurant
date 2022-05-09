package com.bbmk.restaurant.Dao;

import com.bbmk.restaurant.models.Food;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Repository("rzosknmk")
public class RestaurantDataAccessService implements RestaurantDao {


	@Override
	public List<Food> getAllFood() {
		return null;
	}

	@Override
	public List<Food> findAll() {
		return null;
	}

	@Override
	public List<Food> findAll(Sort sort) {
		return null;
	}

	@Override
	public Page<Food> findAll(Pageable pageable) {
		return null;
	}

	@Override
	public List<Food> findAllById(Iterable<Long> longs) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long aLong) {

	}

	@Override
	public void delete(Food entity) {

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> longs) {

	}

	@Override
	public void deleteAll(Iterable<? extends Food> entities) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public <S extends Food> S save(S entity) {
		return null;
	}

	@Override
	public <S extends Food> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public void flush() {

	}

	@Override
	public <S extends Food> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public <S extends Food> List<S> saveAllAndFlush(Iterable<S> entities) {
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Food> entities) {

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> longs) {

	}

	@Override
	public void deleteAllInBatch() {

	}

	@Override
	public Food getOne(Long aLong) {
		return null;
	}

	@Override
	public Food getById(Long aLong) {
		return null;
	}

	@Override
	public <S extends Food> Optional<S> findOne(Example<S> example) {
		return Optional.empty();
	}

	@Override
	public <S extends Food> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Food> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public <S extends Food> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Food> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends Food> boolean exists(Example<S> example) {
		return false;
	}

	@Override
	public <S extends Food, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
		return null;
	}

	@Override
	public Optional<Food> findById(Long id) {
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long aLong) {
		return false;
	}

	@Override
	public void findByName(String name) {

	}

	@Override
	@Query("SELECT f FROM Food f WHERE f.price = ?1")
	public void findByPrice(double price) {

	}

	@Override
	public void insertFood(Integer id, String name, Integer price) {

	}

	@Override
	@Query("DELETE FROM Food WHERE id = :id")
	public void deleteFoodById(Long id) {

	}

	@Override
	@Query("DELETE FROM Food WHERE id = :id")
	public void deleteFood(Integer id, String name, Integer price) {

	}
}







// Language: java


// End of file
