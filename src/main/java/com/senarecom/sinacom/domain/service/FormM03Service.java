package com.senarecom.sinacom.domain.service;

import com.senarecom.sinacom.domain.FormM03;
import com.senarecom.sinacom.domain.repository.FormM03Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormM03Service {
    @Autowired
    private FormM03Repository formM03Repository;

    public List<FormM03> getAll(){
        return formM03Repository.getAll();
    }
    public Optional<FormM03> getFormM03(int formM03Id){
        return formM03Repository.getFormM03(formM03Id);
    }

    public Optional<List<FormM03>> getByProductPresentation(int productPresentationId){
        return formM03Repository.getByProductPresentation(productPresentationId);
    }

    public FormM03 save(FormM03 formM03){
        return formM03Repository.save(formM03);
    }

    public boolean delete(int formM03Id){
        return getFormM03(formM03Id).map(formM03 -> {
            formM03Repository.delete(formM03Id);
            return true;
        }).orElse(false);
    }


}
