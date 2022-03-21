package com.example.WebService.Services.Impl;

import com.example.WebService.DTO.UserDto;
import com.example.WebService.Entity_BangLaiXe.User;
import com.example.WebService.Entity_BangLaiXe.User;
import com.example.WebService.Repositories.UserRepository;
import com.example.WebService.Services.UserService;
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
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    public UserDto convertToDto(User ety) {

        UserDto Dto = new UserDto(ety.getEmail(),ety.getHoten(),ety.getSdt());
        return Dto;
    }
    public List<UserDto> findAll() {
        return userRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<User> findAll(Sort sort) {
        return userRepository.findAll(sort);
    }

    public List<User> findAllById(Iterable<String> strings) {
        return userRepository.findAllById(strings);
    }

    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return userRepository.saveAll(entities);
    }

    public void flush() {
        userRepository.flush();
    }

    public <S extends User> S saveAndFlush(S entity) {
        return userRepository.saveAndFlush(entity);
    }

    public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
        return userRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<User> entities) {
        userRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<User> entities) {
        userRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<String> strings) {
        userRepository.deleteAllByIdInBatch(strings);
    }

    public void deleteAllInBatch() {
        userRepository.deleteAllInBatch();
    }

    @Deprecated
    public User getOne(String s) {
        return userRepository.getOne(s);
    }

    public User getById(String s) {
        return userRepository.getById(s);
    }

    public <S extends User> List<S> findAll(Example<S> example) {
        return userRepository.findAll(example);
    }

    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return userRepository.findAll(example, sort);
    }

    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public <S extends User> S save(S entity) {
        return userRepository.save(entity);
    }

    public Optional<User> findById(String s) {
        return userRepository.findById(s);
    }

    public boolean existsById(String s) {
        return userRepository.existsById(s);
    }

    public long count() {
        return userRepository.count();
    }

    public void deleteById(String s) {
        userRepository.deleteById(s);
    }

    public void delete(User entity) {
        userRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends String> strings) {
        userRepository.deleteAllById(strings);
    }

    public void deleteAll(Iterable<? extends User> entities) {
        userRepository.deleteAll(entities);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public <S extends User> Optional<S> findOne(Example<S> example) {
        return userRepository.findOne(example);
    }

    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return userRepository.findAll(example, pageable);
    }

    public <S extends User> long count(Example<S> example) {
        return userRepository.count(example);
    }

    public <S extends User> boolean exists(Example<S> example) {
        return userRepository.exists(example);
    }

    public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return userRepository.findBy(example, queryFunction);
    }
}
