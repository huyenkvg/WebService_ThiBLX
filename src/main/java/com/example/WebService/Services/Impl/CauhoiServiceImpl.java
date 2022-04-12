package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.CauhoiDto;
import com.example.WebService.Entity_BangLaiXe.Cauhoi;
import com.example.WebService.Repositories.CauhoiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CauhoiServiceImpl {
    @Autowired
    private CauhoiRepository cauhoiRepository;

    public CauhoiDto convertToDto(Cauhoi ety) {

       CauhoiDto Dto = new CauhoiDto(ety.getMacauhoi(), ety.getNoidung(),ety.getA(), ety.getB(), ety.getC(),  ety.getD(), ety.getDapan(), ety.getHinhAnh(),  ety.getMaBoDe().getMabodethi(), ety.getMaLoaiLiThuyet().getMaLoaiLiThuyet());
        return Dto;
    }
    public List<CauhoiDto> findAll() {
        return cauhoiRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<Cauhoi> findAll(Sort sort) {
        return cauhoiRepository.findAll(sort);
    }

    public List<Cauhoi> findAllById(Iterable<Integer> integers) {
        return cauhoiRepository.findAllById(integers);
    }

    public <S extends Cauhoi> List<S> saveAll(Iterable<S> entities) {
        return cauhoiRepository.saveAll(entities);
    }

    public void flush() {
        cauhoiRepository.flush();
    }

    public <S extends Cauhoi> S saveAndFlush(S entity) {
        return cauhoiRepository.saveAndFlush(entity);
    }

    public <S extends Cauhoi> List<S> saveAllAndFlush(Iterable<S> entities) {
        return cauhoiRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Cauhoi> entities) {
        cauhoiRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Cauhoi> entities) {
        cauhoiRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        cauhoiRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        cauhoiRepository.deleteAllInBatch();
    }

    @Deprecated
    public Cauhoi getOne(Integer integer) {
        return cauhoiRepository.getOne(integer);
    }

    public Cauhoi getById(Integer integer) {
        return cauhoiRepository.getById(integer);
    }

    public <S extends Cauhoi> List<S> findAll(Example<S> example) {
        return cauhoiRepository.findAll(example);
    }

    public <S extends Cauhoi> List<S> findAll(Example<S> example, Sort sort) {
        return cauhoiRepository.findAll(example, sort);
    }

    public Page<Cauhoi> findAll(Pageable pageable) {
        return cauhoiRepository.findAll(pageable);
    }

    public <S extends Cauhoi> S save(S entity) {
        return cauhoiRepository.save(entity);
    }

    public Optional<Cauhoi> findById(Integer integer) {
        return cauhoiRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return cauhoiRepository.existsById(integer);
    }

    public long count() {
        return cauhoiRepository.count();
    }

    public void deleteById(Integer integer) {
        cauhoiRepository.deleteById(integer);
    }

    public void delete(Cauhoi entity) {
        cauhoiRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        cauhoiRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Cauhoi> entities) {
        cauhoiRepository.deleteAll(entities);
    }

    public void deleteAll() {
        cauhoiRepository.deleteAll();
    }

    public <S extends Cauhoi> Optional<S> findOne(Example<S> example) {
        return cauhoiRepository.findOne(example);
    }

    public <S extends Cauhoi> Page<S> findAll(Example<S> example, Pageable pageable) {
        return cauhoiRepository.findAll(example, pageable);
    }

    public <S extends Cauhoi> long count(Example<S> example) {
        return cauhoiRepository.count(example);
    }

    public <S extends Cauhoi> boolean exists(Example<S> example) {
        return cauhoiRepository.exists(example);
    }

    public <S extends Cauhoi, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return cauhoiRepository.findBy(example, queryFunction);
    }
}
