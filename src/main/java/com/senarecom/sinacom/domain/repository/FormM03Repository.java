package com.senarecom.sinacom.domain.repository;

import com.senarecom.sinacom.domain.FormM03;

import java.util.List;
import java.util.Optional;

public interface FormM03Repository {
    List<FormM03> getAll();
    Optional<List<FormM03>> getByProductPresentation(int productPresentationId);
    Optional<FormM03> getFormM03(int formM03Id);
    FormM03 save(FormM03 formM03);
    void delete(int formM03Id);
}
