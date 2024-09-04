package com.jabros.Inventory_management_system.repository;

import com.jabros.Inventory_management_system.Modal.InventoryItem;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class InventoryRepositoryImp implements InventoryRepository {
    @Override
    public void flush() {

    }

    @Override
    public <S extends InventoryItem> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends InventoryItem> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<InventoryItem> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public InventoryItem getOne(Long aLong) {
        return null;
    }

    @Override
    public InventoryItem getById(Long aLong) {
        return null;
    }

    @Override
    public InventoryItem getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends InventoryItem> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends InventoryItem> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends InventoryItem> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends InventoryItem> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends InventoryItem> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends InventoryItem> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends InventoryItem, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends InventoryItem> S save(S entity) {
        return null;
    }

    @Override
    public <S extends InventoryItem> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<InventoryItem> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<InventoryItem> findAll() {
        return null;
    }

    @Override
    public List<InventoryItem> findAllById(Iterable<Long> longs) {
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
    public void delete(InventoryItem entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends InventoryItem> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<InventoryItem> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<InventoryItem> findAll(Pageable pageable) {
        return null;
    }
}
