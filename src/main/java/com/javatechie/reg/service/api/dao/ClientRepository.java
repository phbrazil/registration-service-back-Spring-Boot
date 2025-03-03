package com.javatechie.reg.service.api.dao;

import com.javatechie.reg.service.api.model.Cliente;
import com.javatechie.reg.service.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Cliente,Integer> {
      Boolean existsByEmail(String email);
      Boolean existsByCpf(String cpf);
      List<Cliente> findByCpf(String cpf);
      List<Cliente> findByEmail(String email);

}


