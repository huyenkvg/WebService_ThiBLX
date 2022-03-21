package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.ChiTietDeThiDto;
import com.example.WebService.Entity_BangLaiXe.ChiTietDeThi;
import com.example.WebService.Entity_BangLaiXe.ChiTietDeThiPK;
import com.example.WebService.Repositories.ChiTietDeThiRepository;
import com.example.WebService.Services.ChiTietDeThiService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ChiTietDeThiServiceImpl implements ChiTietDeThiService {
    @Autowired
    private ChiTietDeThiRepository chiTietDeThiRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<ChiTietDeThiDto> findAll() {
        return (List<ChiTietDeThiDto>) chiTietDeThiRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ChiTietDeThi> findAll(Sort sort) {
        return chiTietDeThiRepository.findAll(sort);
    }

    @Override
    public List<ChiTietDeThi> findAllById(Iterable<ChiTietDeThiPK> chiTietDeThiPKS) {
        return chiTietDeThiRepository.findAllById(chiTietDeThiPKS);
    }

    @Override
    public <S extends ChiTietDeThi> List<S> saveAll(Iterable<S> entities) {
        return chiTietDeThiRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        chiTietDeThiRepository.flush();
    }

    @Override
    public <S extends ChiTietDeThi> S saveAndFlush(S entity) {
        return chiTietDeThiRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends ChiTietDeThi> List<S> saveAllAndFlush(Iterable<S> entities) {
        return chiTietDeThiRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<ChiTietDeThi> entities) {
        chiTietDeThiRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<ChiTietDeThi> entities) {
        chiTietDeThiRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<ChiTietDeThiPK> chiTietDeThiPKS) {
        chiTietDeThiRepository.deleteAllByIdInBatch(chiTietDeThiPKS);
    }

    @Override
    public void deleteAllInBatch() {
        chiTietDeThiRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public ChiTietDeThi getOne(ChiTietDeThiPK chiTietDeThiPK) {
        return chiTietDeThiRepository.getOne(chiTietDeThiPK);
    }

    @Override
    public ChiTietDeThi getById(ChiTietDeThiPK chiTietDeThiPK) {
        return chiTietDeThiRepository.getById(chiTietDeThiPK);
    }

    @Override
    public <S extends ChiTietDeThi> List<S> findAll(Example<S> example) {
        return chiTietDeThiRepository.findAll(example);
    }

    @Override
    public <S extends ChiTietDeThi> List<S> findAll(Example<S> example, Sort sort) {
        return chiTietDeThiRepository.findAll(example, sort);
    }

    @Override
    public Page<ChiTietDeThi> findAll(Pageable pageable) {
        return chiTietDeThiRepository.findAll(pageable);
    }

    @Override
    public <S extends ChiTietDeThi> S save(S entity) {
        return chiTietDeThiRepository.save(entity);
    }

    @Override
    public Optional<ChiTietDeThi> findById(ChiTietDeThiPK chiTietDeThiPK) {
        return chiTietDeThiRepository.findById(chiTietDeThiPK);
    }

    @Override
    public boolean existsById(ChiTietDeThiPK chiTietDeThiPK) {
        return chiTietDeThiRepository.existsById(chiTietDeThiPK);
    }

    @Override
    public long count() {
        return chiTietDeThiRepository.count();
    }

    @Override
    public void deleteById(ChiTietDeThiPK chiTietDeThiPK) {
        chiTietDeThiRepository.deleteById(chiTietDeThiPK);
    }

    @Override
    public void delete(ChiTietDeThi entity) {
        chiTietDeThiRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends ChiTietDeThiPK> chiTietDeThiPKS) {
        chiTietDeThiRepository.deleteAllById(chiTietDeThiPKS);
    }

    @Override
    public void deleteAll(Iterable<? extends ChiTietDeThi> entities) {
        chiTietDeThiRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        chiTietDeThiRepository.deleteAll();
    }

    @Override
    public <S extends ChiTietDeThi> Optional<S> findOne(Example<S> example) {
        return chiTietDeThiRepository.findOne(example);
    }

    @Override
    public <S extends ChiTietDeThi> Page<S> findAll(Example<S> example, Pageable pageable) {
        return chiTietDeThiRepository.findAll(example, pageable);
    }

    @Override
    public <S extends ChiTietDeThi> long count(Example<S> example) {
        return chiTietDeThiRepository.count(example);
    }

    @Override
    public <S extends ChiTietDeThi> boolean exists(Example<S> example) {
        return chiTietDeThiRepository.exists(example);
    }

    @Override
    public <S extends ChiTietDeThi, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return chiTietDeThiRepository.findBy(example, queryFunction);
    }

    public ChiTietDeThiDto convertToDto(ChiTietDeThi ety) {

        ChiTietDeThiDto Dto = new ChiTietDeThiDto(ety.getChiTietDeThiPK().getMabodethi(),ety.getChiTietDeThiPK().getMacauhoi());
        return Dto;
    }
    public ChiTietDeThi convertToEntity(ChiTietDeThiDto dTO) throws ParseException {
        ChiTietDeThi ety = null;

        return ety;
    }
}
