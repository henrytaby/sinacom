package com.senarecom.sinacom.web.controller;

import com.senarecom.sinacom.domain.FormM03;
import com.senarecom.sinacom.domain.service.FormM03Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("formm03")
public class FormM03Controller {
    @Autowired
    private FormM03Service formM03Service;

    @GetMapping("/all")
    public List<FormM03> getAll(){
        return formM03Service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<FormM03> getFormM03(@PathVariable("id")  int formM03Id){
        return formM03Service.getFormM03(formM03Id);
    }

    @GetMapping("/productPresentation/{id}")
    public Optional<List<FormM03>> getByProductPresentation(@PathVariable("id") int productPresentationId){
        return formM03Service.getByProductPresentation(productPresentationId);
    }

    @PostMapping("/save")
    public FormM03 save (@RequestBody FormM03 formM03){
        return formM03Service.save(formM03);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int formM03Id){
        return formM03Service.delete(formM03Id);
    }

}
