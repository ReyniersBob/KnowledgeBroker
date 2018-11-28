package service;

import domein.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.NotaRepository;

import java.util.List;

@Service
public class NotaService implements INotaService{

    @Autowired
    private NotaRepository repository;

    @Override
    public List<Nota> findAll() {
        return (List<Nota>) repository.findAll();
    }
}
