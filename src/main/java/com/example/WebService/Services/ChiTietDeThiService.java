package com.example.WebService.Services;

import com.example.WebService.DTO.ChiTietDeThiDto;
import com.example.WebService.Entity_BangLaiXe.ChiTietDeThi;
import com.example.WebService.Entity_BangLaiXe.ChiTietDeThiPK;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ChiTietDeThiService {
    List<ChiTietDeThiDto> findAll();

    List<ChiTietDeThi> findAll(Sort sort);

    List<ChiTietDeThi> findAllById(Iterable<ChiTietDeThiPK> chiTietDeThiPKS);

    <S extends ChiTietDeThi> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends ChiTietDeThi> S saveAndFlush(S entity);

    <S extends ChiTietDeThi> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<ChiTietDeThi> entities);

    void deleteAllInBatch(Iterable<ChiTietDeThi> entities);

    void deleteAllByIdInBatch(Iterable<ChiTietDeThiPK> chiTietDeThiPKS);

    void deleteAllInBatch();

    @Deprecated
    ChiTietDeThi getOne(ChiTietDeThiPK chiTietDeThiPK);

    ChiTietDeThi getById(ChiTietDeThiPK chiTietDeThiPK);

    <S extends ChiTietDeThi> List<S> findAll(Example<S> example);

    <S extends ChiTietDeThi> List<S> findAll(Example<S> example, Sort sort);

    Page<ChiTietDeThi> findAll(Pageable pageable);

    <S extends ChiTietDeThi> S save(S entity);

    Optional<ChiTietDeThi> findById(ChiTietDeThiPK chiTietDeThiPK);

    boolean existsById(ChiTietDeThiPK chiTietDeThiPK);

    long count();

    void deleteById(ChiTietDeThiPK chiTietDeThiPK);

    void delete(ChiTietDeThi entity);

    void deleteAllById(Iterable<? extends ChiTietDeThiPK> chiTietDeThiPKS);

    void deleteAll(Iterable<? extends ChiTietDeThi> entities);

    void deleteAll();

    <S extends ChiTietDeThi> Optional<S> findOne(Example<S> example);

    <S extends ChiTietDeThi> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends ChiTietDeThi> long count(Example<S> example);

    <S extends ChiTietDeThi> boolean exists(Example<S> example);

    <S extends ChiTietDeThi, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
