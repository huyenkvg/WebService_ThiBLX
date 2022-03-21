package com.example.WebService.Services;

import com.example.WebService.Entity_BangLaiXe.Cauhoi;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface CauhoiService {

    List<Cauhoi> findAll();

    List<Cauhoi> findAll(Sort sort);

    List<Cauhoi> findAllById(Iterable<Integer> integers);

    <S extends Cauhoi> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Cauhoi> S saveAndFlush(S entity);

    <S extends Cauhoi> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Cauhoi> entities);

    void deleteAllInBatch(Iterable<Cauhoi> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    @Deprecated
    Cauhoi getOne(Integer integer);

    Cauhoi getById(Integer integer);

    <S extends Cauhoi> List<S> findAll(Example<S> example);

    <S extends Cauhoi> List<S> findAll(Example<S> example, Sort sort);

    Page<Cauhoi> findAll(Pageable pageable);

    <S extends Cauhoi> S save(S entity);

    Optional<Cauhoi> findById(Integer integer);

    boolean existsById(Integer integer);

    long count();

    void deleteById(Integer integer);

    void delete(Cauhoi entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends Cauhoi> entities);

    void deleteAll();

    <S extends Cauhoi> Optional<S> findOne(Example<S> example);

    <S extends Cauhoi> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Cauhoi> long count(Example<S> example);

    <S extends Cauhoi> boolean exists(Example<S> example);

    <S extends Cauhoi, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
