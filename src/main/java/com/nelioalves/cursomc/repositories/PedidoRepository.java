package com.nelioalves.cursomc.repositories;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.domain.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.awt.print.Pageable;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    @Transactional(readOnly = true)
    Page<Pedido> findByCliente(Cliente cliente, PageRequest pageRequest);

    }

