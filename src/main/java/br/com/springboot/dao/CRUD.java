package br.com.springboot.dao;

import java.util.List;

public interface CRUD <T, ID>{
    T pessquisaClientePeloID(ID id); // pesquisa cliente pelo id
    List<T> lista(); // lista todos os cadastros de clientes
    void inserirCliente(T t); //inseri o cliente
    void atualizarCliente(T t); //atualiza  o cliete
    void removerCliente(T t); // remove o cliente


}
