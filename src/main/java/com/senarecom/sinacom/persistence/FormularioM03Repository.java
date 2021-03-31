package com.senarecom.sinacom.persistence;

import com.senarecom.sinacom.domain.FormM03;
import com.senarecom.sinacom.domain.repository.FormM03Repository;
import com.senarecom.sinacom.persistence.crud.FormularioM03CrudRepository;
import com.senarecom.sinacom.persistence.entity.FormularioM03;
import com.senarecom.sinacom.persistence.mapper.FormM03Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FormularioM03Repository implements FormM03Repository {

    @Autowired
    private FormularioM03CrudRepository formularioM03CrudRepository;

    @Autowired
    private FormM03Mapper mapper;

    @Override
    public List<FormM03> getAll(){
        List<FormularioM03> formularioM03s = (List<FormularioM03>) formularioM03CrudRepository.findAll();
        return mapper.toFormM03s(formularioM03s);
    }

    @Override
    public Optional<List<FormM03>> getByProductPresentation(int productPresentationId) {
        List<FormularioM03> formularioM03s = formularioM03CrudRepository.findByIdPresentacionProductoOrderByIdFormularioM03Asc(productPresentationId);
        return Optional.of(mapper.toFormM03s(formularioM03s) );
    }

    @Override
    public  Optional<FormM03> getFormM03(int formM03Id) {
        return formularioM03CrudRepository.findById(formM03Id).map(formularioM03 -> mapper.toFormM03(formularioM03));
    }

    @Override
    public FormM03 save(FormM03 formM03) {
        FormularioM03 formularioM03 = mapper.toFormularioM03(formM03);
        return mapper.toFormM03(formularioM03CrudRepository.save(formularioM03));
    }

    @Override
    public void delete(int formM03Id){
        formularioM03CrudRepository.deleteById(formM03Id);
    }
}
