package com.JuanMicroservicios.Microservicios.Repository;

import com.JuanMicroservicios.Microservicios.Model.veterinary_client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <veterinary_client, Integer>{


}
