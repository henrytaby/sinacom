package com.senarecom.sinacom.persistence.crud;

import com.senarecom.sinacom.persistence.entity.FormularioM03;
import org.springframework.data.repository.CrudRepository;

import java.text.Normalizer;
import java.util.List;
import java.util.Optional;

public interface FormularioM03CrudRepository extends CrudRepository<FormularioM03, Integer> {


    List<FormularioM03> findByIdPresentacionProductoOrderByIdFormularioM03Asc(int idPresentacionProducto);

}
