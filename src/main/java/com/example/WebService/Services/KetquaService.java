package com.example.WebService.Services;

import com.example.WebService.DTO.KetquaDto;
import com.example.WebService.Entity_BangLaiXe.Ketqua;
import com.example.WebService.Repositories.KetquaRepository;
import org.modelmapper.ModelMapper;
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
public class KetquaService {
    @Autowired
    private KetquaRepository repo;

    @Autowired
    private ModelMapper modelMapper;

    public List<KetquaDto> findAll() {
        return repo.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<Ketqua> findAll(Sort sort) {
        return repo.findAll(sort);
    }

    public List<Ketqua> findAllById(Iterable<Integer> integers) {
        return repo.findAllById(integers);
    }

    public <S extends Ketqua> List<S> saveAll(Iterable<S> entities) {
        return repo.saveAll(entities);
    }

    public void flush() {
        repo.flush();
    }

    public <S extends Ketqua> S saveAndFlush(S entity) {
        return repo.saveAndFlush(entity);
    }

    public <S extends Ketqua> List<S> saveAllAndFlush(Iterable<S> entities) {
        return repo.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Ketqua> entities) {
        repo.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Ketqua> entities) {
        repo.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        repo.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        repo.deleteAllInBatch();
    }

    @Deprecated
    public Ketqua getOne(Integer integer) {
        return repo.getOne(integer);
    }

    public Ketqua getById(Integer integer) {
        return repo.getById(integer);
    }

    public <S extends Ketqua> List<S> findAll(Example<S> example) {
        return repo.findAll(example);
    }

    public <S extends Ketqua> List<S> findAll(Example<S> example, Sort sort) {
        return repo.findAll(example, sort);
    }

    public Page<Ketqua> findAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public <S extends Ketqua> S save(S entity) {
        return repo.save(entity);
    }

    public Optional<Ketqua> findById(Integer integer) {
        return repo.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return repo.existsById(integer);
    }

    public long count() {
        return repo.count();
    }

    public void deleteById(Integer integer) {
        repo.deleteById(integer);
    }

    public void delete(Ketqua entity) {
        repo.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        repo.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Ketqua> entities) {
        repo.deleteAll(entities);
    }

    public void deleteAll() {
        repo.deleteAll();
    }

    public <S extends Ketqua> Optional<S> findOne(Example<S> example) {
        return repo.findOne(example);
    }

    public <S extends Ketqua> Page<S> findAll(Example<S> example, Pageable pageable) {
        return repo.findAll(example, pageable);
    }

    public <S extends Ketqua> long count(Example<S> example) {
        return repo.count(example);
    }

    public <S extends Ketqua> boolean exists(Example<S> example) {
        return repo.exists(example);
    }

    public <S extends Ketqua, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return repo.findBy(example, queryFunction);
    }

    public KetquaDto convertToDto(Ketqua ety) {

        KetquaDto Dto = new KetquaDto(ety.getId(), ety.getPhuongan(), ety.getMacauhoi().getMacauhoi(), ety.getMauser().getEmail());
        return Dto;
    }
}
