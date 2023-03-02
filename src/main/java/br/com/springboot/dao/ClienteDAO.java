package br.com.springboot.dao;

import br.com.springboot.model.Cliente;
import jakarta.persistence.EntityManager;//JPA = jakarta.persistence api
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
Classe de acesso a dados
Irá ser feito os metodos que persistem os dados do cliente
usando o framework JPA do SpringBoot(Hibernate)*/
@Repository
public class ClienteDAO implements  CRUD<Cliente, Long> {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Cliente pessquisaClientePeloID(Long aLong) {
        return entityManager.find(Cliente.class, id);
    }

    @Override
    public List<Cliente> lista() {
        Query query = entityManager.createQuery("Select c from Cliente c");
        return (List<Cliente>) query.getResultList();
    }

    @Override
    public void inserirCliente(Cliente cliente) {
    entityManager.persist(cliente);
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
    entityManager.merge(cliente);
    }

    @Override
    public void removerCliente(Cliente cliente) {
    entityManager.remove(cliente);
    }
}
